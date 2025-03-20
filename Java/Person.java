class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + " Age: " + age);
    }
// Creating an array of objects for the class objects

    public static void main(String args[]) {
        Person p[] = new Person[3];
        p[0] = new Person("abc", 15);
        p[1] = new Person("name", 78);
        p[2] = new Person("GHI", 32);
// Accessing objects in the array
        for (int i = 0; i < 3; i++) {
            p[i].display();
        }
    }
}
