package changes;

public class LocationUnbuiltException extends RuntimeException {

    LocationUnbuiltException() {
        super("Локация разрушена, так как была недостроена вовремя");
    }

}
