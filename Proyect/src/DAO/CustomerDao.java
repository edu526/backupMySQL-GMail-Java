package DAO;

    import Model.cCustomer;
    import java.util.List;

public interface CustomerDao {
    public List<cCustomer> list(String q);
    public boolean insert(cCustomer p);
    public boolean update(cCustomer p);
    public boolean delete(int idCustomer);
    public cCustomer search(int idCustomer);
}
