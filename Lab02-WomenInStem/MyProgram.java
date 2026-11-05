import java.util.ArrayList;
import java.util.Scanner;

public class MyProgram {
    public static void main(String[] args) {
        ArrayList<WomenInStem> gallery = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        gallery.add(new WomenInStem("Ada Lovelace", "Computer Science", 1843, 
                    "First algorithm intended for a machine", "Being the first computer programmer"));
        gallery.add(new WomenInStem("Grace Hopper", "Computer Science", 1952, 
                    "Developed the first compiler for a programming language", "Pioneering compiler technology"));

        int choice;

        do {
            System.out.println("\n=== Women in STEM Gallery ===");
            System.out.println("1: Add a Woman");
            System.out.println("2: Display Gallery");
            System.out.println("3: Search by name");
            System.out.println("4: Update an entry");
            System.out.println("5: Exit");
            System.out.print("Enter your choice: ");

            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Enter your choice (1-5): ");
                scanner.next();
            }
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter the woman's name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter her field: ");
                    String field = scanner.nextLine();

                    System.out.print("Enter her year of contribution: ");
                    while (!scanner.hasNextInt()) {
                        System.out.print("Invalid year. Enter a valid year: ");
                        scanner.next();
                    }
                    int year = scanner.nextInt();
                    scanner.nextLine(); 

                    System.out.print("Enter her contribution: ");
                    String contribution = scanner.nextLine();

                    System.out.print("What is she recognized for? ");
                    String recognizedFor = scanner.nextLine();

                    WomenInStem newWoman = new WomenInStem(name, field, year, contribution, recognizedFor);
                    gallery.add(newWoman);
                    System.out.println(name + " has been added to the gallery!");
                    break;

                case 2:
                    if (gallery.isEmpty()) {
                        System.out.println("The gallery is currently empty.");
                    } else {
                        System.out.println("------------------------------------");
                        for (WomenInStem w : gallery) {
                            System.out.println("|| Name: " + w.getName());
                            System.out.println("|| Field: " + w.getField());
                            System.out.println("|| Year: " + w.getYearOfContribution());
                            System.out.println("|| Contribution: " + w.getContribution());
                            System.out.println("|| Recognized For: " + w.getRecognizedFor());
                            System.out.println("------------------------------------");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter a name to search: ");
                    String searchName = scanner.nextLine();
                    boolean found = false;

                    for (WomenInStem w : gallery) {
                        if (w.getName().equalsIgnoreCase(searchName)) {
                            System.out.println("\nMatch found:\n" + w.toString());
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("No match found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter the name of the person to update: ");
                    String updateName = scanner.nextLine();
                    WomenInStem target = null;

                    for (WomenInStem w : gallery) {
                        if (w.getName().equalsIgnoreCase(updateName)) {
                            target = w;
                            break;
                        }
                    }

                    if (target != null) {
                        System.out.println("Current Info:\n" + target.toString());
                        System.out.print("Enter new contribution description: ");
                        String newContrib = scanner.nextLine();
                        if (target.setContribution(newContrib)) {
                            System.out.println("Update successful!");
                            System.out.println("Updated Info:\n" + target.toString());
                        } else {
                            System.out.println("Invalid input. Update failed.");
                        }
                    } else {
                        System.out.println("No match found.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting gallery. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please choose between 1 and 5.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
