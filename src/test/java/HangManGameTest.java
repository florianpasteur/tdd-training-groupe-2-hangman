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

    @Test
    void should_test_4() {
        HangManGame game = new HangManGame("HELLO WORLD");
        game.guess('H');

        String hint = game.hint();

        assertThat(hint).isEqualTo("H____ _____");
    }

    @Test
    void should_test_5() {
        HangManGame game = new HangManGame("HELLO WORLD");
        game.guess('H');
        game.guess('L');

        String hint = game.hint();

        assertThat(hint).isEqualTo("H_LL_ ___L_");
    }

    @Test
    void should_test_6() {
        HangManGame game = new HangManGame("HELLO WORLD");

        Guess guess = game.guess('B');

        assertThat(guess).isEqualTo(Guess.INCORRECT);
    }

    @Test
    void should_test_7() {
        HangManGame game = new HangManGame("HELLO WORLD");

        Guess guess = game.guess('D');

        assertThat(guess).isEqualTo(Guess.CORRECT);
    }

    @Test
    void should_test_8() {
        HangManGame game = new HangManGame("HELLO WORLD");

        boolean wordComplete = game.wordComplete();

        assertThat(wordComplete).isFalse();
    }

    @Test
    void should_test_9() {
        HangManGame game = new HangManGame("HELLO WORLD");
        game.guess('H');
        game.guess('E');
        game.guess('L');
        game.guess('O');
        game.guess('W');
        game.guess('R');
        game.guess('D');

        boolean wordComplete = game.wordComplete();

        assertThat(wordComplete).isTrue();
    }

    @Test
    void should_test_10() {
        HangManGame game = new HangManGame("HELLO WORLD");
        game.guess('H');
        game.guess('E');
        game.guess('L');


        boolean wordComplete = game.wordComplete();

        assertThat(wordComplete).isFalse();
    }
}
