package tabUniqueObjects;

import java.util.Objects;
import java.util.Scanner;

public class CakeFactory {
    int numberOfCakes;

    private CakeMenu addCake() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Provide a name: ");
        String name = scanner.nextLine();
        System.out.print("Provide a flavour: ");
        String flavour = scanner.nextLine();
        System.out.print("Provide a number of layers: ");
        int numberOfLayers = scanner.nextInt();
        CakeMenu cake = new CakeMenu(name, flavour, numberOfLayers);
        return cake;
    }

    CakeMenu[] createCakeMenu(int numberOfCakes) {
        /*Przy próbie dodania do tablicy obiektu, który już w niej istnieje program powinien wyświetlić komunikat o duplikacie
        i ponowić próbę dodawania obiektu aż do skutku (aż podane dane będą unikalne a tablica się wypełni).
         */

        CakeMenu[] cakes = new CakeMenu[numberOfCakes];
        boolean isWithinMenu = true;
        boolean isDuplicated = true;
        System.out.println("Add "+numberOfCakes+" cakes to the menu: ");

        int counter=0;
        while (isWithinMenu){
            for (int i = 0; i <numberOfCakes; i++) {
                    System.out.println("---> Cake nr " + (i + 1));
                    cakes[i] = addCake();

                if (i==1){
                    while(cakes[i].equals(cakes[i-1])){
                        System.out.println("This cake exists in the menu, Provide other cake.");
                        cakes[i] = addCake();
                    }
                }

                else if (i==2){
                    while(cakes[i].equals(cakes[i-1]) || cakes[i].equals(cakes[i-2])){
                        System.out.println("This cake exists in the menu, Provide other cake.");
                        cakes[i] = addCake();
                    }
                }
                else if (i==3){
                    while (cakes[i].equals(cakes[i-1]) || cakes[i].equals(cakes[i-2]) || cakes[i].equals(cakes[i-3])){
                        System.out.println("This cake exists in the menu, Provide other cake.");
                        cakes[i] = addCake();
                    }
                }
            }
            isWithinMenu = false;
        }
        return cakes;
    }

    public void showCakes(CakeMenu[] cakes){
        for (CakeMenu cake : cakes) {
            cake.showInfo();
        }
    }


}



