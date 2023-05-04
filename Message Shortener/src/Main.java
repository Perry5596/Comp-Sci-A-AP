import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the message to be shortened");
        String message = scanner.nextLine().toLowerCase();
        String shortenedMessage = "";
        int vowelCounter = 0;
        int doubleVowelCounter = 0;
        int repeatCounter = 0;

        // Start of Alg 1

        System.out.println("Algorithm 1");

        for (int i = 0; i < message.length() - 1; i++) {
            if (message.charAt(i) != message.charAt(i + 1)) {
                shortenedMessage += message.charAt(i);
            } else if (message.charAt(i) == 'a' || message.charAt(i) == 'e' || message.charAt(i) == 'i' || message.charAt(i) == 'o' || message.charAt(i) == 'u') {
                doubleVowelCounter++;
            }
            else {
                repeatCounter++;
            }
        }
        shortenedMessage += message.charAt(message.length() - 1);

        String shortenedMessage2 = "";
        for (int i = 0; i < shortenedMessage.length(); i++) {
            if (shortenedMessage.charAt(i) == 'a' || shortenedMessage.charAt(i) == 'e' || shortenedMessage.charAt(i) == 'i' || shortenedMessage.charAt(i) == 'o' || shortenedMessage.charAt(i) == 'u') {
                if (i == 0 || shortenedMessage.charAt(i - 1) == ' ') {
                    shortenedMessage2 += shortenedMessage.charAt(i);
                } else {
                    if (shortenedMessage.charAt(i - 1) != shortenedMessage.charAt(i)) {
                        vowelCounter++;
                    }
                }
            } else {
                shortenedMessage2 += shortenedMessage.charAt(i);
            }
        }


        System.out.println("Vowels removed: " + (vowelCounter + doubleVowelCounter));
        System.out.println("Repeats removed: " + repeatCounter);
        System.out.println("Algorithm 1 message: " + shortenedMessage2);
        System.out.println("Algorithm 1 characters saved: " + (vowelCounter + repeatCounter + doubleVowelCounter) + "\n");


        // Start of Alg 2

        System.out.println("Algorithm 2");

        Map<Character, Integer> charCount = new LinkedHashMap<>();
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (Character.isLetter(c)) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }
        StringBuilder shortenedMessage3 = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            shortenedMessage3.append(entry.getValue()).append(entry.getKey());
        }

        Set<Character> uniqueChars = new HashSet<>();
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            char c = entry.getKey();
            if (Character.isLetter(c)) {
                uniqueChars.add(c);
            }
        }
        int numUniqueChars = uniqueChars.size();
        int charsSaved = message.length() - shortenedMessage3.length();

        System.out.println("Unique characters found: " + numUniqueChars);
        System.out.println("Algorithm 2 message: " + shortenedMessage3.toString());
        System.out.println("Algorithm 2 characters saved: " + charsSaved);
    }
}
