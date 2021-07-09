public class HinhTron {
   double bkinh;

   public HinhTron(double bk) {
      bkinh = bk;
   }

   public HinhTron() {
      bkinh = 0.0;
   }

   public double DienTich() {
      return Math.PI * bkinh * bkinh;
   }

   public double ChuVi() {
      return 2 * Math.PI * bkinh;
   }
}
