class circle{
    int r=10;
    double area;
    void area(){
        area = 3.14*r*r;
        System.out.println("Area:" + area);
    }
    public static void main(String args[]){
        circle obj = new circle();
        obj.area();
    }
}