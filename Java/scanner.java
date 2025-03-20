import java.util.Scanner;
public class scanner{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.err.println("Enter a double number: ");
        double r = sc.nextDouble();
        System.out.println(n);
        System.out.println(r);
    }
}