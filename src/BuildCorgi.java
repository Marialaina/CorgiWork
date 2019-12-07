import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class BuildCorgi {
        Scanner gets = new Scanner(System.in);
        NumberFormat formatter = new DecimalFormat("##.##");


        double size;
        double priceTotal = 0;
        String total = "Total :$";
        boolean right = true;
        String color;
        String sizeT;
        String[] soundsArray = {"sr", "lr", "st", "lt"};
        //****************************************************************************************

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
                    String color = "Red and White";
                    sizeT = "small";
                    priceTotal += 11.00;
                    System.out.println(total + formatter.format(priceTotal));
                    right = false;
                    break;

                case "lr":
                    color = "Red and White";
                    sizeT = "large";
                    priceTotal += 12.00;
                    System.out.println(total + formatter.format(priceTotal));
                    right = false;
                    break;

                case "st":
                    color = "Tri-color";
                    sizeT = "small";
                    priceTotal = 12.50;
                    //st = size;
                    System.out.println(total + formatter.format(priceTotal));
                    right = false;
                    break;

                case "lt":
                    color = "Tri-color";
                    sizeT = "large";
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

    public double getPriceTotal() {
        return priceTotal;
    }
}//----------------------Size_Choice_END------------------------------------------


   /* //TODO finish outfit method
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
                    System.out.println(total + formatter.format(priceTotal));
                    right = false;
                    break;

                case "h":
                    priceTotal += 12.50;
                    System.out.println(total + formatter.format(priceTotal));
                    right = false;
                    break;

                case "s":
                    priceTotal += 13.50;
                    System.out.println(total + formatter.format(priceTotal));
                    right = false;
                    break;

                default:
                    String end = "Ooooops! Not an option! Do it again.";
                    System.out.println(end);
                    break;
            }
        } while (right);


    }//--------------------------- outfit_end-----------------------

//    public void soundChoice() {
        right = true;
        do {
            System.out.println(" ");
            System.out.println("Choose a sound for your Corgi!");
            System.out.println("******************************");
            System.out.println(" ");
            System.out.println("Heartbeat: $2.49  (hb)");
            System.out.println("I love you!: $2.99 (ily)");
            System.out.println("Personalized message: $3.49 (pm)");
            System.out.println("Puppy 5-in-1 sounds: $4.99 (p)");
            String sound = gets.nextLine();

            switch (sound) {
                case "hb":
                    priceTotal += 11.00;
                    System.out.println(total + formatter.format(priceTotal));
                    right = false;
                    break;

                case "ily":
                    priceTotal += 12.00;
                    System.out.println(total + formatter.format(priceTotal));
                    right = false;
                    break;

                case "pm":
                    priceTotal += 12.50;
                    System.out.println(total + formatter.format(priceTotal));
                    right = false;
                    break;

                case "p":
                    priceTotal += 13.50;
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

    }//-------------------------- access_end ----------------------------------------------------


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
                    priceTotal += 10.00;
                    System.out.println(total + formatter.format(priceTotal));
                    right = false;
                    break;

                case "p":
                    priceTotal += 3.29;
                    System.out.println(total + formatter.format(priceTotal));
                    right = false;
                    break;

                case "s":
                    priceTotal += 3.50;

                    System.out.println(total + formatter.format(priceTotal));
                    right = false;
                    break;

                case "e":
                    priceTotal += 5.49;

                    System.out.println(total + formatter.format(priceTotal));
                    right = false;
                    break;

                case "pc":
                    priceTotal += 7.99;

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
    } //---------------------------------- sound_end -----------------------------------------
}*/
