/*
Øvingsoppgave 3: Effektivitet (15 poeng)
Requirement: Write a Java program that analyzes the input string using the method:

java

Copy
public void analyzeInput(String input) {}
The analysis should include: the number of uppercase letters, the number of digits, and the string length. Use only one loop for efficiency.

Example: If the input string is: "Code123 NOW!", the method should print:

The string contains 3 uppercase letters!
The string contains 3 digits!
The string is 11 characters long!
Instruksjoner:

Bruk én løkke for å telle store bokstaver og sifre effektivt.
Matcher outputformatet nøyaktig, inkludert rekkefølge og tekst.
Sammenlign med mai 2024 Task 5 (tre løkker) og oktober 2024 Task 5 (vokaler/konsonanter). 
 */


public class Task3 {

    public static void main(String[] args) {
        analyzeStringInput("Code123 NOW!");
    }
    
    public static void analyzeStringInput(String input) {
        int uppercase = 0;
        int digits = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isUpperCase(c)) uppercase++;
            else if (Character.isDigit(c)) digits++;
        }

        System.out.println("The string contains " + uppercase + " uppercase letters!");
        System.out.println("The string contains " + digits + " digits!");
        System.out.println("The string is " + input.length() + " characters long!");
    }
}
