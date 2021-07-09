public class Student {
    // Cac thuoc tinh cua student
    private String name;
    private int age;
    private String hometown;
    private int classStudent;

    public Student(String name, int age, String hometown, int classStudent) { // Constructor nah nah ^^
        this.name = name;
        this.age = age;
        this.hometown = hometown;
        this.classStudent = classStudent;
    }

    // Getter ne ^^
    public int getClassStudent() {
        return classStudent;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHometown() {
        return hometown;
    }

    // Setter ne ^^
    public void setClassStudent(int classStudent) {
        this.classStudent = classStudent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    // Da hinh ne !
    @Override
    public String toString() {
        return "Student: {" + "name='" + name + '\'' + ", age=" + age + ", hometown='" + hometown + '\'' + '}';
    }
}
