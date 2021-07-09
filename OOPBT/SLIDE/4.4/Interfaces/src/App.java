/* Một interface không chứa bất cứ hàm Contructor nào.
Tất cả các phương thức của interface đều là abstract.
Một interface có thể kế thừa từ nhiều interface khác.
Lớp con kế thừa phải thực thi hết tất cả phương thức trừu tượng của interface .
 */
public class App {
    public static void main(String[] args) throws Exception {
        RedHeadDuck n1 = new RedHeadDuck();
        n1.fly();
    }
}
