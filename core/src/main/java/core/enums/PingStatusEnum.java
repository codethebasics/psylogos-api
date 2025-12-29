package core.enums;

public enum PingStatusEnum {
    COMPLETED( "Completed"),
    MISSED( "Missed"),
    PENDING( "Pending");

    private final String description;

    PingStatusEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
