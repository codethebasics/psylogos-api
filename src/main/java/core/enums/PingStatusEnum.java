package core.enums;

public enum PingStatusEnum {
    COMPLETED(1, "Completed"),
    MISSED(2, "Missed"),
    PENDING(3, "Pending");

    private final int code;
    private final String description;

    PingStatusEnum(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
