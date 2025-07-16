import java.util.Random;
import java.util.ArrayList;

public class MQArray {
    private ArrayList<ArrayList<MQConst>> MQArray = new ArrayList<ArrayList<MQConst>>();
    ArrayList<MQConst> placeholder = new ArrayList<>();
    Random rand = new Random();
    
    public void initializer() { //only for array tracking
        placeholder.add(new MQConst("bro"));
        placeholder.add(new MQConst("noob"));
        MQArray.add(new ArrayList<>(placeholder));
        System.out.println(MQArray + "MQ ARRAY");
        System.out.println(placeholder + "placeholder ARRAY");
        placeholder.clear();
        placeholder.add(new MQConst("no eyes"));
        placeholder.add(new MQConst("kurapika"));
        MQArray.add(new ArrayList<>(placeholder));
        System.out.println(MQArray + "MQ ARRAY");
        System.out.println(placeholder + "placeholder ARRAY");
    }
    
    int arrayIndexing = 0;

    public void delay() {
        try {
            Thread.sleep(2000);
        } 
        catch (Exception e) {
        }
    }

    public void delay(int delay) {
        try {
            Thread.sleep(delay);
        } 
        catch (Exception e) {
        }
    }

    public void addQuote() {
        System.out.println("No quote was added.");
        delay();
    }
    
    public void addQuote(String qt) {
        placeholder.add(new MQConst(qt)); // 2D matrix for the randomizer
        placeholder.add(new MQConst("unknown"));
        MQArray.add(placeholder);
        System.out.println("The quote was added successfully");
        arrayIndexing++;
        System.out.println(MQArray);
        delay();
    }

    public void addQuote(String qt, String ref) {
        ArrayList<MQConst> placeholder = new ArrayList<>();
        placeholder.add(new MQConst(qt));// 2D matrix for the randomizer
        placeholder.add(new MQConst(ref));
        MQArray.add(placeholder);
        System.out.println("The quote was added successfully");
        arrayIndexing++;
        printing("fortrack");
        delay();
    }

    public void displayAll() {
        System.out.println("Here are currently the existing Quotes:");
        if (MQArray.size() <= 0) {
            System.out.println(" idk where quotes are :V");
        }
        
        else if (MQArray.size() > 0) {
            printing("fordisplay");
        }

        delay();
    }

    public void removeQuote(int quoteId) {
        arrayIndexing = quoteId-1;
        MQArray.remove(arrayIndexing);
        System.out.println("Removed successfully.");
        System.out.println("Here is the updated list of Quotes:");
        printing("fordisplay");
        delay();
    }

    public void Random() {
        int randomizer = rand.nextInt(MQArray.size());
        System.out.println("\n" + MQArray.get(randomizer).get(0) + "\n  -" + MQArray.get(randomizer).get(1));
        delay(1000);
    }

    public void searchQuote(String searchInput) {
        boolean found = false;
        searchInput = searchInput.toLowerCase(); 
    
        for (int i = 0; i < MQArray.size(); i++) {
            String quoteText = MQArray.get(i).get(0).getQuote().toLowerCase();
            String reference = MQArray.get(i).get(1).getRef().toLowerCase();
    
            if (quoteText.contains(searchInput) || reference.contains(searchInput)) {
                System.out.println("Quote found!");
                System.out.println((i+1) + ") " + MQArray.get(i).get(0) + "\n  -" + MQArray.get(i).get(1));
                found = true;
            }
        }
    
        if (!found) {
            System.out.println("No match found for: " + searchInput);
        }
    
        delay();
    }

    public void printing(String forpath) {
        switch (forpath) {
          //  case "fortrack": //to be removed lateron (only used for code tracking)
          //      System.out.println(MQArray.size() + ") " + MQArray.get(MQArray.size()-1).get(0).toString() + "  (reference: -"+ MQArray.get(MQArray.size()-1).get(1).toString() + ")");
          //      System.out.println(MQArray.size()+" fortrack");
          //      break;
            case "fordisplay":
                //System.out.println(MQArray.size()+" fordsplay track");
                //System.out.println(MQArray +" fordsplay ");
                for (int i = 0; i < MQArray.size(); i++) {
                    System.out.println((i+1)+") " + 
                    MQArray.get(i).get(0).toString() + 
                    ("  (reference: -"+ MQArray.get(i).get(1).toString() + ")")); 
                }
                break;
        }
    }

    public boolean Match(String userinput) {
        for (int i = 0; i < MQArray.size(); i++)
            if (MQArray.get(i).contains(userinput)) {

            }
        return false;
    }
}

    

