package core.data;

public final class SamResponse {
    private final Integer pleasure;
    private final Integer arousal;
    private final Integer dominance;

    public SamResponse(Integer pleasure, Integer arousal, Integer dominance) {
        this.pleasure = pleasure;
        this.arousal = arousal;
        this.dominance = dominance;
    }

    public Integer getPleasure() {
        return pleasure;
    }

    public Integer getArousal() {
        return arousal;
    }

    public Integer getDominance() {
        return dominance;
    }
}
