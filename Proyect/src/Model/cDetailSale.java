package Model;
public class cDetailSale {
    

    private String idDetailSale; //iddetalle
    private int quantity;  //cantidad
    private double price; //preicounitario
    private String idSale;  //idboleta
    private String idProduc;  //idprofducto

    public cDetailSale(String idDetailSale, int quantity, double price, String idSale, String idProduc) {
        this.idDetailSale = idDetailSale;
        this.quantity = quantity;
        this.price= price;
             this.idSale = idSale;
        this.idProduc = idProduc;
    }

    public cDetailSale() {
        idDetailSale="0";
    }

    public String getIdDetailSale() {
        return idDetailSale;
    }

    public void setIdDetailSale(String idDetailSale) {
        this.idDetailSale = idDetailSale;
    }

    public int getquantity() {
        return quantity;
    }

    public void setquantity(int quantity) {
        this.quantity= quantity;
    }

    public double getprice() {
        return price;
    }

    public void setprice(double price) {
        this.price = price;
    }

    
    public String getIdidSale() {
        return idSale;
    }

    public void setIdidSale(String idSale) {
        this.idSale = idSale;
    }

    public String getIdProduc() {
        return idProduc;
    }

    public void setIdProduc(String idProduc) {
        this.idProduc = idProduc;
    }
    
    
    
}
