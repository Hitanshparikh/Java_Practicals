// Pass By Reference Example
class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
}

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Debdoot");
        System.out.println("Before method call: " + person.name);

        changeName(person);

        System.out.println("After method call: " + person.name);

        System.out.println("This Practical is made by 23CS054 Hitansh Parikh");
    }

    public static void changeName(Person p) {
        p.name = "Manna";
        System.out.println("Inside method: " + p.name);
    }
}
