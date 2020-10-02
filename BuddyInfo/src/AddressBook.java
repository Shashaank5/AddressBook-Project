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
        first.removeBuddy(0);
        //testing github version control
        // hehehe i am editing this from github

        // adding a random comment to test git
    }

    private void addBuddy(BuddyInfo buddy) {
        if (buddy!= null) buddies.add(buddy);
    }
    private void removeBuddy(int index){
        if(index >= 0 && index < buddies.size())
        buddies.remove(index);
    }
    private void stupidMethod(){
        System.out.println("Hi");
    }
}
