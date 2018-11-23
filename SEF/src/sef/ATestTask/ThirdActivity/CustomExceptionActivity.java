package sef.ATestTask.ThirdActivity;

public class CustomExceptionActivity extends Throwable {
    @Override
    public String getMessage() {
        return "privetik";
    }
}
