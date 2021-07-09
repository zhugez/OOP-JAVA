public class swap {
   public void swap(number a, number b) {
      int temp = a.getNum(); // gan num cua a cho temp ne
      a.setNum(b.getNum()); // gan num cua b cho a ne
      b.setNum(temp); // xong gan temp cho b ne => b = a (ban dau)
   }
}
