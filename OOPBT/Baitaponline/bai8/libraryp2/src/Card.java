public class Card {
    // Mot so thuoc tinh cua Card
    private Student student;
    private String id;
    private int borrowDate;
    private int paymentDate;
    private int bookId;

    public Card(Student student, String id, int borrowDate, int paymentDate, int bookId) {
        // Chi don gian la constructor:((
        this.student = student;
        this.id = id;
        this.borrowDate = borrowDate;
        this.paymentDate = paymentDate;
        this.bookId = bookId;
    }

    // getter va setter ne
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(int borrowDate) {
        this.borrowDate = borrowDate;
    }

    public int getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(int paymentDate) {
        this.paymentDate = paymentDate;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    @Override // Show card
    public String toString() {
        return "CARD: {" + "Name: " + student.getName() + " " + "Age: " + student.getAge() + " " + "Class: "
                + student.getSclass() + " " + "ID Card: " + id + " " + "Date borrow: " + borrowDate + " "
                + "Date payment: " + paymentDate + " " + "Book ID: " + bookId + " " + '}';
    }
}