package Model;

import java.sql.Date;

public class cSale {
        
    private int idSale; //idboleta
    private double payment; // fecha
    private String date_buy; // id cliente 
    private int Customer_idCustomer;  // idempleado
    private int Employee_idEmployee;   //total



    public cSale() {
        this.idSale = 0;
        payment=0.00;
    }

    public int getIdSale() {
        return idSale;
    }

    public void setIdSale(int idSale) {
        this.idSale = idSale;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public String getDate_buy() {
        return date_buy;
    }

    public void setDate_buy(String date_buy) {
        this.date_buy = date_buy;
    }

    public int getCustomer_idCustomer() {
        return Customer_idCustomer;
    }

    public void setCustomer_idCustomer(int Customer_idCustomer) {
        this.Customer_idCustomer = Customer_idCustomer;
    }

    public int getEmployee_idEmployee() {
        return Employee_idEmployee;
    }

    public void setEmployee_idEmployee(int Employee_idEmployee) {
        this.Employee_idEmployee = Employee_idEmployee;
    }
    
  }
