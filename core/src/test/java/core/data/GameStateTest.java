package core.data;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameStateTest {

    @Test
    @DisplayName("Deve criar um GameState")
    void shouldCreateGameState() {
        GameState gameState = GameState.builder()
                .user(new User.Builder()
                        .nickname("Nick")
                        .avatar("avatar.png")
                        .level(1)
                        .build())
                .build();

        assertNotNull(gameState);
        assertNotNull(gameState.getUser());
    }
}