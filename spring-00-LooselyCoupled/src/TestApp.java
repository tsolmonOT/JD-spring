
import service.MentorAccount;
import service.PartiTimeMentor;

public class TestApp {
    public static void main(String[] args) {
//        FullTimeMentor fullTime = new FullTimeMentor();
        PartiTimeMentor partTime = new PartiTimeMentor();
        MentorAccount mentor = new MentorAccount(partTime);
        mentor.manageAccount();
    }
}
