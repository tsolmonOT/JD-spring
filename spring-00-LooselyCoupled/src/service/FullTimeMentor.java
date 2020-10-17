package service;
//Service includes all business logic
import implementation.Mentor;

public class FullTimeMentor implements Mentor {
    @Override
    public void createAccount() {
        System.out.println("Full Time Mentor is created...");
    }
}
