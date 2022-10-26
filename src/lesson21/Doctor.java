package lesson21;

public class Doctor {
    private String name;
    int age;
    public double salary;

    public Doctor() {
    }

    public Doctor(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private double getSalary() {
        return salary;
    }

    private void setSalary(int salary) {
        this.salary = salary;
    }
}
