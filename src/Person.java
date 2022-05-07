public class Person {

    String fullName;
    int age;
    int birthYear;

    public Person(String fullName, int age, int birthYear) {
        this.fullName = fullName;
        this.age = age;
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", birthday='" + birthYear + '\'' +
                '}';
    }
}
