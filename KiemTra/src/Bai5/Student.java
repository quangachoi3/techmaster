package Bai5;

public class Student {
    String fullName;
    int age;
    String homeTown;

    public Student() {
        this.fullName = "fullName";
        this.age = 19;
        this.homeTown = "homeTown";
    }

    public Student(String fullName, int age, String homeTown) {
        this.fullName = fullName;
        this.age = age;
        this.homeTown = homeTown;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", homeTown='" + homeTown + '\'' +
                '}';
    }
}
