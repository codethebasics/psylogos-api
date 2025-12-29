package core.data;

public record Badge(
        String id,
        String name,
        String description,
        Boolean unlocked) {
}
