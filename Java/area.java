class area{
    area(){
        System.out.println("Im default nigga!!");
    }
    area(int r){
        double area = 3.14 * r * r;
        System.out.println(area);
    }
    area(int l, int b){
        int area = l*b;
        System.out.println(area);
    }
    public static void main(String skibidi[]){
        area c = new area(5);
        area r = new area(3, 4);
    }
}