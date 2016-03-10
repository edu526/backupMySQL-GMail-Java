package DAO;

import Factory.ConnectionDb;
import Factory.FactoryConnectionDb;
import Model.cProduct;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductDaoImp implements ProductDao{
    ConnectionDb conn;
    public ProductDaoImp(){
         this.conn = FactoryConnectionDb.Open();
    }
    @Override
    public List<cProduct> list(String q) {
        List<cProduct> _list = new ArrayList<>();
        try
        {   StringBuilder query = new StringBuilder();
            query.append("select * from Product where nameProduct like '%").
                    append(q).append("%' ORDER BY nameProduct DESC");
            ResultSet rs = conn.query(query.toString());
            while(rs.next()) {
                cProduct p = new cProduct();
                p.setIdProduct(rs.getInt("idProduct"));
                p.setNameProduct(rs.getString("nameProduct"));
                p.setPrice(rs.getDouble("price"));
                p.setQuantity(rs.getInt("quantity"));
                p.setCategory_idCategory(rs.getInt("Category_idCategory"));
                p.setProvider_idProvider(rs.getInt("Provider_idProvider"));
                _list.add(p);
            }
        }
        catch(Exception ex){
            System.out.println("Error: "+ex.getMessage());
        }
        return _list;
    }

    @Override
    public boolean insert(cProduct p) {        
        boolean grabado = false;
            try{
                StringBuilder sql = new StringBuilder();
                sql.append("insert into Product (nameProduct,price,quantity,"
                        + "Category_idCategory,Provider_idProvider) "
                        + "values (");
                sql.append("'"); sql.append(p.getNameProduct());sql.append("',");
                sql.append(p.getPrice());sql.append(",");
                sql.append(p.getQuantity());sql.append(",");
                sql.append(p.getCategory_idCategory());sql.append(",");
                sql.append(p.getProvider_idProvider());sql.append(")");                
                
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
    public boolean update(cProduct p) {        
        boolean grabado = false;
            try{
                StringBuilder sql = new StringBuilder();
                sql.append("update Product set ").
                append("nameProduct='").append(p.getNameProduct()).append("',").
                append("price=").append(p.getPrice()).append(",").
                append("quantity=").append(p.getQuantity()).append(",").
                append("Category_idCategory=").append(p.getCategory_idCategory()).append(",").
                append("Provider_idProvider=").append(p.getProvider_idProvider()).
                append(" where idProduct=");sql.append(p.getIdProduct());                 
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
    public boolean delete(int idProduct) {        
        boolean f = false;
        try
        {
            StringBuilder query = new StringBuilder();
            query.append("delete from Product WHERE idProduct=").
                    append(idProduct);
            f = conn.execute(query.toString());
        }catch(Exception ex)
        {
            System.out.println("Error: "+ex.getMessage());
        }
        return f;
    }

    @Override
    public cProduct search(int idProducto) {        
        cProduct p = new cProduct();
        StringBuilder sql = new StringBuilder();
        sql.append("select * from Product where idProduct=");
        sql.append(idProducto);
        try{
             ResultSet rs = this.conn.query(sql.toString());
             while(rs.next()){
                p.setIdProduct(rs.getInt("idProduct"));
                p.setNameProduct(rs.getString("nameProduct"));
                p.setPrice(rs.getDouble("price"));
                p.setQuantity(rs.getInt("quantity"));
                p.setCategory_idCategory(rs.getInt("Category_idCategory"));
                p.setProvider_idProvider(rs.getInt("Provider_idProvider"));            
             }
         }catch(Exception e){
             e.printStackTrace();
         }
        return p;
    }    

    @Override
    public boolean subtractStock(int idProduct, int quantity) {
        boolean grabado = false;
            try{
                StringBuilder sql = new StringBuilder();
                sql.append("update Product set ").
                append("quantity=quantity -").append(quantity).
                append(" where idProduct=");sql.append(idProduct);                 
                this.conn.execute(sql.toString()); 
            }catch(Exception e){
                 e.printStackTrace();
                 grabado = false;
            }
        return grabado;
    }

}