

public class Main {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));

    }

    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        a *= 1000;
        b *= 1000;
        if ( (int) a == (int) b) {
            return true;
        } else {
            return false;
        }
    }



}
