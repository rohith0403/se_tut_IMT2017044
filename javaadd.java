import java.util.Scanner;

public class javaadd{
    public static void main(String args[]) {
        float a,b,n;
        char choice, ch;
        Scanner scan = new Scanner(System.in);
        a =scan.nextFloat();
        b =scan.nextFloat();
        choice = scan.next().charAt(0);
        if(choice == '1') System.out.println(a+b);
        else if (choice == '2') System.out.println(a - b);
        else if (choice == '3') System.out.println(a * b);
    }
}