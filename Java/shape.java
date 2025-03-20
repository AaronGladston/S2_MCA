import java.util.Scanner;
class shape{
    void area(double r){
        System.out.println("Area is: "+ 3.14*r*r);
    }
    void area(int side){
        System.out.println("Area is: "+ side*side);
    }
    void area(int l,int b){
        System.out.println("Area is: "+ l*b);
    }
    void area(double b,double h){
        System.out.println("Area is: "+ 0.5*b*h);
    }
    public static void main(String args[]){
        shape obj = new shape();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double r = sc.nextDouble();
        obj.area(r);
        System.out.println("Enter the side of the square: ");
        int side = sc.nextInt();
        obj.area(side);
        System.out.println("Enter the length and breadth of the rectangle: ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        obj.area(l,b);
        System.out.println("Enter the base and height of the triangle: ");
        double base = sc.nextDouble();
        double h = sc.nextDouble();
        obj.area(base,h);
    }
}