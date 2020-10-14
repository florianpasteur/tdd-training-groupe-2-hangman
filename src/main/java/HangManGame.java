import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HangManGame {
    private final String secretWord;
    private char letter;

    public HangManGame(String secretWord) {
        this.secretWord = secretWord;
    }

    public String hint() {
        return Stream.of(this.secretWord.split(""))
                .map(letter -> {
                    if (letter.equals(this.letter + "")) {
                        return letter;
                    }
                    if (letter.matches("[a-zA-Z]")) {
                        return  "_";
                    }
                    return letter;
                }).collect(Collectors.joining(""));
    }

    public void guess(char letter) {
        this.letter = letter;
    }
}
