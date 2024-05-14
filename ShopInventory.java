import java.text.DecimalFormat;

abstract class Item {
    final String name;
    int expiresInDays;
    double price;

    Item(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }
}

interface StorageCondition {}


interface SecureItem extends StorageCondition {
    void attachSecurityTag();
    void removeSecurityTag();
}

interface Refrigerate extends StorageCondition {
    boolean isRefrigerated(double currentTemp);
}

interface ReducedPrice {
    double reduction(double totalAmount);
}

interface OnSale extends ReducedPrice {
    boolean saleCondition(Item[] items);

}

class Milk extends Item implements Refrigerate {
    int MaxRefrigderateTemp;
    private Milk(String name) {
        super(name);
    }
    
    Milk(String name, int expiryDays, double price, int maxRefridgerateTemp) {
        this(name);
        this.expiresInDays = expiryDays;
        this.price = price;
        this.MaxRefrigderateTemp = maxRefridgerateTemp;
    }

    public boolean refrigerate(double currentTemp) {
        if (currentTemp > MaxRefrigderateTemp) {
            return true;
        }
        return false;
    }

    public String storageProcedure() {
        return "refrigeration needed";
    }

    @Override
    public boolean isRefrigerated(double currentTemp) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isRefrigerated'");
    }
}

class Bread extends Item implements StorageCondition {
    private Bread(String name) {
        super(name);
    }

    Bread(String name, int expiryDays, double price) {
        this(name);
        this.expiresInDays = expiryDays;
        this.price = price;
    }

    public String storageProcedure() {
        return "Airtight Storage";
    }
}

class Perfume extends Item implements SecureItem {
    private boolean locked;
    private Perfume(String name) {
        super(name);
    }

    Perfume(String name, int expiryDays, double price) {
        this(name);
        this.expiresInDays = expiryDays;
        this.price = price;
        this.attachSecurityTag();
    }

    public void attachedSecurityTag() {
        this.locked = true;
    }
    
    public boolean getlocked() {
        return this.locked;
    }

    public String storageProcedure() {
        return "Away from Sunlight";
    }

    @Override
    public void attachSecurityTag() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'attachSecurityTag'");
    }

    @Override
    public void removeSecurityTag() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeSecurityTag'");
    }

}

class PlasticCup extends Item {

    private PlasticCup(String name) {
        super(name);
    }

    PlasticCup(String name, int expiryDays, double price) {
        this(name);
        this.expiresInDays = expiryDays;
        this.price = price;
    }

}

class EasterSale implements OnSale {
    final String message;
    final double minimumAmount;
    final double discount;


    EasterSale(double salePercent, double minimumAmount) {
        this.discount = salePercent / 100;
        this.minimumAmount = minimumAmount;
        DecimalFormat format = new DecimalFormat("0.#");
        this.message = "Spend over" + format.format(minimumAmount) + ",Get " + (this.discount*100) + "% off for Easter!";
    }

    public double reduction(double totalAmount) {
        return totalAmount - (totalAmount * discount);
    }

    public boolean saleCondition(Item[] items) {
        double totalAmount = 0;
        for (Item item : items) {
            totalAmount += item.price;
        }
        if (totalAmount > minimumAmount) {
            return true;
        }
        return false;
    }

    public String toString () {
        return this.message;
    }
}

public class ShopInventory {
    public static void main(String[] args) {
        Item[] items = new Item[4];
        items[0] = new Milk("Milk", 10, 2.99, 4);
        items[1] = new Bread("Bread", 5, 1.99);
        items[2] = new Perfume("Perfume", 30, 19.99);
        items[3] = new PlasticCup("Plastic Cup", 100, 0.99);

        for (Item item : items) {
            System.out.println(item.name + " " + item.expiresInDays + " " + item.price);
        }
    }
}