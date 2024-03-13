package UsingJava;

import java.util.ArrayList;

public class ShoppingCart {

   private ArrayList<Item> items;
    public ShoppingCart(){
        items = new ArrayList<Item>();
    }

    public void addItem(Item item){
        items.add(item);
    }

    public double calculateTotalPrice(){
        double totalPrice =0;
        for( Item product : items){
            totalPrice = totalPrice + product.getPrice();
        }
        return totalPrice;
    }

    public void displayItem(){
        System.out.println("Items in the shopping cart:  ");
        for (Item item : items){
            System.out.println( "- " + item.getName() + ":  $" +item.getPrice());
        }
    }



    public static void main(String[] args) {

        Item apple = new Item("Apple", 2.50);
        Item banana = new Item("Banana", 1.50);
        Item orange = new Item("Orange", 23.50);

        ShoppingCart cart = new ShoppingCart();

        cart.addItem(apple);
        cart.addItem(banana);
        cart.addItem(orange);

        cart.displayItem();

        double totalPrice = cart.calculateTotalPrice();

        System.out.println("\nTotal price of items in the shopping cart: $" + totalPrice);

        

    }
}
