package Bai6;

public class Nguoi {
    String fullName;
    int age;
    String homeTown;
    String id;

    public Nguoi(String fullName, int age, String homeTown, String id) {
        this.fullName = fullName;
        this.age = age;
        this.homeTown = homeTown;
        this.id = id;
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

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", homeTown='" + homeTown + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
