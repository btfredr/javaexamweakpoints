/*
Øvingsoppgave 2: Format (15 poeng)
Requirement: Write a method that takes an integer n as an argument. If n is positive, use a do-while loop to print all numbers from n to n+4 in ascending order, 
separated by commas without a trailing comma. If n is negative or zero, print Error.

Examples:

For n=3, the method prints: 3,4,5,6,7
For n=1, the method prints: 1,2,3,4,5
For n=-2, the method prints: Error
Instruksjoner:

Bruk en do-while-løkke som krevd, og vær nøye med kommahåndtering.
Sørg for at outputformatet matcher eksemplene nøyaktig (ingen trailing komma, ingen ekstra linjer).
Sammenlign med mai 2024 Task 3 (nedtelling, trailing komma) og oktober 2024 Task 3 (opptelling, format).
 */


public class Task2 {
    public static void main(String[] args) {
        countUp(-2);
    }
    
    public static void countUp(int n) {
        if (n > 0) {
            int count = n;
            int max = n + 4;
            do {
                System.out.print(count);
                if (count < max) System.out.print(",");
                count++;
            } while (count <= max);
        } else if (n <= 0) {
            System.out.print("Error");
        }
    } 
}
