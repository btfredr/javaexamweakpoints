package Task4;
/*
    Øvingsoppgave 4: OOP-konstruktører (20 poeng)
    Requirement: Create a Java program to manage inventory items.

    Part 1: Create a Class Named Item (5 points)
    Create a class named Item with private fields for itemID (int), name (String), and quantity (int). Include getter and setter methods for all fields.

    Part 2: Constructors for Item (5 points)
    Implement two constructors:

    One with itemID and name.
    One with itemID, name, and quantity.
    Part 3: Print Method for Item (5 points)
    Add a print method to output the item’s name and quantity.

    Part 4: Test Class with Main Method (5 points)
    Create a Test class with a main method to create two Item instances (one with each constructor) and call their print methods.

    Example Output (for Test class):

    Copy
    Name: Pen
    Quantity: 0
    Name: Notebook
    Quantity: 50
    Instruksjoner:

    Sørg for korrekt innkapsling og inkluder begge konstruktører.
    Test begge konstruktører i main-metoden for å vise funksjonalitet.
    Sammenlign med mai 2024 Task 6 (manglende konstruktør) og oktober 2024 Task 6 (kjøretøy).
 */


public class Item {
    private int itemID;
    private String name;
    private int quantity;

    // Constructors
    public Item(int itemID, String name) {
        this.itemID = itemID;
        this.name = name;
    }

    public Item(int itemID, String name, int quantity) {
        this.itemID = itemID;
        this.name = name;
        this.quantity = quantity;
    }

    // print method
    public void printNameAndQuantity() {
        System.out.println("Name: " + getName());
        System.out.println("Quantity: " + getQuantity());
    }

    // Getters and setters
    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    } 

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
