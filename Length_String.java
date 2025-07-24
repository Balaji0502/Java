import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        int length = 0;
        for(char c : s.toCharArray()){
            length++;
        }
        System.out.println("Length of a String is: "+length);
    }
}
