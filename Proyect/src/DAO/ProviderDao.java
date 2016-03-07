package DAO;

    import Model.cProvider;
    import java.util.List;

public interface ProviderDao {
    public List<cProvider> list(String q);
    public boolean insert(cProvider p);
    public boolean update(cProvider p);
    public boolean delete(int idProvider);
    public cProvider search(int idProvider);
}
