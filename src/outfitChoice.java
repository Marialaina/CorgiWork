import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class outfitChoice {
    Scanner gets = new Scanner(System.in);
    NumberFormat formatter = new DecimalFormat("##.##");

    double size;
    double priceTotal = 0;
    String total = "Total :$";
    boolean right = true;
    double outfit;
    String choice;
    double cost;
    String outfitArray[] = {"e", "h", "s"};

    public void outfitChoice() {

        right = true;
        do {
            System.out.println(" ");
            System.out.println("Choose an Outfit!");
            System.out.println("*************************");
            System.out.println("");
            System.out.println("Elf: $6.49 (e)");
            System.out.println("Holiday Tree: $8.00 (h)");
            System.out.println("Santa: $6.99 (s)");

            String outfit = gets.nextLine(); //user input for the outfit

            switch (outfit) {
                case "e":
                    priceTotal += 6.49;
                    choice = "Elf";
                    cost = 6.49;
                    System.out.println(total + formatter.format(priceTotal));
                    right = false;
                    break;

                case "h":
                    priceTotal += 12.50;
                    choice = "Holiday Tree";
                    cost = 8.00;
                    System.out.println(total + formatter.format(priceTotal));
                    right = false;
                    break;

                case "s":
                    priceTotal += 13.50;
                    choice = "Santa";
                    cost = 13.50;
                    System.out.println(total + formatter.format(priceTotal));
                    right = false;
                    break;

                default:
                    String end = "Ooooops! Not an option! Do it again.";
                    System.out.println(end);
                    break;
            }
        } while (right);
    }//End of void

    public double getPriceTotal() {
        return priceTotal;
    }
}
