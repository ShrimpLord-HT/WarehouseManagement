public class Product {
    private String name;
    private int amount;
    private String description;

    public Product(String name, int amount, String description){
        this.name = name;
        this.amount = amount;
        this.description = description;
    }

    public String getName(){return name;}
    public int getAmount(){return amount;}
    public String getDescription(){return description;}

    public void setName(String name){this.name = name;}
    public void setAmount(int amount){this.amount = amount;}
    public void setDescription(String description){this.description = description;}
}