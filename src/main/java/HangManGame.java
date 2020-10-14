public class HangManGame {
    private String secretWord;

    public HangManGame(String secretWord) {

        this.secretWord = secretWord;
    }

    public String hint() {
        return "_".repeat(secretWord.length());
    }
}
