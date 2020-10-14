import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HangManGameTest {

    /*
       "A" - HINT - > "_"

     */

    @Test
    void should_test() {
        HangManGame game = new HangManGame("a");

        String hint = game.hint();

        assertThat(hint).isEqualTo("_");
    }

    @Test
    void should_test_2() {
        HangManGame game = new HangManGame("abc");

        String hint = game.hint();

        assertThat(hint).isEqualTo("___");
    }

    @Test
    void should_test_3() {
        HangManGame game = new HangManGame("HELLO WORLD");

        String hint = game.hint();

        assertThat(hint).isEqualTo("_____ _____");
    }
}
