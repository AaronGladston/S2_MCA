/*This is a java code to provide the output of the two display() methods having the same name using the object of the derived class only.*/ 
class Base{
    Base(){
        System.out.println("This is base default constructor.");
    }
    void display(){
        System.out.println("This is base class display function.");
    }
}
class Child extends Base{
    int x;
    Child(){
        System.out.println("This is child default constructor.");
    }
    void display(int m){
        x = m;
        System.out.println(x);
    }
}
class Default{
    public static void main(String[] args){
        Child obj = new Child();
        obj.display();
        obj.display(5);
    }
}