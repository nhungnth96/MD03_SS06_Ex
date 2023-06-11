package stopwatch;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        System.out.println(stopWatch.start());
        System.out.println(stopWatch.stop());
        System.out.println("Thoi gian da troi qua: " + stopWatch.getElapsedTime() + " milisecond giay");

    }
}
