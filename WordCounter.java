import java.util.Scanner;

public class WordCounter {
    
    // Method to get sentence input from user
    public static String getSentenceInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        return sentence;
    }
    
    // Method to count words in the sentence
    public static int countWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0;
        }
        String[] words = sentence.trim().split("\\s+"); // Splitting by whitespace
        return words.length;
    }
    
    public static void main(String[] args) {
        // Get user input
        String sentence = getSentenceInput();
        
        // Count words in the sentence
        int wordCount = countWords(sentence);
        
        // Display the result
        System.out.println("The sentence has " + wordCount + " words.");
    }
}
