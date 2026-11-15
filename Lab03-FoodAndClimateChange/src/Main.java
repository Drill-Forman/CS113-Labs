public class Main {
    public static void main(String[] args) {
        SingleLinkedList<Impact> meatImpacts = new SingleLinkedList<>();
        meatImpacts.addLast(new Impact("High Water Use", "Beef requires thousands of liters of water per kilogram."));
        meatImpacts.addLast(new Impact("Deforestation", "Forests are cleared for cattle ranching and animal feed crops."));
        meatImpacts.addLast(new Impact("Methane Pollution", "Cows emit methane, a powerful greenhouse gas."));
        meatImpacts.addLast(new Impact("High Carbon Footprint", "Meat has a much larger footprint per calorie compared to plants."));

        SingleLinkedList<Impact> plantImpacts = new SingleLinkedList<>();
        plantImpacts.addLast(new Impact("Lower Water Use", "Lentils and beans need far less water than beef."));
        plantImpacts.addLast(new Impact("Reduced Deforestation", "Less land is required for crops compared to cattle feed."));
        plantImpacts.addLast(new Impact("Minimal Methane Emissions", "Plants do not produce methane like cows."));
        plantImpacts.addLast(new Impact("Smaller Carbon Footprint", "Plant-based diets greatly reduce greenhouse gas emissions."));

        System.out.println("Impacts of Beef & Meat-heavy Diets on Climate Change:");
        meatImpacts.printList();

        System.out.println("\nBenefits of Vegetarian/Vegan Diets on Climate Change:");
        plantImpacts.printList();

        System.out.println("\nNumber of meat impacts listed: " + meatImpacts.size());
        System.out.println("Number of plant-based benefits listed: " + plantImpacts.size());

        Impact removed = meatImpacts.removeFirst();
        System.out.println("\nRemoving the first meat impact: " + removed);

        System.out.println("\nUpdated meat impact list:");
        meatImpacts.printList();
    }
}
