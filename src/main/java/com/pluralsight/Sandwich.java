package com.pluralsight;
import java.util.Scanner;

public class Sandwich {
    public static void main(String[] args) {
        System.out.println("Welcome to the Sandwich shop may i take your order.");
        Scanner input = new Scanner(System.in);

        System.out.println("What size sandwich would you like(regular/large)");
        String size = input.nextLine();

        System.out.println("How old are you?");
        int age = input.nextInt();
        input.nextLine();

        System.out.println("Would you like your sandwich loaded(Yes/no)?");
        String loaded = input.nextLine();

        float price = 0.0f;
        float discount = 0.0f;

        if (size.equals("regular") || size.equals("Regular")) { // what size sandwich do they want
            price = 5.45f;
                if (loaded.equals("yes") || loaded.equals("Yes")) {
                    price += 1.00;
                }
        } else if (size.equals("large")||size.equals("Large")) {
            price = 8.95f;
            if (loaded.equals("yes") || loaded.equals("Yes")) {
                price += 1.75;
            }
        }
            if (age <= 17){ // checking their age
                discount = .10f * price;
            }else if (age >= 65){
                discount = .20f * price;
            }
            float total = price - discount;// calculate total
            System.out.printf("Your final price is $%.2f",total);
    }
}
