package lesson13;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if (name == null || name.equals("")) {
            throw new NullPointerException("name == null || name.equals(\"\")");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalAccessException {
        if(age < 0 || age >150){
            throw new IllegalAccessException("Введите возраст от 0 до 150");
        }
        this.age = age;
    }
}
