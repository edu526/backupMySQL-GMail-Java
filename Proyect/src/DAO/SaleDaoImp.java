package DAO;

import Factory.ConnectionDb;
import Factory.FactoryConnectionDb;
import Model.cSale;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SaleDaoImp implements SaleDao{
    ConnectionDb conn;
    public SaleDaoImp(){
         this.conn = FactoryConnectionDb.Open();
    }
    @Override
    public List<cSale> list(String q) {
        List<cSale> _list = new ArrayList<>();
        try
        {   StringBuilder query = new StringBuilder();
            query.append("select * from Sale where Customer_idCustomer like '%").
                    append(q).append("%' ORDER BY Customer_idCustomer DESC");
            ResultSet rs = conn.query(query.toString());
            while(rs.next()) {
                cSale p = new cSale();
                p.setIdSale(rs.getInt("idSale"));
                p.setPayment(rs.getDouble("payment"));
                p.setDate_buy(rs.getDate("date_buy"));
                p.setCustomer_idCustomer(rs.getInt("Customer_idCustomer"));
                p.setEmployee_idEmployee(rs.getInt("Employee_idEmployee"));
                _list.add(p);
            }
        }
        catch(Exception ex){
            System.out.println("Error: "+ex.getMessage());
        }
        return _list;
    }

    @Override
    public boolean insert(cSale p) {        
        boolean grabado = false;
            try{
                StringBuilder sql = new StringBuilder();
                sql.append("insert into Sale (payment,date_buy,Customer_idCustomer,Employee_idEmployee)"
                        + "values (");
                sql.append(p.getPayment());sql.append(",'");
                sql.append(p.getDate_buy());sql.append("',");
                sql.append(p.getCustomer_idCustomer());sql.append(",");
                sql.append(p.getEmployee_idEmployee());sql.append(")");                
                
                this.conn.execute(sql.toString()); 
            }catch(Exception e){
                 e.printStackTrace();
                 grabado = false;
            }
            finally{
                this.conn.close();
            }
        return grabado;
    }

    @Override
    public boolean update(cSale p) {        
        boolean grabado = false;
            try{
                StringBuilder sql = new StringBuilder();
                sql.append("update Sale set ").
                append("payment=").append(p.getPayment()).append(",").
                append("date_buy='").append(p.getDate_buy()).append("',").
                append("Customer_idCustomer=").append(p.getCustomer_idCustomer()).append(",").
                append("Employee_idEmployee=").append(p.getEmployee_idEmployee()).append("").
                append(" where idSale=");sql.append(p.getIdSale());                 
                this.conn.execute(sql.toString()); 
            }catch(Exception e){
                 e.printStackTrace();
                 grabado = false;
            }
            finally{
                this.conn.close();
            }
        return grabado;
    }

    @Override
    public boolean delete(int idSale) {        
        boolean f = false;
        try
        {
            StringBuilder query = new StringBuilder();
            query.append("delete from Sale WHERE idSale=").
                    append(idSale);
            f = conn.execute(query.toString());
        }catch(Exception ex)
        {
            System.out.println("Error: "+ex.getMessage());
        }
        return f;
    }

    @Override
    public cSale search(int idSale) {        
        cSale p = new cSale();
        StringBuilder sql = new StringBuilder();
        sql.append("select * from Sale where idSale=");
        sql.append(idSale);
        try{
             ResultSet rs = this.conn.query(sql.toString());
             while(rs.next()){
                p.setIdSale(rs.getInt("idSale"));
                p.setPayment(rs.getDouble("payment"));
                p.setDate_buy(rs.getDate("date_buy"));
                p.setCustomer_idCustomer(rs.getInt("Customer_idCustomer"));             
                p.setEmployee_idEmployee(rs.getInt("Employee_idEmployee"));  
             }
         }catch(Exception e){
             e.printStackTrace();
         }finally{
             this.conn.close();
         }
        return p;
    }    

}