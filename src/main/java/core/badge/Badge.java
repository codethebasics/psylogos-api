package core.badge;

public final class Badge {
    private final String id;
    private final String name;
    private final String description;
    private final Boolean unlocked;

    public Badge(String id, String name, String description, Boolean unlocked) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.unlocked = unlocked;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getUnlocked() {
        return unlocked;
    }
}
