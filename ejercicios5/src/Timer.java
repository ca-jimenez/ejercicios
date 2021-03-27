import java.util.Date;

public class Timer {

    private long start;
    private long stop;

    public void start() {
        this.start = new Date().getTime();
    }

    public void stop() {
        this.stop = new Date().getTime();
    }

    public long elapsedTime() throws Exception {

        if (start > 0 && stop > 0) {

            return stop - start;
        } else {
            throw new Exception("timer not started and/or stopped");
        }
    }
}
