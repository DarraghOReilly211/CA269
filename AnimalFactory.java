interface SafetyRegulations {
    int getMaxItemsPermited();
}

abstract class Item implements SafetyRegulations {}

class Duck extends Item {
    private static final int MAX_ITEMS_PERMITED = 5;
    public int getMaxItemsPermited() {
        return MAX_ITEMS_PERMITED;
    }
}

class Swan extends Item {
    private static final int MAX_ITEMS_PERMITED = 2;
    public int getMaxItemsPermited() {
        return MAX_ITEMS_PERMITED;
    }
}

class Dog extends Item {
    private static final int MAX_ITEMS_PERMITED = 1;
    public int getMaxItemsPermited() {
        return MAX_ITEMS_PERMITED;
    }
}

class Cat extends Item {
    private static final int MAX_ITEMS_PERMITED = 1;
    public int getMaxItemsPermited() {
        return MAX_ITEMS_PERMITED;
    }
}

class AnimalFactory<T extends Item & SafetyRegulations> {
    private int unitsproduced = 0;
    


    
}