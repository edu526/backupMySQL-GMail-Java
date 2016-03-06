package DAO;

    import Model.cSale;
    import java.util.List;

public interface SaleDao {
    public List<cSale> list(String q);
    public boolean insert(cSale p);
    public boolean update(cSale p);
    public boolean delete(int idBoleta);
    public cSale search(int idBoleta);
}
