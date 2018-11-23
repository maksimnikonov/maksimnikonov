package sef.ATestTask.ThirdActivity;

public class CustomExeptionActivity extends Throwable {

    public String getMessage() {

        return "You are not allowed to use this program";
    }
}
