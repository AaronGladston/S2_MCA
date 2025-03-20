class A{
    int x,y;
    A(int m,int n){
        x = m;
        y = n;
    }
    void display(){
        System.out.println("x: "+ x +" y: "+ y);
    }
}
class B extends A{
    int z;
    B(int m,int n,int a){
        super(m,n);
        z = a;
        System.out.println(z);
    }
    void display(){
        super.display();
        System.out.println("This is derived class display function.");
    }
}
class Overriding{
    public static void main(String args[]){
        B obj = new B(3,4,5);
        obj.display();
    }
}