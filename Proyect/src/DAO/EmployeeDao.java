package DAO;

    import Model.cEmployee;
    import java.util.List;

public interface EmployeeDao {
    public List<cEmployee> list(String q);
    public boolean insert(cEmployee p);
    public boolean update(cEmployee p);
    public boolean delete(int idEmployee);
    public cEmployee search(int idEmployee);
}
