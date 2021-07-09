import java.util.*;
//import ca the gioi ^^

public class ManageTeacher {
    private List<Teacher> teachers;

    public ManageTeacher() {
        this.teachers = new ArrayList<>();
    }

    public void add(Teacher teacher) {
        this.teachers.add(teacher);
    }

    public boolean deleteById(String id) {
        Teacher teacher = this.teachers.stream().filter(t -> t.getId().equals(id)).findFirst().orElse(null);
        if (teacher == null) {
            return false;
        }
        this.teachers.remove(teacher);
        return true;
    }

    public double getSalary(String id) {
        Teacher teacher = this.teachers.stream().filter(t -> t.getId().equals(id)).findFirst().orElse(null);
        if (teacher == null) {
            System.out.println("ID invalid!");
        } else {
            return teacher.getSalary() + teacher.getBonus() + teacher.getPenaty();
        }
        return 0;
    }
}
