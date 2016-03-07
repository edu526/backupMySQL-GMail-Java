package DAO;

    import Model.cProduct;
    import java.util.List;

public interface ProductDao {
    public List<cProduct> list(String q);
    public boolean insert(cProduct p);
    public boolean update(cProduct p);
    public boolean delete(int idProducto);
    public boolean subtractStock(int idProduct, int quantity);
    public cProduct search(int idProduct);
}
