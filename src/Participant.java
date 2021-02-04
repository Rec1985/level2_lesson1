public class Participant {
    private String name;
    private boolean isPassed;
    private int maxRunningDistance;
    private int maxSwiminggDistance;

    public Participant(String name, int maxRunningDistance, int maxSwiminggDistance) {
        this.name = name;
        this.maxRunningDistance = maxRunningDistance;
        this.maxSwiminggDistance = maxSwiminggDistance;
    }

    public int getMaxRunningDistance() {
        return maxRunningDistance;
    }

    public int getMaxSwiminggDistance() {
        return maxSwiminggDistance;
    }

    public boolean isPassed() {
        return isPassed;
    }

    public void setPassed(boolean passed) {
        isPassed = passed;
    }

    @Override
    public String toString() {
        return "Participant{" +
                "name='" + name + '\'' +
                ", isPassed=" + isPassed +
                ", maxRunningDistance=" + maxRunningDistance +
                ", maxSwiminggDistance=" + maxSwiminggDistance +
                '}';
    }
}
