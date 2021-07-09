
///Tim hieu ve  thu java collection tai day: https://viettuts.vn/java-collection
import java.util.List;//List là một interface trong java collection. Nó chứa các phương thức để chèn và xóa các phần tử dựa trên chỉ số index. Xem chi tiet tai: https://viettuts.vn/java-collection/list-trong-java
import java.util.ArrayList;//ArrayList kế thừa lớp AbstractList và triển khai của List được sử dụng như một mảng động để lưu trữ các phần tử. Xem chi tiet tai: https://viettuts.vn/java-collection/arraylist-trong-java
import java.util.stream.Collectors;//Phương thức collect() giúp thu thập kết quả Stream sang một Collection.
//Stream là một api của java giúp chúng ta có thể thực hiện các phép toán tổng hợp khác nhau trên dữ liệu được trả về từ các collection, array, các hoạt động I/O. Xem chi tiet tai: https://gpcoder.com/3923-gioi-thieu-ve-stream-api-trong-java-8/#Gioi_thieuve_Stream_trong_Java_8

public class ManagerOfficer {
   private List<Officer> officers; // Tao ra 1 list doi tuong Officer.

   public ManagerOfficer() {
      this.officers = new ArrayList<>(); // Tao ra 1 array Officers
   }

   public void addOfficer(Officer officer) {
      this.officers.add(officer); // Add Officer vao
   }

   public List<Officer> searchOfficerByName(String name) {
      return this.officers.stream().filter(o -> o.getName().contains(name)).collect(Collectors.toList());
      /* Dung bieu thuc lambda de thuc hien vong lap tim kiem Officer bang ten */
   }

   public void showListInforOfficer() {
      this.officers.forEach(o -> System.out.println(o.toString())); // Show Info cua Officer
   }
}
