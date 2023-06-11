package stopwatch;

public class StopWatch {
    public double startTime;
    public double endTime;

    public double StopWatch() {
        return System.currentTimeMillis();
    }

    public double start() {
        return startTime = System.currentTimeMillis();
    }

    public double stop() {
        return endTime = System.currentTimeMillis();
    }

    public double getElapsedTime() {
        return endTime - startTime;
    }
}
