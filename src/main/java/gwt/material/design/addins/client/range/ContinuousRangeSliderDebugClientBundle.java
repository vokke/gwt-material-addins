/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2017 GwtMaterialDesign
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
package gwt.material.design.addins.client.range;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

/**
 * Client Bundle for PathAnimator component
 *
 * @author kevzlou7979
 */
interface ContinuousRangeSliderDebugClientBundle extends ClientBundle {

    ContinuousRangeSliderDebugClientBundle INSTANCE = GWT.create(ContinuousRangeSliderDebugClientBundle.class);

    @Source("resources/js/continuous-range.js")
    TextResource continuousRangeJs();

    @Source("resources/css/continuous-range.css")
    TextResource continuousRangeCss();
}
