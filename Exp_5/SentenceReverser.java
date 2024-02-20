package Exp_5;

public class SentenceReverser {
    public static void main(String[] args) {
        String sentence = "Java Concept Of The Day";
        String reversedSentence = reverseSentence(sentence);
        System.out.println("Reversed Sentence: " + reversedSentence);
    }

    public static String reverseSentence(String sentence) {
        StringBuilder reversedSentence = new StringBuilder();
        int wordStart = sentence.length() - 1;
        for (int i = sentence.length() - 1; i >= 0; i--) {
            if (sentence.charAt(i) == ' ' || i == 0) {
                int wordEnd = i == 0 ? 0 : i + 1;
                reversedSentence.append(sentence.substring(wordEnd, wordStart + 1)).append(" ");
                wordStart = i - 1;
            }
        }
        return reversedSentence.toString().trim();
    }
}