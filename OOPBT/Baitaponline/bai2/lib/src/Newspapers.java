public class Newspapers extends Docs {
   private int dayp; // date of publish

   public Newspapers(String code, String namopub, int circ, int dayp) {
      super(code, namopub, circ);
      this.dayp = dayp;
   }

   public int getDayp() {
      return dayp;
   }

   public void setDayp(int dayp) {
      this.dayp = dayp;
   }

   @Override
   public String toString() {
      return "Newspaper{" + "Date of publish: " + dayp + ", code: '" + code + '\'' + ", Publisher: '" + namopub + '\''
            + ", Circulation: '" + circ + '\'' + '}';
   }
}
