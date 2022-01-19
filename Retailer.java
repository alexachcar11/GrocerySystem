import java.util.*;

public class Retailer {
    
    String aName; 
    Optional<GroceryAdmin> aGroceryAdmin;
    double finances; 
    ArrayList<Item> outgoingOrder;

    public Retailer(String pName, Optional<GroceryAdmin> pGroceryAdmin){ 

        if(pName != null) { 
            this.aName = pName;
        }

        aGroceryAdmin = pGroceryAdmin;
        this.finances = 0.0;
        outgoingOrder = new ArrayList<Item>();
    }

    public void placeOrder(Item i) { 
        assert aGroceryAdmin!=null;

        aGroceryAdmin.get().recieveOrder(this, i);

    }
    
}
