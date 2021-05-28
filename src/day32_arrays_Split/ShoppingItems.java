package day32_arrays_Split;

public class ShoppingItems {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};


        System.out.println("-------Find tha Index of 'Gloves' in item array------");
        //int indexOfGloves = -1;
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("Gloves")) {
                System.out.println("Gloves found at index : " + i);
                break;
            }
        }
        System.out.println("-------set boolean to true if first 'ipad' is found------");
        boolean iPadExists = false;
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("iPads")) {
                iPadExists = true;
                break;

            }

        }
        System.out.println("iPadExsists = " + iPadExists);
        if (iPadExists) {
            System.out.println("We bought the iPad!!");
        } else {
            System.out.println("We forgot the iPad! :(");
        }

        System.out.println("----Print a report of each shopping item ----");
        /**
         Shoes - $99.99 - #12345
         ....
         iphone 12 case - $39.99 - #12350
         */

        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + "- $" + prices[i] + "- #" + itemIDs[i]);

        }
        System.out.println("------Look for 'Jacket' in item and print all details ----");
        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("jacket")) {
                System.out.println(items[i] + "- $" + prices[i] + "- #" + itemIDs[i]);
                break;


            }


        }
    }
}