package week1;

public class Test {

    public static void main(String[] args) {
        String[] options = {"Linear Search", "Word and letter counter","Solving equation", "Exit"};             
        Menu<String> menu = new Menu<String>("Main Menu", options) {
            @Override
            public void execute(int n) {
                switch (n) {
                    case 1:
                        performLinearSearch();
                        break;
                    case 2:
                        analyzeWordCounter();
                        break;
                    case 3:
                        SolvingEquation solver = new SolvingEquation();
                        solver.displayMenu();
                        break;
                    case 4:
                        System.out.println("Exiting program...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            }
        };
        menu.run();
    }
    // Method for Linear Search
    private static void performLinearSearch() {
        int length = Utils.getIntValue("Enter number of array");
        int search = Utils.getIntValue("Enter search value");

        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * length);
        }

        LinearSearch searcher = new LinearSearch();
        System.out.print("The array: ");
        searcher.displayArray(array);

        int foundIndex = searcher.linearSearch(array, search);
        if (foundIndex != -1) {
            System.out.println("\nFound " + search + " at index: " + foundIndex);
        } else {
            System.out.println("\nValue " + search + " not found in the array.");
        }
    }
    // Method for Letter and Word Frequency Analysis
    private static void analyzeWordCounter() {
        String input = Utils.getValue("Enter text to analyze");
        LetterCharacterCount analyzer = new LetterCharacterCount();
        analyzer.analyze(input);
        analyzer.display();
    }
}