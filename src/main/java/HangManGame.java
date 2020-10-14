import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HangManGame {
    private final String secretWord;
    private final List<String> guessedLetters = new ArrayList<>();

    public HangManGame(String secretWord) {
        this.secretWord = secretWord;
    }

    public String hint() {
        return Stream.of(this.secretWord.split(""))
                .map(letter -> {
                    if (guessedLetters.contains(letter)) {
                        return letter;
                    }
                    if (letter.matches("[a-zA-Z]")) {
                        return  "_";
                    }
                    return letter;
                }).collect(Collectors.joining(""));
    }

    public Guess guess(char letter) {
        String letterAsString = letter + "";
        guessedLetters.add(letterAsString);
        return secretWord.contains(letterAsString) ? Guess.CORRECT : Guess.INCORRECT;
    }
}
