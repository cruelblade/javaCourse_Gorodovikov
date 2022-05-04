import java.util.Comparator;
import java.util.Locale;

public class Student implements Comparable<Student>{
    String fullName;
    int age;
    String className;
    FavouriteSubject favouriteSubject;

    public Student(String fullName, int age, String className, FavouriteSubject favouriteSubject) {
        this.fullName = fullName;
        this.age = age;
        this.className = className;
        this.favouriteSubject = favouriteSubject;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getClassName() {
        return className;
    }

    public FavouriteSubject getFavouriteSubject() {
        return favouriteSubject;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int compareTo(Student o) {
        return fullName.toLowerCase().compareTo(o.fullName.toLowerCase())
                + (age - o.age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", className='" + className + '\'' +
                '}';
    }
}

class FullNameAgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o2.fullName.compareTo(o1.fullName) +
                (o2.age - o1.age);
    }
}
enum FavouriteSubject {
    Математика,
    Иностранный_язык,
    Информатика,
    История;
}


