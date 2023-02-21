package lessons.stepik.modul4.ex2_exception.task1;

public class RobotConnectionException extends RuntimeException{
    public RobotConnectionException(String message) {
        super(message);

    }

    public RobotConnectionException(String message, Throwable cause) {
        super(message, cause);
    }
}
