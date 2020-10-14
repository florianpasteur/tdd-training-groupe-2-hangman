public class HangManGame {
    private final String secretWord;

    public HangManGame(String secretWord) {
        this.secretWord = secretWord;
    }

    public String hint() {
        return secretWord.replaceAll("[a-zA-Z]", "_");
    }
}
