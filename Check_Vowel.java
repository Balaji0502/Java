import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character: ");
		char c = sc.next().charAt(0);
		if(isVowel(c))
		    System.out.println(c+" is a vowel");
		else
		    System.out.println(c + " is a consonant");
	}
	static boolean isVowel(char c){
	    c = Character.toUpperCase(c);
	    return(c=='A'||c=='E'||c=='I'||c=='O'||c=='U');
	}
}
