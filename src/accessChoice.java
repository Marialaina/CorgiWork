import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
public class accessChoice {
    Scanner gets = new Scanner(System.in);
    NumberFormat formatter = new DecimalFormat("##.##");

    String choice;
    double priceTotal = 0;
    String total = "Total :$";
    boolean right = true;
    double access;
    double cost;

    String [] accessories = {"p", "s", "e", "pc","r"};

    public void accessChoice() {
        right = true;
        do {
            System.out.println(" ");
            System.out.println("Choose Accessories!");
            System.out.println("******************************");
            System.out.println(" ");
            System.out.println("Present: $3.29 (p)");
            System.out.println("Santa Hat: $3.50 (s)");
            System.out.println("Elf Ears: $5.49 (e)");
            System.out.println("Pet Carrier: $7.99 (pc)");
            System.out.println("Radio Flyer Wagon: $10.00 (r)");
            String access = gets.nextLine();

            switch (access) {
                case "r":
                    choice = "Present";
                    priceTotal += 10.00;
                    cost = 10.00;
                    System.out.println(total + formatter.format(priceTotal));
                    right = false;
                    break;

                case "p":
                    choice = "Santa Hat";
                    priceTotal += 3.29;
                    cost = 3.29;
                    System.out.println(total + formatter.format(priceTotal));
                    right = false;
                    break;

                case "s":
                    choice = "Elf Ears";
                    priceTotal += 3.50;
                    cost = 3.50;
                    System.out.println(total + formatter.format(priceTotal));
                    right = false;
                    break;

                case "e":
                    choice = "Elf ears";
                    cost = 5.49;
                    priceTotal += 5.49;
                    System.out.println(total + formatter.format(priceTotal));
                    right = false;
                    break;

                case "pc":
                    choice = "Pet Carrier";
                    priceTotal += 7.99;
                    cost = 7.99;

                    System.out.println(total + formatter.format(priceTotal));
                    right = false;
                    break;

                default:
                    String end = "Ooooops! Not an option! Do it again.";
                    System.out.println("");
                    System.out.println(end);
                    break;
            }
        } while (right);

    }
}
