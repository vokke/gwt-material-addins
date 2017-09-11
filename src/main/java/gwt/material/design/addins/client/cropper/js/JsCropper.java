package gwt.material.design.addins.client.cropper.js;

import com.google.gwt.dom.client.Element;
import gwt.material.design.jquery.client.api.JQueryElement;
import gwt.material.design.jquery.client.api.Promise;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * JSInterop util for Image Cropping Component
 *
 * @author kevzlou7979
 */
@JsType(isNative = true)
public class JsCropper extends JQueryElement {

    @JsMethod(name = "$", namespace = JsPackage.GLOBAL)
    public static native JsCropper $(JQueryElement element);

    @JsMethod(name = "$", namespace = JsPackage.GLOBAL)
    public static native JsCropper $(Element element);

    @JsMethod(name = "$", namespace = JsPackage.GLOBAL)
    public static native JsCropper $(String selector);

    @JsMethod
    public native JsCropper croppie();

    @JsMethod
    public native JsCropper croppie(JsCropperOptions options);

    @JsMethod
    public native Promise croppie(String method, Object... args);
}