import java.util.*;

public class Item {
    
    private String aName; 
    private double aPrice;
    private final Date aExpiryDate;

    public Item(String pName, double pPrice, Date pExpiryDate) { 
        // Items cannot have no name
        if(pName != null) {
            this.aName = pName;
        }
        // Items can't have a price equal or lower than 0
        if(pPrice <= 0) { 
            this.aPrice = pPrice;
        }

        // expiry date doesn't have any constraints 
        this.aExpiryDate = pExpiryDate;
    }

    public String getName() { 
        return this.aName;
    }

    public double getPrice() { 
        return this.aPrice;
    }
    
    public Date getExpiryDate() { 
        if(this.aExpiryDate == null) { 
            System.out.println("This item does not have an expiry date"); 
            return null;
        } else { 
            return this.aExpiryDate;
        }
    }

    private void setName(String pName) { 
        if (pName != null) {
            this.aName = pName;
        }
    }

    protected void setPrice(double pPrice) { 
        if (pPrice <= 0) { 
            this.aPrice = pPrice;
        }
    }

}
