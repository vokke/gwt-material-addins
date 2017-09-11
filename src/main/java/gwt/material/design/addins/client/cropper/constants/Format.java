package gwt.material.design.addins.client.cropper.constants;

/**
 * Indicating the image format defaults to {@link #PNG}
 *
 * @author kevzlou7979
 */
public enum Format {
    PNG("png"),
    JPEG("jpeg"),
    WEBP("webp");

    private String name;

    Format(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}