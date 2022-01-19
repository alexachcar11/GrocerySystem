import java.util.*;

public class Warehouse {
    
    private ArrayList<Item> stockList; 

    private static Warehouse instance = new Warehouse(); 

    private Warehouse() { 
        stockList = new ArrayList<Item>();
    }

    public static Warehouse getWarehouse(){ 
        return instance;
    }

    public ArrayList<Item> getStock() { 
        return this.stockList;
    }

    public void addItemToStock(Item item) { 
        assert item!=null;

        this.stockList.add(item);
    }

    public void removeStock(Item item) { 
        assert item!=null;

        if(stockList.contains(item)) { 
            stockList.remove(item);
        } else { 
            System.out.println("This item is not in stock already");
        }
    }
}
