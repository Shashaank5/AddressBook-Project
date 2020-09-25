import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<BuddyInfo> buddies;
    public AddressBook(){
        buddies = new ArrayList();
        buddies.add(new BuddyInfo("Myself", "613", "Carleton"));
        buddies.add(new BuddyInfo("bobla", "613 737", "OttawaU"));
        buddies.add(new BuddyInfo("pogger", "613 737 1111", "the gonq"));
        buddies.add(new BuddyInfo("chicken eater", "613 1234", "N/A"));
    }

    public static void main(String[] args) {
        System.out.println("AddressBook");
        // adding a random comment to test git
    }

    private void addBuddy(String name){
        return;
    }
    private void removeBuddy(String name){
        return;
    }
}
