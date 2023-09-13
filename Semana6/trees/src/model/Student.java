package src.model;

public class Student implements Comparable<Student> {

    private int age;
    private String name;
    private String lastName;

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Student(int age, String name, String lastName) {
        this.age = age;
        this.name = name;
        this.lastName = lastName;
    }

    public String toString() {
        return "Name: " + name +
                "\nLast Name: " + lastName +
                "\nAge: " + age;
    }

    @Override
    public int compareTo(Student other) {
        int x = -1;

        if (other!=null) {
            int ageO = ((Student) other).getAge();
            if (age > ageO)
                x = 1;
            else if (age == ageO)
                x = 0;
            else
                x = -1;

        }
        return x;
    }
}
