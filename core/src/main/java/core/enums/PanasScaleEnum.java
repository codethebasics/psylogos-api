package core.enums;

public enum PanasScaleEnum {
    NEM_UM_POUCO("Nem um pouco"),
    UM_POUCO("Um pouco"),
    MODERADAMENTE("Moderadamente"),
    BASTANTE("Bastante"),
    EXTREMAMENTE("Extremamente");

    private final String scale;

    PanasScaleEnum(String scale) {
        this.scale = scale;
    }

    public String getScale() {
        return scale;
    }
}
