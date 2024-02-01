/*
    This program converts gallon to liters
 */

class GalToLit {
    public static void main(String[] args) {
        double gallons;  // Variable to hold the value of gallon
        double liters;  // Variable to hold the value of liters

        gallons = 10;

        liters = gallons * 3.7854;

        System.out.println(gallons + " gallon is " + liters + " liters.");
    }
}