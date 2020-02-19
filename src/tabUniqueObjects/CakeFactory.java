package tabUniqueObjects;

import java.util.Scanner;

public class CakeFactory {

    public CakeMenu[] createCakeMenu(int numberOfCakes) {

        if (numberOfCakes <= 0) {
            System.out.println("Invalid number of cakes, you are not hungry!");
            return new CakeMenu[0];
        }

        System.out.println("Add " + numberOfCakes + " cakes to the menu: ");
        CakeMenu[] cakes = new CakeMenu[numberOfCakes];

        for (int i = 0; i < cakes.length;) {

            System.out.println("---> Cake nr " + (i + 1));
            CakeMenu cake = createCake();

            if (cakeExists(cakes, cake)) {
                System.out.println("This cake exists in the menu, Provide other cake.");

            } else {
                cakes[i++] = cake;
            }
        }

        return cakes;
    }

    public void showCakes(CakeMenu[] cakes){
        for (CakeMenu cake : cakes) {
            cake.showInfo();
        }
    }

    private CakeMenu createCake() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Provide a name: ");
        String name = scanner.nextLine();

        System.out.print("Provide a flavour: ");
        String flavour = scanner.nextLine();

        System.out.print("Provide a number of layers: ");
        int numberOfLayers = scanner.nextInt();

        return new CakeMenu(name, flavour, numberOfLayers);
    }

    private boolean cakeExists(CakeMenu[] cakes, CakeMenu cakeCandidate) {
        for (CakeMenu cake: cakes) {
            if (cakeCandidate.equals(cake)) {
                return true;
            }
        }
        return false;
    }

}
