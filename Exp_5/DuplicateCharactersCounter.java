package Exp_5;

public class DuplicateCharactersCounter {
    public static void main(String[] args) {
        String str = "Better Butter";
        findDuplicateCharacters(str);
    }

    public static void findDuplicateCharacters(String str) {
        str = str.toLowerCase();
        int[] charCounts = new int[256];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                charCounts[ch]++;
            }
        }
        System.out.println("Duplicate characters and their counts:");
        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] > 1) {
                System.out.println((char) i + " : " + charCounts[i]);
            }
        }
    }
}
