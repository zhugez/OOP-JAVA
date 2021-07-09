public class A extends Candidates {
   // khai bao cac mon hoc
   public static final String TOAN = "Toan";
   public static final String LY = "Ly";
   public static final String HOA = "Hoa";

   public A(String SBD, String name, String diachi, String mucuutien) {
      super(SBD, name, diachi, mucuutien);
   }

   @Override // Show info ra
   public String toString() {
      return "Candidate A : {" + "SBD: '" + SBD + '\'' + ", Ten thi sinh: '" + name + '\'' + ", Dia chi:'" + diachi
            + '\'' + ", Muc uu tien: " + mucuutien + ", Mon thi: " + TOAN + " - " + LY + " - " + HOA + '}';
   }
}