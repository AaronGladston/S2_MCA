class A{
    final void display(){
        System.out.println("Hi");
    }
}
class B extends A{
}
class Final_Over{
    public static void main(String[] args){
        B obj = new B();
        obj.display();
    }

}