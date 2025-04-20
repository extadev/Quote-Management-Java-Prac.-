import java.util.ArrayList;

public class MQConst {
    private String quoteText;
    public String reference;

    public MQConst() {
        quoteText = "";
        reference = "";
    }

    public MQConst(String qt) {
        quoteText = qt;
        reference = "unknown";
    }

    public MQConst(String qt, String ref) {
        quoteText = qt;
        reference = ref;
    }

    public String getQuote() {
        return quoteText;
    }

    public String getRef() {
        return reference;
    }

    public void match(ArrayList<ArrayList<MQConst>> MQArray) {
        
    }

    @Override   
    public String toString() {              
        return quoteText;
    }


    // public boolean Match(String userinput) {
    //     userinput.toLowerCase();
    //     userinput.replaceAll("\\s", "");
    //     for (int i = 0; i < MQArray.size(); i++)
    //         if (MQArray.get(i).contains())
    //     return false;
    // }
    
}
