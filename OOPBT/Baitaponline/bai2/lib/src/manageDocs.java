
/**
 * manageDocs
 */
import java.util.ArrayList;
import java.util.List;

public class manageDocs {
   List<Docs> docs; // Tao 1 list de luu docs

   public manageDocs() {
      this.docs = new ArrayList<>(); // Constructor
   }

   public void addDocs(Docs docs) {
      this.docs.add(docs); // Func add docs
   }

   public boolean deleteDocs(String code) { // Func Delete docs
      // Tim code trong list docs roi luu vao bien docs
      Docs docs = this.docs.stream().filter(o -> o.getCode().equals(code)).findFirst().orElse(null);
      if (docs == null) {
         return false; // Check neu docs rong thi tra ve false
      }
      this.docs.remove(docs); // Delete docs from docs list
      return true;
   }

   public void showInfo() { // Show info
      this.docs.forEach(docs -> System.out.println(docs.toString()));// Chay vong lap in docs ra
   }

   public void searchByBook() {
      // Dung filter de loc Books
      this.docs.stream().filter(docs -> docs instanceof Books).forEach(docs -> System.out.println(docs.toString()));
   }

   public void searchByNewspaper() {
      // Dung filter de loc Newspaper

      this.docs.stream().filter(docs -> docs instanceof Newspapers)
            .forEach(docs -> System.out.println(docs.toString()));
   }

   public void searchByMagazins() {
      // Dung filter de loc Magazins
      this.docs.stream().filter(docs -> docs instanceof Magazins).forEach(docs -> System.out.println(docs.toString()));
   }
}