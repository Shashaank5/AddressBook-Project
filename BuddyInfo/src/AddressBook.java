import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<BuddyInfo> buddies;
    public AddressBook(){
        buddies = new ArrayList();

    }

    public static void main(String[] args) {
        System.out.println("AddressBook");
        AddressBook first = new AddressBook();
        first.addBuddy(new BuddyInfo("Myself", "613", "Carleton"));

        first.addBuddy(new BuddyInfo("bobla", "613 737", "OttawaU"));
        /*
        buddies.add(new BuddyInfo("pogger", "613 737 1111", "the gonq"));
        buddies.add(new BuddyInfo("chicken eater", "613 1234", "N/A"));

         */
        first.removeBuddy(new BuddyInfo("bobla", "613 737", "OttawaU"));

        // adding a random comment to test git
    }

    private void addBuddy(BuddyInfo buddy){
        buddies.add(buddy);
    }
    private void removeBuddy(BuddyInfo buddy){
        buddies.remove(buddy);
    }
}
