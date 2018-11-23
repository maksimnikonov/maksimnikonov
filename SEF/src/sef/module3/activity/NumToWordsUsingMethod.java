/**
 *
 */
package sef.module3.activity;

/**
 * @author
 */
public class NumToWordsUsingMethod {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // complete the code to print text value of 8, 9 and 10
        System.out.println(printMyWord(1));
        System.out.println(printMyWord(3));
        System.out.println(printMyWord(5));
    }

    private static String printMyWord(int i) {
        final String numText;
        switch (i) {
            case 1:
                numText = "ONE";
                break;
            case 2:
                numText = "TWO";
                break;
            case 3:
                numText = "THREE";
                break;
            case 4:
                numText = "FOUR";
                break;
            case 5:
                numText = "FIVE";
                break;
            case 6:
                numText = "SIX";
                break;
            case 7:
                numText = "SEVEN";
                break;
            case 8:
                numText = "EIGHT";
                break;
            case 9:
                numText = "NINE";
                break;
            case 10:
                numText = "TEN";
                break;
            default:
                numText = "NUMBER " + i;
        }
        return "Your number is " + numText;
    }
}
