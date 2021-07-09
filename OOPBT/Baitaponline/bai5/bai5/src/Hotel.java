import java.util.*;//import ca the gioi

public class Hotel {
    private List<Person> persons;

    public Hotel() { // Chi don gian la constructor hoy ^^
        persons = new ArrayList<>();
    }

    public void add(Person person) {// Them nguoi thue phong ne
        this.persons.add(person);
    }

    public boolean delete(String passport) { // Xoa thong tin nguoi thue phong ne
        Person person = this.persons.stream().filter(p -> p.getPassport().equals(passport)).findFirst().orElse(null);
        if (person == null) {
            return false;
        } else {
            this.persons.remove(person);
            return true;
        }
    }

    public int calculator(String passport) {// Tinh tien thue phong ne
        Person person = this.persons.stream().filter(p -> p.getPassport().equals(passport)).findFirst().orElse(null);
        if (person == null) {
            return 0;
        }
        return person.getRoom().getPrice() * person.getNumberRent();
    }

    public void show() { // Show thong tin ne
        this.persons.forEach(p -> System.out.println(p.toString()));
    }
}
