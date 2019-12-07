import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;






public class sizeChoice {
    Scanner gets = new Scanner(System.in);
    NumberFormat formatter = new DecimalFormat("##.##");

    double size;
    double priceTotal = 0;
    String total = "Total :$";
    boolean right = true;
//    double outfit;
//    double sound;
//    double access;
    public void sizeChoice() {
        right = true;
        do {
            System.out.println("Choose a size for your Corgi!");
            System.out.println("******************************");
            System.out.println("Red and White:\tSmall $11.00 (sr)");
            System.out.println("\t\t\t\t\t\tLarge $12.00 (lr)");
            System.out.println("Tri-Color:\tSmall $12.50 (st)");
            System.out.println("\t\t\t\tLarge $13.50 (lt)");
            String size = gets.nextLine();

            switch (size) {
                case "sr":
                    priceTotal = 11.00;
                    System.out.println(total + formatter.format(priceTotal));
                    right = false;
                    break;

                case "lr":
                    priceTotal += 12.00;
                    //lr = size;
                    System.out.println(total + formatter.format(priceTotal));
                    right = false;
                    break;

                case "st":
                    priceTotal = 12.50;
                    //st = size;
                    System.out.println(total + formatter.format(priceTotal));
                    right = false;
                    break;

                case "lt":
                    priceTotal = 13.50;
                    //lt = size;
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
