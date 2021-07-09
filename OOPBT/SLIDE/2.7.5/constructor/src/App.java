public class App {
    public static void main(String[] args) throws Exception {
        // HinhChuNhat na = new HinhChuNhat(4, 5); // Dung constructor voi 2 tham so
        // truyen vao
        // // HinhChuNhat nb = new HinhChuNhat(); // Dung constructor default
        // HinhTron n1 = new HinhTron(2); // Dung constructor voi 1 tham so
        // HinhTron n2 = new HinhTron(); // Dung constructor k tham so

        // double a = na.DienTich();
        // double b1 = n1.DienTich();
        // double b2 = n2.DienTich();

        // System.out.println(a);
        // System.out.println(b1);
        // System.out.println(b2);
        SinhVien sv1 = new SinhVien("20075351", "LyNgocVu", " 10th Oct 2002", "DauTieng", "DHKHMT6B", "OOP", 9.8, 10.0);
        double diemtb = sv1.DiemTB();
        sv1.diemtb = diemtb;
        sv1.InDiem();
    }
}
// Neu class khong co constructor thi trinh bien dich tu taora construictormac
// dinh khong co tham so