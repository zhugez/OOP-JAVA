
//import ca the gioi ne
import java.util.*;

public class ManageCard {

    private List<Card> cards;

    public ManageCard() { // Constructor ne ^^
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {// add card ne :>
        this.cards.add(card);
    }

    public boolean delete(String id) { // del card ne ><
        // Loc ra card can del ne <:>
        Card card = this.cards.stream().filter(t -> t.getId().equals(id)).findFirst().orElse(null);
        if (card == null) {
            return false;
        }
        this.cards.remove(card); // del card ne :>
        return true;
    }

    public Card searchByID(String id) {
        return this.cards.stream().filter(cards -> cards.getId().equals(id)).findFirst().orElse(null);
        // Dung filter de loc ra ket qua can tim
    }

    public void showAllcards() {
        // Dung filter de loc Books
        this.cards.stream().filter(docs -> docs instanceof Card).forEach(docs -> System.out.println(docs.toString()));
    }

}
