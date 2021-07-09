
//import ca the gioi ^^
import java.util.*;
import java.util.stream.*;

public class School {
    private List<Student> students;// Tao 1 list students ne :< Luu tham chieu hoi nha :> ^^

    public School() { // Constructor hoy :<
        this.students = new ArrayList<>();
    }

    public void add(Student student) { // Them student ne ^^
        this.students.add(student);
    }

    public List<Student> getStudent20YearOld() {// Lay hoc sinh 20 tuoi ne :>
        // Dung stream de loc ra hoc sinh 20 tuoi ne :<
        return this.students.stream().filter(student -> student.getAge() == 20).collect(Collectors.toList());
    }

    public long countStudent23YearOldInDN() {// Lay hoc sinh 23 tuoi + o DN ne :>
        // Dung stream de loc ra ne :<
        return this.students.stream().filter(student -> student.getAge() == 23 && student.getHometown().equals("DN"))
                .count();
    }
}
