package changes;

public class IncorrectLocationException extends Exception {

    public IncorrectLocationException() {
        super("Неправильно переданы объекты типа Location");
    }

}
