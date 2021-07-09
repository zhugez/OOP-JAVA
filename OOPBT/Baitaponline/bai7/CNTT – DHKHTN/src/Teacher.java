public class Teacher {
    // Cac thuoc tinh cua can bo gv

    private double salary;
    private double bonus;
    private double penaty;
    private double realSalary;
    private String name;
    private int age;
    private String hometown;
    private String id;

    public Teacher(double salary, double bonus, double penaty, double realSalary, String name, int age, String hometown,
            String id) {// Constructor nah nah ^^
        this.salary = salary;
        this.bonus = bonus;
        this.penaty = penaty;
        this.realSalary = realSalary;
        this.name = name;
        this.age = age;
        this.hometown = hometown;
        this.id = id;
    }
    // Getter ne ^^

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHometown() {
        return hometown;
    }

    public String getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public double getBonus() {
        return bonus;
    }

    public double getPenaty() {
        return penaty;
    }

    public double getRealSalary() {
        return realSalary;
    }
    // Setter ne ^^

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setPenaty(double penaty) {
        this.penaty = penaty;
    }

    public void setRealSalary(double realSalary) {
        this.realSalary = realSalary;
    }
}
