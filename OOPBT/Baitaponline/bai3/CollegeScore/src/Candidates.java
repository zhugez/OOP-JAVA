public class Candidates {
   public String SBD;
   public String name;
   public String diachi;
   public String mucuutien;

   public Candidates(String SBD, String name, String diachi, String mucuutien) {
      this.SBD = SBD;
      this.name = name;
      this.diachi = diachi;
      this.mucuutien = mucuutien;
   }

   public String getSBD() {
      return SBD;
   }

   public String getName() {
      return name;
   }

   public String getDiachi() {
      return diachi;
   }

   public String getMucuutien() {
      return mucuutien;
   }

   public void setSBD(String SBD) {
      this.SBD = SBD;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setDiachi(String diachi) {
      this.diachi = diachi;
   }

   public void setMucuutien(String mucuutien) {
      this.mucuutien = mucuutien;
   }
}
