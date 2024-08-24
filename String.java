import java.util.Scanner;

public class PalindromeFinder {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of words: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the word " + (i + 1) + ": ");
            words[i] = scanner.nextLine();
        }

        String palindrome = findFirstPalindrome(words);

        if (palindrome != null) {
            System.out.println("First palindrome found: " + palindrome);
        } else {
            System.out.println("No palindrome found in the list.");
        }

        scanner.close();
    }

    public static String findFirstPalindrome(String[] words) {
        for (String word : words) {
            if (isPalindrome(word)) {
                return word;
            }
        }
        return null;
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
