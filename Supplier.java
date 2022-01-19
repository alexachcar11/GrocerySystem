import java.util.*;

public class Supplier {

    private ArrayList<Item> itemList;
    private String aName;

    public Supplier(String pName) { 

        itemList = new ArrayList<Item>();
        this.aName = pName;

    }

    public void addItem(Item item) { 
        assert item!= null;

        this.itemList.add(item); 
    }

    public String getName() { 
        return this.aName;
    }

    public ArrayList<Item> getItemList() { 
        return this.itemList;
    }

    private void updateProductPrice(Item item, double price) { 
        assert item!=null && price!=0;
        item.setPrice(price);
    }

    

}
