import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    private List<BuddyInfo> buddies;
    public AddressBook(){
        buddies = new ArrayList();

    }

    public static void main(String[] args) {
        System.out.println("AddressBook");
        AddressBook first = new AddressBook();
        BuddyInfo bob = new BuddyInfo("Myself", "613", "Carleton");
        BuddyInfo bob2 = new BuddyInfo("Porger", "613 737", "OttawaU");

        first.addBuddy(bob);
        first.addBuddy(bob2);

        BuddyInfo bob3 = new BuddyInfo("jb", "613111", "broke");
        first.addBuddy(bob3);
        first.addBuddy(buddyImport("Hello#6133#noschool"));
        first.saveToFile("text.txt");
    }

    private void addBuddy(BuddyInfo buddy) {
        buddies.add(buddy);
    }

    private void removeBuddy(BuddyInfo buddy){
        buddies.add(buddy);
    }
    public static BuddyInfo buddyImport(String text){
        String[] split = text.split("#");
        return new BuddyInfo(split[0], split[1], split[2]);
    }

    private void saveToFile(String text)  {
        File file = new File(text);
        try(FileOutputStream fos = new FileOutputStream(file)){

            if(!file.exists()) file.createNewFile();
            for(BuddyInfo bud: buddies){
                byte[] bytes = (bud.toString() + "\n").getBytes();
                fos.write(bytes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
