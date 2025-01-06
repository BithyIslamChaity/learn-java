package FifthClass;

public class RandomCharacter {

    // Get a random character between ch1 and ch2
    public static char getRandomCharacter(char ch1, char ch2) {
        // Make sure the random number is within the correct range of characters
        int randomInt = (int) (Math.random() * (ch2 - ch1 + 1)) + ch1;
        return (char) randomInt;
    }

    // Get a random lowercase letter
    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }

    // Get a random uppercase letter
    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    // Get a random digit character
    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }

    // Generate a random character in the full Unicode range
    public static char getRandomCharacter() {
        return getRandomCharacter('\u0000', '\uFFFF');
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        System.out.println("Random Lowercase Letter: " + getRandomLowerCaseLetter());
        System.out.println("Random Uppercase Letter: " + getRandomUpperCaseLetter());
        System.out.println("Random Digit: " + getRandomDigitCharacter());
        System.out.println("Random Unicode Character: " + getRandomCharacter());
    }
}
