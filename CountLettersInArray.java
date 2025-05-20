import java.util.Random;

public class CountLettersInArray {
    public static void main(String[] args) {
        // Create an array to hold 100 characters
        char[] chars = new char[100];

        // Fill the array with random uppercase letters
        for (int i = 0; i < chars.length; i++) {
            chars[i] = RandomCharacter.getRandomUpperCaseLetter();
        }

        // Display the array of characters with spaces
        System.out.println("The uppercase letters are:");
        for (int i = 0; i < chars.length; i++) {
            if (i % 20 == 0 && i != 0) {
                System.out.println();
            }
            System.out.print(chars[i] + " "); // Add space between letters
        }
        System.out.println();

        // Count the occurrences of each letter
        int[] counts = new int[26];
        for (char c : chars) {
            counts[c - 'A']++;
        }

        // Display the counts
        System.out.println("\nThe occurrences of each letter are:");
        for (int i = 0; i < counts.length; i++) {
            if (i % 10 == 0 && i != 0) {
                System.out.println();
            }
            System.out.print((char)('A' + i) + ":" + counts[i] + " ");
        }
    }
}

class RandomCharacter {
    /** Generate a random character between ch1 and ch2 */
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    /** Generate a random lowercase letter */
    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }

    /** Generate a random uppercase letter */
    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    /** Generate a random digit character */
    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }

    /** Generate a random character */
    public static char getRandomCharacter() {
        return getRandomCharacter('\u0000', '\uFFFF');
    }
}