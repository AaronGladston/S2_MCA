// Final with variables for stopping value change after initialization.
class A{
    final int a = 50;
    void change(){
        System.out.println(a);
    }
}
class Final{
    public static void main(String[] args){
        A obj = new A();
        obj.change();
    }
}