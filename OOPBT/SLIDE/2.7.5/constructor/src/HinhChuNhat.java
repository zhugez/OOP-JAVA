public class HinhChuNhat {
   double cdai, crong;

   public HinhChuNhat(double cd, double cr) {
      cdai = cd;
      crong = cr;

   }

   public double DienTich() {
      return cdai * crong;
   }

   public double ChuVi() {
      return (cdai + crong) * 2;
   }

}
