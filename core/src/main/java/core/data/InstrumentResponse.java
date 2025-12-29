package core.data;

import core.enums.InstrumentTypeEnum;

public final class InstrumentResponse {
    private final String timestamp;
    private final Integer pingDay;
    private final Integer pingIndex;
    private final InstrumentTypeEnum type;
    private final SamResponse sam;
    private final Boolean wasWatchingFeed;
    private final PanasResponse panas;
    private final Integer sleepQuality;
    private final String stressfulEvents;
    private final ScreenTimeEntry[] screenTimeLog;

    public InstrumentResponse(
            String timestamp,
            Integer pingDay,
            Integer pingIndex,
            InstrumentTypeEnum type,
            SamResponse sam,
            Boolean wasWatchingFeed,
            PanasResponse panas,
            Integer sleepQuality,
            String stressfulEvents,
            ScreenTimeEntry[] screenTimeLog) {
        this.timestamp = timestamp;
        this.pingDay = pingDay;
        this.pingIndex = pingIndex;
        this.type = type;
        this.sam = sam;
        this.wasWatchingFeed = wasWatchingFeed;
        this.panas = panas;
        this.sleepQuality = sleepQuality;
        this.stressfulEvents = stressfulEvents;
        this.screenTimeLog = screenTimeLog;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public Integer getPingDay() {
        return pingDay;
    }

    public Integer getPingIndex() {
        return pingIndex;
    }

    public InstrumentTypeEnum getType() {
        return type;
    }

    public SamResponse getSam() {
        return sam;
    }

    public Boolean getWasWatchingFeed() {
        return wasWatchingFeed;
    }

    public PanasResponse getPanas() {
        return panas;
    }

    public Integer getSleepQuality() {
        return sleepQuality;
    }

    public String getStressfulEvents() {
        return stressfulEvents;
    }

    public ScreenTimeEntry[] getScreenTimeLog() {
        return screenTimeLog;
    }
}
