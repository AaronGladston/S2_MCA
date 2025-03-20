class S{
    static int c;
    static void count(){
        c++;
    }
    static void display(){
        System.out.println(c);
    }
}
public class A{
    public static void main(String args[]){
        S.c = 0;
        S.display();
        S.count();
        S.display();
        S.count();
        S.display();
        S.count();
        S.display();
        S.count();
        S.display();
        S.count();
        S.display();
        S.count();
        S.display();
        S.count();
        S.display();
}}