
class test {

    int a;
    int b;

    test(int x, int y) {
        a = x;
        b = y;
    }

    boolean equals(test ob) {
        return ob.a == a && ob.b == b;
    }

    public static void main(String args[]) {
        test o1 = new test(10, 20);
        test o2 = new test(10, 20);
        test o3 = new test(1, 5);
        System.out.println("o1 == o2 " + o1.equals(o2));
        System.out.println("o1 == o3 " + o1.equals(o3));
        System.out.println("o2 == o3 " + o2.equals(o3));
    }
}
