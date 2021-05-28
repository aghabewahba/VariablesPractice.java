package day15_logicalops_switch_ternary;

public class AndOperatorPractice {
    public static void main(String[] args) {
        boolean onSale = true;
        boolean freeShipping = true;
         String itemName = "Wooden Spoon";
         if(onSale && freeShipping){
             System.out.println("Add to cart - " + itemName);
         }else {
            System.out.println("continue shopping for good deal on - " + itemName);
        }
         //add to cart when its freeSipping , onSale and iteaNameis "wooden spoon"
        if (freeShipping && onSale && itemName .equals ("Wooden Spoon")){
            System.out.println("Add to cart -" + itemName);

        }else{
            System.out.println("continue shopping for good deals on -" + itemName);
        }
    }
}
