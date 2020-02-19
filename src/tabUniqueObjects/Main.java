package tabUniqueObjects;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CakeFactory factory = new CakeFactory();
        final int numberOfCakes = 4;

        System.out.println("Create your own cakes menu! \nHow many cakes would you like to add?");
        // scanner = new Scanner(System.in);
        //final int numberOfCakes = scanner.nextInt();
        CakeMenu[] cakes = factory.createCakeMenu(numberOfCakes);
        System.out.println();
        factory.showCakes(cakes);

    }
}
