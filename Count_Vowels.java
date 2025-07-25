import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        char[] c = s.toCharArray();
        int vowel = 0;

        for(int i = 0; i < c.length; i++) {
            char ch = Character.toLowerCase(c[i]);  // convert to lowercase
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel++;
            }
        }

        System.out.println("Vowels: " + vowel);
    }
}
