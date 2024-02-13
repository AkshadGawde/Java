package Exp_4;

public class StringHelper {

    public String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    public String concatenate(String str1, String str2, String str3) {
        return str1 + str2 + str3;
    }

    public static void main(String[] args) {

        StringHelper stringHelper = new StringHelper();

        String result1 = stringHelper.concatenate("Hello, ", "world!");
        System.out.println("Concatenated string (two parameters): " + result1);

        String result2 = stringHelper.concatenate("Java ", "is ", "awesome!");
        System.out.println("Concatenated string (three parameters): " + result2);
    }
}