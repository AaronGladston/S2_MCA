class Grandparent{
    Grandparent(){
        System.out.println("Grandparent class.");
    }
}
class Parent extends Grandparent{
    Parent(){
        System.out.println("Parent class.");
    }
}
class Child extends Parent{
    Child(){
        System.out.println("Child class.");
    }

}
class newfile{
    public static void main(String args[]){
        Child obj = new Child();
    }
}