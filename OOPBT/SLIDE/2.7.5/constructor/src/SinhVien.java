//import java.util.Date;

public class SinhVien {
   String MaSV, HoTen, Noisinh;
   String NgaySinh;
   String Lop, MonHoc;
   double diemlt, diemth, diemtb;

   public SinhVien(String ma, String ht, String ngs, String ns, String l, String mh, Double lt, Double th) {
      MaSV = ma;
      HoTen = ht;
      Noisinh = ns;
      NgaySinh = ngs;
      Lop = l;
      MonHoc = mh;
      diemlt = lt;
      diemth = th;
   }

   public double DiemTB() {
      return (diemlt + diemth) / 2;
   }

   public void InDiem() {
      System.out.println(
            MaSV + "\t" + HoTen + "\t" + NgaySinh + "\t" + Noisinh + "\t" + Lop + "\t" + MonHoc + "\t" + diemtb);
   }
}
