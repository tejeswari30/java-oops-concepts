// Encapsulation: using private variables with public getters and setters

class Employee {

    private String name;
    private int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {

        Employee e = new Employee("Alice", 20);

        System.out.println(e.getName());
        System.out.println(e.getAge());

        e.setAge(21);
        System.out.println(e.getAge());
    }
}
