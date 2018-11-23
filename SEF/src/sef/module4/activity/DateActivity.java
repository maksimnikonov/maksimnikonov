package sef.module4.activity;

import java.util.Date;

public class DateActivity {

    public static void main (String args[]) {
        Date todayDate = new Date();
        System.out.println(todayDate);
        Date myBirthday = new Date(89, 11, 4);
        System.out.println(myBirthday);
    }
}
