package Collections;

public class Person {
    private String name;
    private Integer age;
    private String nationality;

    public Person(String name, Integer age, String nationality) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getNationality() {
        return nationality;
    }
}
