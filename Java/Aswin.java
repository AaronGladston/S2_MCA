class Parent{
    int l,b;
    Parent(int x, int y){
        l = x;
        b = y;
    }
    void area(){
        System.out.println("Area: " + l*b);
    }
}
class Child extends Parent{
    int h;
    Child(int m, int n, int z){
        super(m, n);
        h = z;
        System.out.println(h);
    }

}
class Aswin{
    public static void main(String args[]){
        Child obj = new Child(2,4,12);
        obj.area();
    }
}