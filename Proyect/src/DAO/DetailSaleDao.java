package DAO;

    import Model.cDetailSale;
    import java.util.List;

public interface DetailSaleDao {
    public List<cDetailSale> list(String q);
    public boolean insert(cDetailSale p);
    public boolean update(cDetailSale p);
    public boolean delete(int idDetailSale);
    public cDetailSale search(int idDetailSale);
}
