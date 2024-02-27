package Exp_5;

public class RotationChecker {
    public static void main(String[] args) {
        String a = "amazon";
        String b = "azonam";
        boolean result = isRotatedByTwoPlaces(a, b);
        System.out.println(result ? "Output: 1" : "Output: 0");
    }

    public static boolean isRotatedByTwoPlaces(String a, String b) {
        int len = a.length();
        if (len != b.length()) {
            return false;
        }
        if (len < 2) {
            return a.equals(b);
        }

        String rotatedClockwise = a.substring(len - 2) + a.substring(0, len - 2);
        if (rotatedClockwise.equals(b)) {
            return true;
        }

        String rotatedAntiClockwise = a.substring(2) + a.substring(0, 2);
        return rotatedAntiClockwise.equals(b);
    }
}
