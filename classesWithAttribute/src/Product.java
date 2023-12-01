public class Product {
    //attribute & field
    private int id;
    private String name;
    private String description;
    private double price;
    private int stokAmount;


    public int getId(){
        return id;
    }
    public void setId(int id){
       this.id=id;
       // _id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStokAmount() {
        return stokAmount;
    }

    public void setStokAmount(int stokAmount) {
        this.stokAmount = stokAmount;
    }
}
