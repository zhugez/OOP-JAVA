
//import ca the gioi ^^
import java.util.*;

public class manageSchool {

   private List<Student> students = new ArrayList<Student>(); // Tao ra 1 list doi tuong student
   private List<Teacher> teachers = new ArrayList<Teacher>(); // Tao ra 1 list doi tuong teacher
   // để 2 list này ở private để khống chế không cho user lấy trực tiếp từ biến, ta
   // chỉ muốn trả data thông qua hàm get thôi => Bao mat data user

   public void addStudent(Student student) {
      this.students.add(student); // Add 1 student vao
   }

   public void addTeacher(Teacher teacher) {
      this.teachers.add(teacher); // Add 1 teacher vao
   }

   public void showInfoStudent() {
      this.students.forEach(o -> System.out.println(o.showInfo())); // Show Info cua 1 doi tuong
   }

   public void showInfoTeacher() {
      this.teachers.forEach(o -> System.out.println(o.showInfo())); // Show Info cua 1 doi tuong
   }

   public List<Student> getListStudents() {// Tra ve list data Student
      return students;
   }

   public List<Teacher> getListTeachers() {// Tra ve list data Teacher
      return teachers;
   }

}
