import java.util.*;

public class GroceryAdmin { 

    private String aName;
    private ArrayList<Item> inventory; 
    private int nameLock = 0;

    private ArrayList<Supplier> supplierList;
    private ArrayList<Retailer> retailerList;

    private static GroceryAdmin instance = new GroceryAdmin(null);

    private GroceryAdmin(String pName) { 

        // MAKE SURE THAT THE GA HAS A NAME BEFORE WE CAN USE IT
        this.aName = pName;
        this.inventory = new ArrayList<Item>();
        this.supplierList = new ArrayList<Supplier>();
        this.retailerList = new ArrayList<Retailer>();

    }

    public static GroceryAdmin getGroceryAdmin(){ 
        return instance;
    }

    public String getName() { 
        return this.aName;
    }

    public void setName(String pName) { 
        if(nameLock == 1) { 
            System.out.println("The name of this Grocery Admin has already been set");
        } else { 
            this.aName = pName;
            nameLock = 1;
        }
    }

    private ArrayList<Item> getInventoryContents() { 
        if(this.aName == null) {
            throw new IllegalAccessError("Please set up the Grocery Administrator before using its functionality");
        }

        return this.inventory;
    }
  
    public void addToInventory(Item item){ 
        if(this.aName == null) {
            throw new IllegalAccessError("Please set up the Grocery Administrator before using its functionality");
        }

        if(item != null) {
            inventory.add(item);
        } else { 
            throw new IllegalArgumentException();
        }
    }

    public List<String> getInventoryItemNames() { 

        if(this.aName == null) {
            throw new IllegalAccessError("Please set up the Grocery Administrator before using its functionality");
        }
 
        List<String> names = new ArrayList<String>();
        for(Item i : this.getInventoryContents()) { 
            names.add(i.getName());
        }
        return names;
    }

    public void registerSupplier(Supplier supplier) { 
        assert supplier != null;
        
        if(supplierList.contains(supplier)){
            System.out.println("This supplier is already registered");
        } else {
            supplierList.add(supplier);
        }
    }

    public void removeSupplier(Supplier supplier) { 
        if(!supplierList.contains(supplier)) { 
            System.out.println("This supplier does not exist in our current supplier list");
        } else { 
            supplierList.remove(supplier);
        }

    }

    public void registerRetailer(Retailer retailer) { 
        assert retailer != null;
        
        if(retailerList.contains(retailer)){
            System.out.println("This retailer is already registered");
        } else {
            retailerList.add(retailer);
        }
    }

    public void removeRetailer(Retailer retailer) { 
        if(!retailerList.contains(retailer)) { 
            System.out.println("This retailer does not exist in our current supplier list");
        } else { 
            retailerList.remove(retailer);
        }

    }

    private void updateRetailerFinances(Retailer retailer) { 

    }

    public void recieveOrder(Retailer retailer, Item i) { 
        assert retailerList.contains(retailer);

        retailer.outgoingOrder.add(i);
        retailer.finances+=i.getPrice();
    }

}