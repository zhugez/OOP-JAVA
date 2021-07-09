public class Books extends Docs {
   private String author; // name of the author
   private int nop; // number of pages

   public Books(String code, String namopub, int circ, String author, int nop) {
      super(code, namopub, circ);
      this.author = author;
      this.nop = nop;
   }

   public String getAuthor() {
      return author;
   }

   public int getNop() {
      return nop;
   }

   public void setAuthor(String author) {
      this.author = author;
   }

   public void setNop(int nop) {
      this.nop = nop;
   }

   @Override
   public String toString() {
      return "Books{" + "author:'" + author + '\'' + ", numerPage:" + nop + ", code: '" + code + '\'' + ", publisher: '"
            + namopub + '\'' + ", circulation: '" + circ + '\'' + '}';
   }
}