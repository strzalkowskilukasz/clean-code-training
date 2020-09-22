package pl.training;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest {

    private TicTacToe ticTacToe = new TicTacToe();

    @DisplayName("Should end game when all fields are taken")
    @Test
    public void shouldEndGameWhenAllFieldsAreTaken() {
        ticTacToe = new TicTacToe(Set.of(1, 3, 5, 8), Set.of(2, 4, 6, 7));
        ticTacToe.makeMove(9);
        assertTrue(ticTacToe.isGameOver());
    }

    @DisplayName("Should end game when player took winning sequence")
    @Test
    public void shouldEndGameWhenPlayerTookWinningSequence() {
        ticTacToe = new TicTacToe(Set.of(1, 2, 3), Set.of(4, 8, 9));
        assertTrue(ticTacToe.isGameOver());
    }

    @DisplayName("Should allow only free fields to be taken")
    @Test
    public void shouldAllowOnlyFreeFieldsToBeTaken() {
        ticTacToe.makeMove(1);
        assertFalse(ticTacToe.makeMove(1));
    }

    @DisplayName("Should change player after field is taken")
    @Test
    public void shouldChangePlayerAfterFieldIsTaken() {
        Player player = ticTacToe.getPlayer();
        ticTacToe.makeMove(1);
        assertNotEquals(ticTacToe.getPlayer(), player);
    }

    @DisplayName("Should not change player after field is not taken")
    @Test
    public void shouldNotChangePlayerAfterFieldIsNotTaken() {
        ticTacToe.makeMove(1);
        Player player = ticTacToe.getPlayer();
        ticTacToe.makeMove(1);
        assertEquals(ticTacToe.getPlayer(), player);
    }

    @DisplayName("Should throw exception when initial game state is invalid")
    @Test
    public void shouldThrowExceptionWhenInitialGameStateIsInvalid() {
        assertThrows(IllegalArgumentException.class, () -> new TicTacToe(Set.of(1, 3, 5, 8), Set.of(1, 4, 6, 7, 9)));
    }

}