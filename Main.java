import java.util.*;

public class Main {
    public static void main(String[] args) { 
        GroceryAdmin gA = GroceryAdmin.getGroceryAdmin();

        // gA.setName("Jeff");

        Date d1 = new Date();
        Item rice = new Item("Rice", 4.99, d1);
        Item bean = new Item("Beans", 4.99, d1);
        Item apple = new Item("Apple", 4.99, d1);
        Item grape = new Item("Grape", 4.99, d1);

        gA.addToInventory(rice);
        gA.addToInventory(bean);
        gA.addToInventory(apple);
        gA.addToInventory(grape);

        System.out.println(gA.getInventoryItemNames());

    }
}
