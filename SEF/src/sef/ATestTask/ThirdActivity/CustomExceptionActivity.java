package sef.ATestTask.ThirdActivity;

public class CustomExceptionActivity extends Throwable {
    public String getMessage() {
        return "Exception";
    }
}
