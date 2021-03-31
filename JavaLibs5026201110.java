//package com.JavaLibs;

import javax.swing.JOptionPane;
import java.lang.reflect.MalformedParametersException;
import java.util.Scanner;

public class JavaLibs5026201110 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x, y, intAge, intSpend;
        double douDiscount, b, getDiscount;
        String name, genders, age, origin, hobby, spend, time, discount, friend, noun;
        JOptionPane.showMessageDialog(null,
                "Welcome to Personal Story Maker.\nPlease follow the instruction to make a story for you.",
                "Personal Story Maker",3);
        name = JOptionPane.showInputDialog(null,
                "What should I call you?",
                "Personal Story Maker",3);
        String[] gender = {"Male","Female"};
        genders = (String)JOptionPane.showInputDialog(null,
                "What's your gender?","Personal Quote Maker",
                2,
                null,
                gender,
                gender[1]);
        age = JOptionPane.showInputDialog(null,
                "How old are you, " + name + "?",
                "Personal Story Maker",
                3);
        intAge = Integer.parseInt(age);
        origin = JOptionPane.showInputDialog(null,
                "What country are you from?",
                "Personal Story Maker",3);
        hobby = JOptionPane.showInputDialog(null,
                "In your free time, what do you like to do for a hobby?",
                "Personal Story Maker", 3);
        time = JOptionPane.showInputDialog(null,
                "That's a really interesting hobby, Mr." + name + ".\n" +
                "What day do you usually pick for doing " + hobby + "?",
                "Personal Story Maker", 3);
        spend = JOptionPane.showInputDialog(null,
                "How much would you like to spend for a dinner tonight? (fill with integer only).",
                "Personal Story Maker",3);
        intSpend = Integer.parseInt(spend);
        discount = JOptionPane.showInputDialog(null,
                "Pick the number you like between 1-9!\nFill with integer only.",
                "Personal Story Maker", 3);
        douDiscount = Double.parseDouble(discount);
        getDiscount = douDiscount*0.001*intAge*intSpend;
        JOptionPane.showMessageDialog(null,
                "Congratulation!\nYou got "  + getDiscount + " discount for your dinner tonight" +
                        " at Seblak Berkah Restaurant.",
                "Personal Story Maker", 3);
        friend = JOptionPane.showInputDialog(null,
                "What's your best friend's name?",
                "Personal Story Maker", 3);
        JOptionPane.showMessageDialog(null,"We've created a simple story about you. " +
                        "Click ok if you're ready to read.",
                "Personal Story Maker",3);
        JOptionPane.showMessageDialog(null,
                "In the blessed land of " + origin + ", lived a wise person named " + name +
                        ".\nWhen the first world war started, " + name + " was " + age + " years old.\n" +
                        "While " + name + "'s colleagues were fighting other nations, " + name +
                        " was doing\n" + hobby + " every " + time + " instead. Out of nowhere, " +
                        name + " made a dinner\nplan at Seblak Restaurant with " + friend + ". " +
                        name + " paid " + spend + " for their\nfood and apparently got a discount " +
                        " as much as Rp " + getDiscount + "\nbecause the writer wants the story to" +
                        " be like that.");
    }
}
