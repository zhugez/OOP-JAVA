import java.util.*;

//import ca the gioi vao ne
public class manageCandidates {
   List<Candidates> candidates; // Tao 1 list of candidates

   public manageCandidates() {
      this.candidates = new ArrayList<>(); // Constructor ne >.<
   }

   public void add(Candidates candidates) {
      this.candidates.add(candidates); // Them candidate vao ne&&
   }

   public void showInfor() {
      this.candidates.forEach(candidates -> System.out.println(candidates.toString()));
      // Dung forEach de do du lieu ra ne
   }

   public Candidates searchBySBD(String SBD) {
      return this.candidates.stream().filter(candidates -> candidates.getSBD().equals(SBD)).findFirst().orElse(null);
      // Dung filter de loc ra ket qua can tim
   }

}
