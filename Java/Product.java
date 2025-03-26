class Product {

    String product_name;
    int product_code, price;

    Product(String product_name, int product_code, int price) {
        this.product_code = product_code;
        this.product_name = product_name;
        this.price = price;
    }

    public static void main(String[] args) {
        Product o1 = new Product("Pencil", 242134, 5);
        Product o2 = new Product("Pen", 242135, 10);
        Product o3 = new Product("Book", 252630, 45);
        String low_name = null;
        int low = 99999;
        if (low > o1.price) {
            low = o1.price;
            low_name = o1.product_name;
        }
        if (low > o2.price) {
            low = o2.price;
            low_name = o2.product_name;
        }
        if (low > o3.price) {
            low = o3.price;
            low_name = o3.product_name;
        }
        System.out.println("The item with the lowest price is: " + low_name + " and its price is: " + low);
    }
}
