package com.starbucks;

import java.util.ArrayList;
import java.util.Scanner;


public class EverestCoffee {
	/* Method to display all the available coffee products
    static void Menu(ArrayList <StarbucksMini> coffeeList){
        System.out.println();
        System.out.println("*-*-*-* Available Now*-*-*-*");
        // looping through all the available items

        for (int i=0; i < coffeeList.size(); i++){
            System.out.println(coffeeList.get(i).getName());
        }

    }*/

    public static void main(String[] args) throws Exception {

        /*
         *  initializing a variable  of type Starbucks mini to store available coffee
         */
        ArrayList <StarbucksMini> availableCoffee = new ArrayList<>();

        /*
         *  creating an object of type Starbucks mini using parametrized constructor
         */
        StarbucksMini cappuccinos = new StarbucksMini("Cappuccinos", 3);
        StarbucksMini frappuccinos = new StarbucksMini("Frappuccinos", 4);
        StarbucksMini latte = new StarbucksMini("ChaiLatte", 5);
        /*
         *  adding available product into array list availableCoffee
         */
        availableCoffee.add(cappuccinos);
        availableCoffee.add(frappuccinos);
        availableCoffee.add(latte);

        /*
         *  creating object of derived class showing different sizes of Coffee available
         */

        SignatureBeverage cappuccinosTall = new SignatureBeverage("Tall", 4, cappuccinos);
        SignatureBeverage cappuccinosGrande = new SignatureBeverage("Grande",5, cappuccinos);
        SignatureBeverage cappuccinosVenti = new SignatureBeverage("Venti",6, cappuccinos);
        SignatureBeverage frappuccinosWhipped = new SignatureBeverage("Whipped", 4, frappuccinos);
        SignatureBeverage frappuccinosExtraWhipped = new SignatureBeverage("Extra Whipped",7, frappuccinosWhipped);
        SignatureBeverage frappuccinosSuperWhipped = new SignatureBeverage("SuperWhipped",10, frappuccinosExtraWhipped);


        printAvailableCoffee();

        Scanner scan = new Scanner(System.in);

    	int choice = scan.nextInt();



    	if (choice == 1) {
    		System.out.println("Choose your Size");
    		Scanner scanner = new Scanner(System.in);
    		String size = scanner.nextLine();
    		switch(size) {


    		case "Tall":

    			System.out.println("Cappuccinos Tall Cost= " + cappuccinosTall.getPrice());
    			break;

    		case "Grande":

    			System.out.println("Cappuccinos Grande Cost= " + cappuccinosGrande.getPrice());
    			break;

    		case "Venti":

    			System.out.println("Cappuccinos Venti Cost= "+ cappuccinosVenti.getPrice());
    			break;

    		default:
    				System.out.println("Invalid Choice");
    		}

        }

    	else if (choice == 2) {
    		System.out.println("Choose your Twist");
    		Scanner cc = new Scanner(System.in);
    		String twist = cc.nextLine();
    		switch(twist) {


    		case "Whipped":

    			System.out.println("Frappuccinos Whipped Cost= " + frappuccinosWhipped.getPrice());
    			break;

    		case "ExtraWhipped":

    			System.out.println("Frappuccinos Extra Whipped Cost=" + frappuccinosExtraWhipped.getPrice());
    			break;

    		case "SuperWhipped":

    			System.out.println("Frappuccinos Super Whipped Cost=  "+ frappuccinosSuperWhipped.getPrice());
    			break;

    		default:
    			 System.out.println("Invalid choice");
    		}

        }


        else if (choice == 3 ) {

        	System.out.println("Latte Cost:" + latte.getPrice());
        }


        else {

        	System.out.println("Invalid Entry");
        }


}


    public static void printAvailableCoffee() {
    	System.out.println("*****************************************");
    	System.out.println("****** Readily Available drinks    ******");
    	System.out.println("****** Pick Your Own Favorite Size ******");
    	System.out.println("*****************************************");
    	System.out.println("*****************************************");
    	System.out.println("*****************************************");
    	System.out.println("*****************************************");
    	System.out.println("*****************************************");

    	System.out.println("Relish your favourite type of coffee");
    	System.out.println("1.Cappuccinnos 	Available Size: Tall, Grande, Venti");
    	System.out.println("2.Frappuccinnos Available Twist: Whipped, ExtraWhipped, SuperWhipped ");
    	System.out.println("3.Latte ");


    }



}
