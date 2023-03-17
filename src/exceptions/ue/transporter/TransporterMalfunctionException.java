package exceptions.ue.transporter;

public class TransporterMalfunctionException extends Exception{


    public TransporterMalfunctionException(String message) {
        super(message);
    }

    public TransporterMalfunctionException(String message, Throwable cause) {
        super(message, cause);
    }
}
