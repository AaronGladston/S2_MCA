class Parent{
    Parent(){
        System.out.println("Parent class.");
    }
}

class Child extends Parent{
    Child(){
        System.out.println("Child class.");
    }
}
class inheritance{
     public static void main(String args[]){
        Child obj = new Child();
     }
}