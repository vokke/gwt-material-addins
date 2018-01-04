/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2016 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package gwt.material.design.incubator.client.chart.amcharts.events;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HasHandlers;
import gwt.material.design.incubator.client.chart.amcharts.events.object.AxisGuideEventData;
//@formatter:off

/**
 * Dispatched when user rolls-out of the guide.
 *
 * @author kevzlou7979
 */
public class RollOutGuideEvent extends GwtEvent<RollOutGuideEvent.RollOutGuideHandler> {

    public static final Type<RollOutGuideHandler> TYPE = new Type<>();
    private AxisGuideEventData data;

    public RollOutGuideEvent(AxisGuideEventData data) {
        this.data = data;
    }

    public static Type<RollOutGuideHandler> getType() {
        return TYPE;
    }

    public static void fire(HasHandlers source, AxisGuideEventData data) {
        source.fireEvent(new RollOutGuideEvent(data));
    }

    @Override
    public Type<RollOutGuideHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(RollOutGuideEvent.RollOutGuideHandler handler) {
        handler.onRollOutGuide(this);
    }

    public AxisGuideEventData getData() {
        return data;
    }

    public interface RollOutGuideHandler extends EventHandler {
        void onRollOutGuide(RollOutGuideEvent event);
    }
}