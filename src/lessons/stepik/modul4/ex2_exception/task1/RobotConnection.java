package lessons.stepik.modul4.ex2_exception.task1;

public interface RobotConnection extends AutoCloseable{
    @Override
    void close() throws Exception;
    void moveRobotTo(int x, int y);
}
