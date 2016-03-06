package Model;
public class cDetailSale {
    
    private int idDetailSale; //iddetalle
    private int quantity;  //cantidad
    private double price; //preicounitario
    private int Sale_idSale;  //idboleta
    private int Product_idProduct;  //idprofducto

    public cDetailSale() {
        idDetailSale=0;
    }

    public int getIdDetailSale() {
        return idDetailSale;
    }

    public void setIdDetailSale(int idDetailSale) {
        this.idDetailSale = idDetailSale;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSale_idSale() {
        return Sale_idSale;
    }

    public void setSale_idSale(int Sale_idSale) {
        this.Sale_idSale = Sale_idSale;
    }

    public int getProduct_idProduct() {
        return Product_idProduct;
    }

    public void setProduct_idProduct(int Product_idProduct) {
        this.Product_idProduct = Product_idProduct;
    }

}
