package Task4;
/*
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

public class Test {
    public static void main(String[] args) {
        Item item1 = new Item(1, "Book");

        item1.print();
    
        Item item2 = new Item(2, "Phone", 3);
    
        item2.print();
    }
}
