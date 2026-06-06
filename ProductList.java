import java.util.ArrayList;

public class ProductList {
    ArrayList<Product> productList;

    public ProductList(){
        productList = new ArrayList<>();
    }

    public void addProduct(Product product){
        productList.add(product);
        notifyObservers();
    }
    public void removeProduct(Product product){
        productList.remove(product);
        notifyObservers();
    }
    public void searchProduct(String name){}

    public ArrayList<Product> getProductList(){return productList;}

    public void addObserver(WarehouseObserver observer){}
    public void removeObserver(WarehouseObserver observer){}
    public void notifyObservers(){}

}