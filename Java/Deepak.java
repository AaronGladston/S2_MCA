class Parent{
    void volume(int l, int b, int h){
        System.out.println(l*b*h);
    }
}
class Child extends Parent{
    @Override
    void volume(int l, int b, int h){
        super.volume(l, b, h);
    }

}
class Deepak{
    public static void main(String args[]){
        Child obj = new Child();
        obj.volume(2, 4, 12);
    }
}

/* subclass constructor uses a super keyword(method) to invoke the parent class constructor.Super may only be used within a subclass constructor 
The call to superclass constructor using super method must appear as the first statement in the subclass constructor
The parameters in the super call must match the order and the type of the instance variables declared in the super class*/