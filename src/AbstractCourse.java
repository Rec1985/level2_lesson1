public abstract class AbstractCourse implements Course {
    @Override
    public void doIt(Team team){
        for (int i = 0; i < team.getParticipant().length ; i++) {
            doIt(team.getParticipant()[i]);
        }
    }

    protected abstract void doIt(Participant participant);
}
