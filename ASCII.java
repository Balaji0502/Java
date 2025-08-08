import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0); // Accept a character as input
        int ascii = (int) ch; // Get ASCII value
        System.out.println(ch + ":" + ascii); // Output in specified format
    }
}
