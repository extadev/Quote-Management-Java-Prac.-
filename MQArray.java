import java.util.Scanner;

public class MQMain {
    static Scanner sc = new Scanner(System.in);
    static MQArray MQMethod = new MQArray();
    public static void main(String args[]) {
        // MQMethod.initializer(); // only for array tracking 
        while (true) {
            try {
                System.out.println("\nQUOTE GENERATOR:");
                System.out.println("What would you like to do today?");
                System.out.println("1) Add quote\n2) Remove quote\n3) Search a quote\n4) Display All Exisisting Quotes\n5) Random Quote\n6) Exit");
                System.out.print("> ");
                int mainOption = sc.nextInt();
                switch (mainOption) {
                    case 1:
                        newQuote();
                        break; // case 1 (Add Quote) end
                    case 2:
                        removeQuote();
                        break;
                    case 3:
                        searchQuote();
                        break;
                    case 4:
                        MQMethod.displayAll();
                        break;
                    case 5:
                        MQMethod.Random();
                        break;
                    case 6:
                        sc.close();
                        System.exit(0);
                        break;
                }
            }
            catch (Exception e){
                System.out.println("\nInvalid input. Please try again.");
                sc.nextLine();
                MQMethod.delay(1000);
            }
        }
    }
    public static void newQuote() {
        boolean onRepeat = true;
        try {
            while (onRepeat) {
                System.out.println("What is the quote? (i can't take numbers)");
                System.out.print("> ");
                sc.nextLine();
                String newQuote = sc.nextLine();
                System.out.println("\nWhat is reference? (leave blank if unknown)");
                System.out.print("> ");
                String refQuote = sc.nextLine();
                
                if (!newQuote.trim().matches("[a-zA-Z ]+") && !refQuote.trim().matches("[a-zA-Z ]+")) {
                    throw new IllegalArgumentException("Invalid input.");
                }

                else if (newQuote.trim().matches("[a-zA-Z ]+") && refQuote.trim().matches("[a-zA-Z ]+")) {
                    // System.out.println("print 1");
                    MQMethod.addQuote(newQuote, refQuote);
                    onRepeat = false;
                }
                else if (newQuote.trim().matches("[a-zA-Z ]+") && refQuote.isEmpty()) {
                    // System.out.println("print 2");
                    MQMethod.addQuote(newQuote);
                    onRepeat = false;
                }
                else {
                    // System.out.println("print 3");
                    MQMethod.addQuote();
                    onRepeat = false;
                }
            }
        }

        catch (Exception e) {
            System.out.println("Invalid input. Please try again.");
        }
    }

    public static void removeQuote() {
        MQMethod.displayAll();
        System.out.println("Which quote would you like to remove?");
        System.out.print("> ");
        int removeQuote = sc.nextInt();
        MQMethod.removeQuote(removeQuote);
        System.out.println("You have removed: " + removeQuote);
    }

    public static void searchQuote() {
        System.out.println("What existing quote would you like to search?");
        System.out.print("> ");
        sc.nextLine();
        String searchQuote = sc.nextLine();
        MQMethod.searchQuote(searchQuote);
    }
}
