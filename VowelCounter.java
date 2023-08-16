import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.println("Enter a string of characters: ");
        String text = kbd.nextLine().toLowerCase();

        int aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0, nonVowelCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);


            switch (ch) {
                case 'a':
                    aCount++;
                    break;
                case 'e':
                    eCount++;
                    break;
                case 'i':
                    iCount++;
                    break;
                case 'o':
                    oCount++;
                    break;
                case 'u':
                    uCount++;
                    break;
                default:
                    nonVowelCount++;
                    break;
            }
        }
        
        System.out.println("                                             ");
        System.out.println("Number of each lowercase vowel in the string:");
        System.out.println("a: " + aCount);
        System.out.println("e: " + eCount);
        System.out.println("i: " + iCount);
        System.out.println("o: " + oCount);
        System.out.println("u: " + uCount);
        System.out.println("other characters: " + nonVowelCount);

        kbd.close();
    }
}
