public class B extends Candidates {
   // khai bao cac mon hoc
   public static final String TOAN = "Toan";
   public static final String HOA = "Hoa";
   public static final String SINH = "Sinh";

   public B(String SBD, String name, String diachi, String mucuutien) {
      super(SBD, name, diachi, mucuutien);
   }

   @Override // Show info ra
   public String toString() {
      return "Candidate B: {" + "SBD: '" + SBD + '\'' + ", Ten thi sinh: '" + name + '\'' + ", Dia chi:'" + diachi
            + '\'' + ", Muc uu tien: " + mucuutien + ", Mon thi: " + TOAN + " - " + HOA + " - " + SINH + '}';
   }
}
