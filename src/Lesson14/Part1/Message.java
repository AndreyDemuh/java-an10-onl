package Lesson14.Part1;

public enum Message {
    MESSAGE1 ("Привет, "),
    MESSAGE2 ("как дела? "),
    MESSAGE3 ("что делаешь? ");

    private final String message;

    Message(String message) {
        this.message = message;
    }
    @Override
    public String toString() {
        return message;
    }
}

