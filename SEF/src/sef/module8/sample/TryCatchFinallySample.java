package sef.module8.sample;

// Needs to be completed
public class TryCatchFinallySample {

    //The following String variable is declared at class level. It'd automatically be initialized to null.
    String str;

    public static void main(String[] args) {
        //1 - Create an instance of TryCatchFinallySample and call catchMeIfYouCan()
        TryCatchFinallySample tr = new TryCatchFinallySample();
        tr.str = "qew";
        tr.catchMeIfYouCan();
    }

    public void catchMeIfYouCan() {
        try {
            System.out.println(str);
            int x = 12 / 0;
            System.out.println(str.toUpperCase());
        } catch (NullPointerException nullExeption) {
            System.out.println("The str is null");
        } catch (Exception e) {
        } finally {
            System.out.println("This is a final");
        }
        System.out.println("This is the last row");
    }
}
