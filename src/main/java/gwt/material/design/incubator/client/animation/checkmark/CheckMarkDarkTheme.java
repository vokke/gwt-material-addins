/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2020 GwtMaterialDesign
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
package gwt.material.design.incubator.client.animation.checkmark;

import gwt.material.design.addins.client.dark.AddinsWidgetDarkTheme;
import gwt.material.design.incubator.client.AddinsIncubator;
import gwt.material.design.incubator.client.daterange.DateRangeClientBundle;
import gwt.material.design.incubator.client.daterange.DateRangeClientDebugBundle;

public class CheckMarkDarkTheme extends AddinsWidgetDarkTheme {

    public CheckMarkDarkTheme() {
        super(AddinsIncubator.isDebug() ? CheckMarkClientDebugBundle.INSTANCE.checkMarkDarkCss() : CheckMarkClientBundle.INSTANCE.checkMarkDarkCss());
    }
}
