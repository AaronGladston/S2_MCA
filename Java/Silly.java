

class Animal{
    String color = "Red";
}
class Animal2 extends Animal{
    String color ="Black";
    void color_display(){
        System.out.println(color);
        System.out.println(super.color);

    }
}
class Silly{
    public static void main(String args[]){
        Animal2 obj = new Animal2();
        obj.color_display();
    }
}

/* super as reference variable - Used to refer the immediate parent class object.
Whenever an instance of a subclass is created, an instance of parent class is created implicitly and is referred by super keyword.*/