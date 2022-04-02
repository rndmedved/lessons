package lessons.stepik.modul3.ex5.Example3;

public class Timer{
    public long measureTime(Runnable runnable){
        long startTime = System.currentTimeMillis();
        runnable.run();
        return System.currentTimeMillis() - startTime;
    }


}
