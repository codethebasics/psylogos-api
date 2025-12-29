package core.data;

public final class PanasResponse {
    private final String[] adjectives;

    public PanasResponse(String[] adjectives) {
        this.adjectives = adjectives;
    }

    public String[] getAdjectives() {
        return adjectives;
    }
}
