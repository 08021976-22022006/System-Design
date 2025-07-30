package isp;

public interface StudentActions {
    void attendClass();
    void submitAssignments();
    void joinClub();
    void participateInCompetition();
}


class AcademicStudent implements StudentActions{

    @Override
    public void attendClass() {
        System.out.println("Attending Class");
    }

    @Override
    public void submitAssignments() {
        System.out.println("Submitting Assignments");
    }

    @Override
    public void joinClub() {
        throw new UnsupportedOperationException("Not interested in joining club");
    }

    @Override
    public void participateInCompetition() {
        throw new UnsupportedOperationException("Not interested in partiicipating");
    }

}
