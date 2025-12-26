package core.screen;

public final class ScreenTimeEntry {
    private final String id;
    private final String platform;
    private final String otherPlatformDetails;
    private final String duration;

    public ScreenTimeEntry(String id, String platform, String otherPlatformDetails, String duration) {
        this.id = id;
        this.platform = platform;
        this.otherPlatformDetails = otherPlatformDetails;
        this.duration = duration;
    }

    public String getId() {
        return id;
    }

    public String getPlatform() {
        return platform;
    }

    public String getOtherPlatformDetails() {
        return otherPlatformDetails;
    }

    public String getDuration() {
        return duration;
    }
}
