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
package gwt.material.design.incubator.client.question;

import gwt.material.design.addins.client.signature.MaterialSignaturePad;
import gwt.material.design.client.constants.Color;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.incubator.client.base.constants.IncubatorCssName;
import gwt.material.design.incubator.client.question.base.AbstractQuestion;

public class SignatureValidation extends AbstractQuestion {

    private MaterialButton btnClear = new MaterialButton();
    private MaterialSignaturePad signaturePad = new MaterialSignaturePad();

    @Override
    protected void load() {
        btnClear.setBackgroundColor(Color.WHITE);
        btnClear.setTextColor(Color.BLACK);
        btnClear.setText("Clear");
        btnClear.addClickHandler(clickEvent -> getSignaturePad().clear());
        getWrapper().setMargin(0);
        addStyleName(IncubatorCssName.SIGNATURE_VALIDATION);
        getWrapper().add(signaturePad);
        add(btnClear);
    }

    @Override
    public void reset() {
        signaturePad.reset();
    }

    public MaterialSignaturePad getSignaturePad() {
        return signaturePad;
    }
}
