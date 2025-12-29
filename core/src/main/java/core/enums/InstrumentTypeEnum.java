package core.enums;

public enum InstrumentTypeEnum {
    REGULAR("Regular"),
    END_OF_DAY("End of day");

    private final String type;

    InstrumentTypeEnum(String type) {
        this.type = type;
    }
}
