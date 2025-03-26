import java.util.*;
class Complex{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            double x1,y1,x2,y2,x3,y3;
            System.out.println("Enter the real and imaginary part of the 1st number: ");
            x1 = sc.nextDouble();
            y1 = sc.nextDouble();
            System.out.println("The first number z1 = " + x1 + " +i " + y1);
            System.out.println("Enter the real and imaginary part of the 2nd number: ");
            x2 = sc.nextDouble();
            y2 = sc.nextDouble();
            System.out.println("The second number z2 = " + x2 + " +i " + y2);
            x3 = x1 + x2;
            y3 = y1 + y2;
            System.out.println("The resultant number z = " + x3 + " +i " + y3);
        }
    }
}