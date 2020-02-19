package tabUniqueObjects;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CakeFactory factory = new CakeFactory();

        System.out.println("              (        (\n" +
                "             ( )      ( )          (\n" +
                "      (       Y        Y          ( )\n" +
                "     ( )     |\"|      |\"|          Y\n" +
                "      Y      | |      | |         |\"|\n" +
                "     |\"|     | |.-----| |---.___  | |\n" +
                "     | |  .--| |,~~~~~| |~~~,,,,'-| |\n" +
                "     | |-,,~~'-'___   '-'       ~~| |._\n" +
                "    .| |~       // ___            '-',,'.\n" +
                "   /,'-'     <_// // _  __             ~,\\\n" +
                "  / ;     ,-,     \\\\_> <<_______________;_)\n" +
                "  | ;    {(_)} _,      . |================|\n" +
                "  | '-._ ~~,,,           | ,,             |\n" +
                "  |     '-.__ ~~~~~~~~~~~|________________|   \n" +
                "  |\\         `'----------|\n" +
                "  | '=._                 |\n" +
                "  :     '=.__            |\n" +
                "   \\         `'==========|\n" +
                "    '-._                 |\n" +
                "        '-.__            |\n" +
                "             `'----------|");

        System.out.println("Create your own cakes menu! \nHow many cakes would you like to add?");
        final int numberOfCakes = new Scanner(System.in).nextInt();
        CakeMenu[] cakes = factory.createCakeMenu(numberOfCakes);

        System.out.println();
        factory.showCakes(cakes);

    }
}
