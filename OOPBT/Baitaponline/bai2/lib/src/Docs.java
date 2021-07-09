public class Docs {
   protected String code; // code of docs
   protected String namopub;// name of publisher
   protected int circ; // Circulation

   public Docs(String code, String namopub, int circ) {
      this.code = code;
      this.namopub = namopub;
      this.circ = circ;
   }

   public String getCode() {
      return code;
   }

   public String getNamopub() {
      return namopub;
   }

   public int getCirc() {
      return circ;
   }

   public void setCode(String code) {
      this.code = code;
   }

   public void setNamopub(String namopub) {
      this.namopub = namopub;
   }

   public void setCirc(int circ) {
      this.circ = circ;
   }
}