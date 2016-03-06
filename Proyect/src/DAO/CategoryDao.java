package DAO;

    import Model.cCategory;
    import java.util.List;

public interface CategoryDao {
    public List<cCategory> list(String q);
    public boolean insert(cCategory p);
    public boolean update(cCategory p);
    public boolean delete(int idCategory);
    public cCategory search(int idCategory);
}
