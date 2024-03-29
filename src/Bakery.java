import java.util.ArrayList;
import java.util.Date;

public class Bakery {
    private String name;
    private int price;
    private int expirationDate;
    private String restrictions;
    private boolean isInStock;

    //default constructor
    public Bakery() {
    }

    ;

    //overload constructor

    public Bakery(String name, int price, int expirationDate, String restrictions, boolean isInStock) {
        this.name = name;
        this.restrictions = restrictions;
        this.expirationDate = expirationDate;
        this.price = price;
        this.isInStock = isInStock;
    }

    public void getDisplayText() {
        System.out.println("Name "+ name);
        System.out.println("Expiration date : "+expirationDate);
        System.out.println("price :  "+ price);
        System.out.println("Is it in Stock? "+ isInStock);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(int expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getRestrictions() {
        return restrictions;
    }

    public void setRestrictions(String restrictions) {
        this.restrictions = restrictions;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean getIsInStock(boolean b) {
        return isInStock;
    }

    public void setIsInStock(boolean isInStock) {
        this.isInStock = isInStock;
    }

}

