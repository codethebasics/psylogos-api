package core.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadgeTest {

    @Test
    void shouldCreateBadge() {
        Badge badge = new Badge("1", "badge", "description", true);
        assertNotNull(badge, "O badge não deveria ser nulo");
        assertEquals("1", badge.id(), "valor esperado: 1");
        assertEquals("badge", badge.name(), "valor esperado: badge");
        assertEquals("description", badge.description(), "valor esperado: description");
        assertTrue(badge.unlocked(), "Deveria ser unlocked");
    }
}