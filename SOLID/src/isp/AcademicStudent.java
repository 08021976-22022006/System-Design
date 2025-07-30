package isp;

public class AcademicStudent implements AssignmentSubmitter, ClassAttendee {

    @Override
    public void attendClass() {
        System.out.println("Attending Classes");
    }

    @Override
    public void submitAssignments() {
        System.out.println("Submitting Assignments");
    }

}
