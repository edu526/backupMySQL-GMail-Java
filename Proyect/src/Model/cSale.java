package Model;
public class cSale {
        
    private String idSale; //idboleta
    private String date_BUY; // fecha
    private String idCustome; // id cliente 
    private String idEmpleado;  // idempleado
    private double payment;   //total

    public cSale(String idSale, String date_BUY, String idCustome, String idEmpleado, double payment) {
        this.idSale = idSale;
        this.date_BUY = date_BUY;
        this.idCustome = idCustome;
        this.idEmpleado = idEmpleado;
        this.payment =payment ;
    }

    public cSale() {
        this.idSale = "0";
        payment=0.00;
    }
    
    public String getIdsale() {
        return idSale;
    }

    public void setIdSale(String idSale) {
        this.idSale = idSale;
    }

    public String getDate_BUY() {
        return date_BUY;
    }

    public void setDate_BUY(String date_BUY) {
        this.date_BUY = date_BUY;
    }

    public String getIdCustome() {
        return idCustome;
    }

    public void setIdCustome(String idCustome) {
        this.idCustome = idCustome;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }
  }
