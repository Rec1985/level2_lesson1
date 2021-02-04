public class RunningRoad extends AbstractCourse{
    private  int distance = 200;

    @Override
    protected void doIt(Participant participant) {
        if (participant.getMaxRunningDistance() >= distance)
            participant.setPassed(true);
        else participant.setPassed(false);
    }
}
