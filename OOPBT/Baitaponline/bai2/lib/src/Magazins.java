public class Magazins extends Docs {
   private int nopb;// issue number
   private int monthp; // month of published

   public Magazins(String code, String namopub, int circ, int nopb, int monthp) {
      super(code, namopub, circ);
      this.nopb = nopb;
      this.monthp = monthp;
   }

   public int getNopb() {
      return nopb;
   }

   public int getMonthp() {
      return monthp;
   }

   public void setNopb(int nopb) {
      this.nopb = nopb;
   }

   public void setMonthp(int monthp) {
      this.monthp = monthp;
   }

   @Override
   public String toString() {
      return "Magazins{" + "issue number: " + nopb + ", month of published: " + monthp + ", code: '" + code + '\''
            + ", publisher: '" + namopub + '\'' + ", circulation: '" + circ + '\'' + '}';
   }
}
