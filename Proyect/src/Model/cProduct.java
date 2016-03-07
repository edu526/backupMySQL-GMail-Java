package Model;
public class cProduct {
    
    private int idProduct;
    private String nameProduct;
    private double price;
    private int quantity;
    private int Category_idCategory;
    private int Provider_idProvider;

    public cProduct() {
        idProduct=0;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCategory_idCategory() {
        return Category_idCategory;
    }

    public void setCategory_idCategory(int Category_idCategory) {
        this.Category_idCategory = Category_idCategory;
    }

    public int getProvider_idProvider() {
        return Provider_idProvider;
    }

    public void setProvider_idProvider(int Provider_idProvider) {
        this.Provider_idProvider = Provider_idProvider;
    }
    
    
}