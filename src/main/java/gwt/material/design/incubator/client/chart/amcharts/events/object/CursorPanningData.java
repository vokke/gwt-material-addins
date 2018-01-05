/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2018 GwtMaterialDesign
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
package gwt.material.design.incubator.client.chart.amcharts.events.object;

import gwt.material.design.incubator.client.chart.amcharts.js.AmChart;
import gwt.material.design.incubator.client.chart.amcharts.js.options.AmChartCursor;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class CursorPanningData {

    @JsProperty
    private String type;

    @JsProperty
    private int x;

    @JsProperty
    private int y;

    @JsProperty
    private int index;

    @JsProperty
    private AmChart chart;

    @JsProperty
    private AmChartCursor target;

    @JsProperty
    private int deltaX;

    @JsProperty
    private int deltaY;

    @JsProperty
    private int delta2X;

    @JsProperty
    private int delta2Y;

    @JsOverlay
    public final String getType() {
        return type;
    }

    @JsOverlay
    public final int getX() {
        return x;
    }

    @JsOverlay
    public final int getY() {
        return y;
    }

    @JsOverlay
    public final int getIndex() {
        return index;
    }

    @JsOverlay
    public final AmChart getChart() {
        return chart;
    }

    @JsOverlay
    public final AmChartCursor getTarget() {
        return target;
    }

    @JsOverlay
    public final int getDeltaX() {
        return deltaX;
    }

    @JsOverlay
    public final int getDeltaY() {
        return deltaY;
    }

    @JsOverlay
    public final int getDelta2X() {
        return delta2X;
    }

    @JsOverlay
    public final int getDelta2Y() {
        return delta2Y;
    }
}
