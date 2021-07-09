public class Student {
    // Cac thuoc tinh cua Student
    private String name;
    private int age;

    private String sclass;

    public Student(String name, int age, String sclass) { // Constructor ne ^^
        this.name = name;
        this.age = age;
        this.sclass = sclass;
    }

    // getter va setter tuong tu cac bai truoc
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSclass() {
        return sclass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSclass(String sclass) {
        this.sclass = sclass;
    }
}
