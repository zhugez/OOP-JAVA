public class C extends Candidates {
   // khai bao cac mon hoc
   public static final String VAN = "Van";
   public static final String SU = "Su";
   public static final String DIA = "Dia";

   public C(String SBD, String name, String diachi, String mucuutien) {
      super(SBD, name, diachi, mucuutien);
   }

   @Override // Show info ra
   public String toString() {
      return "Candidate C: {" + "SBD: '" + SBD + '\'' + ", Ten thi sinh: '" + name + '\'' + ", Dia chi:'" + diachi
            + '\'' + ", Muc uu tien: " + mucuutien + ", Mon thi: " + VAN + " - " + SU + " - " + DIA + '}';
   }
}
