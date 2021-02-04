public class SwimmingPool extends AbstractCourse {
    private  int distance = 50;

    @Override
    protected void doIt(Participant participant) {
        participant.setPassed(participant.getMaxSwiminggDistance() >= distance);
    }
}
