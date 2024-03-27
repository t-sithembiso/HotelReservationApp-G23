package za.ac.mycput.domain;
/*Sbonga Shweni 219143188
* https://github.com/SbongaS/HotelReservationApp-G23/tree/master*/
public class Inventory {
 public String inventoryItemID;
 public String type;
 public String name;
 public boolean isAvailable;
 public int quantity;
private Inventory(){

}

    public Inventory(Builder builder) {
        this.inventoryItemID = builder.inventoryItemID;
        this.type = builder.type;
        this.name = builder.name;
        this.isAvailable = builder.isAvailable;
        this.quantity = builder.quantity;
    }

    public String getInventoryItemID() {
        return inventoryItemID;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public boolean getAvailable() {
        return isAvailable;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "InventoryID='" + inventoryItemID + '\'' +
                ", Type='" + type + '\'' +
                ", Name='" + name + '\'' +
                ", isAvailable='" + isAvailable + '\'' +
                ", Quantity='" + quantity + '\'' +
                '}';
    }
    public static class Builder {
        public String inventoryItemID;
        public String type;
        public String name;

        public boolean isAvailable;
        public int quantity;

        public Builder setInventoryItemID(String inventoryItemID) {
            this.inventoryItemID = inventoryItemID;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setIsAvailable(boolean status) {
            isAvailable = isAvailable;
            return this;
        }

        public Builder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }
        public Builder copy(Inventory inventoryItem){
            this.inventoryItemID = inventoryItem.inventoryItemID;
            this.type = inventoryItem.type;
            this.name = inventoryItem.name;
            this.isAvailable = inventoryItem.isAvailable;
            this.quantity = inventoryItem.quantity;

            return this;

        }
        public Inventory build(){return new Inventory(this);}
    }
}
