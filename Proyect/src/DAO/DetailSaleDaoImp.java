package DAO;

import Factory.ConnectionDb;
import Factory.FactoryConnectionDb;
import Model.cDetailSale;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DetailSaleDaoImp implements DetailSaleDao{
    ConnectionDb conn;
    public DetailSaleDaoImp(){
         this.conn = FactoryConnectionDb.Open();
    }
    @Override
    public List<cDetailSale> list(String q) {
        List<cDetailSale> _list = new ArrayList<>();
        try
        {   StringBuilder query = new StringBuilder();
            query.append("select * from DetailSale where Sale_idSale like '").
                    append(q).append("' ORDER BY idDetailSale DESC");
            ResultSet rs = conn.query(query.toString());
            while(rs.next()) {
                cDetailSale p = new cDetailSale();
                p.setIdDetailSale(rs.getInt("idDetailSale"));
                p.setQuantity(rs.getInt("quantity"));
                p.setPrice(rs.getDouble("price"));
                p.setSale_idSale(rs.getInt("Sale_idSale"));
                p.setProduct_idProduct(rs.getInt("Product_idProduct"));
                _list.add(p);
            }
        }
        catch(Exception ex){
            System.out.println("Error: "+ex.getMessage());
        }
        return _list;
    }

    @Override
    public boolean insert(cDetailSale p) {        
        boolean grabado = false;
            try{
                StringBuilder sql = new StringBuilder();
                sql.append("insert into DetailSale (idDetailSale,quantity,price,Sale_idSale,"
                        + "Product_idProduct) "
                        + "values (");
                sql.append(p.getIdDetailSale());sql.append(",");
                sql.append(p.getQuantity());sql.append(",");
                sql.append(p.getPrice());sql.append(",");
                sql.append(p.getSale_idSale());sql.append(",");
                sql.append(p.getProduct_idProduct());sql.append(")");                
                
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
    public boolean update(cDetailSale p) {        
        boolean grabado = false;
            try{
                StringBuilder sql = new StringBuilder();
                sql.append("update DetailSale set ").
                append("quantity=").append(p.getQuantity()).append(",").
                append("price=").append(p.getPrice()).append(",").
                append("Sale_idSale=").append(p.getSale_idSale()).append(",").
                append("Product_idProduct=").append(p.getProduct_idProduct()).
                append(" where idDetailSale=");sql.append(p.getIdDetailSale());                 
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
    public boolean delete(int idDetailSale) {        
        boolean f = false;
        try
        {
            StringBuilder query = new StringBuilder();
            query.append("delete from DetailSale WHERE idDetailSale=").
                    append(idDetailSale);
            f = conn.execute(query.toString());
        }catch(Exception ex)
        {
            System.out.println("Error: "+ex.getMessage());
        }
        return f;
    }

    @Override
    public cDetailSale search(int idDetailSale) {        
        cDetailSale p = new cDetailSale();
        StringBuilder sql = new StringBuilder();
        sql.append("select * from DetailSale where idDetailSale=");
        sql.append(idDetailSale);
        try{
             ResultSet rs = this.conn.query(sql.toString());
             while(rs.next()){
                p.setIdDetailSale(rs.getInt("idDetailSale"));
                p.setQuantity(rs.getInt("quantity"));
                p.setPrice(rs.getDouble("price"));
                p.setSale_idSale(rs.getInt("Sale_idSale"));
                p.setProduct_idProduct(rs.getInt("Product_idProduct"));           
             }
         }catch(Exception e){
             e.printStackTrace();
         }finally{
             this.conn.close();
         }
        return p;
    }    

}