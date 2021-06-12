package com.alfabank.work33;

public class work33 {
    public static void main(String[] args) {
        double cost = 830.00;
        double procentMinus = 13.0;
        double procentPlus = 7.0;

        double newCost = cost * ( 1 - procentMinus / 100);
        newCost = cost * ( 1 - procentPlus / 100);

        System.out.println("Cost -> " + newCost);
        System.out.printf("Start Cost -> %10.2f$\n New Cost -> %10.2f$", cost, newCost);

    }
}
