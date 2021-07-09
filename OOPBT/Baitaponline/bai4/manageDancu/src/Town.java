
//import ca the gioi ^^
import java.util.*;

public class Town {
    List<Family> families;

    public Town() {
        this.families = new ArrayList<>();
    }

    public List<Family> getFamilies() {
        return families;
    }

    public void setFamilies(List<Family> families) {
        this.families = families;
    }

    public void addFamily(Family family) {
        this.families.add(family);
    }

    public void showAll() {
        // Dung forEach in ra tung person trong family
        this.families.forEach(persons -> System.out.println(persons.toString()));
    }
}
