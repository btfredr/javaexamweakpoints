/*
Øvingsoppgave 1: Logikk (10 poeng)

Requirement: Write a method that takes a double value as an argument and returns the smallest integer number greater than or equal to the input that is divisible by 7.
Examples:
For input = 15.4, the method returns 21.
For input = 14.0, the method returns 14.
For input = -8.9, the method returns -7.

Instruksjoner:

Skriv en metode som håndterer både positive, negative og desimaltall.
Fokuser på korrekt matematisk logikk for å finne neste tall delelig med 7.
Sammenlign med mai 2025-mock Task 1 (delelighet med 3) og oktober 2024 Task 1 (partall).

*/

public class Task1 {
    public static void main(String[] args) {
        System.out.println(greaterOrEqual(15.7));
        System.out.println(greaterOrEqual(14.0));
        System.out.println(greaterOrEqual(-8.9));
    }
    public static int greaterOrEqual(double n) {
        return (int) Math.ceil(n / 7.0) * 7;
    }
}