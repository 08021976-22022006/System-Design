package isp;

public class CulturalStudent implements ClubMember, Competitor {
    @Override
    public void joinClub() {
        System.out.println("Joining Club");
    }

    @Override
    public void participateInCompetition() {
        System.out.println("Participating in competitions");       
    }
}
