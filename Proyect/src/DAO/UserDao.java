package DAO;

    import Model.cUser;
    import java.util.List;

public interface UserDao {
    public List<cUser> list();
    public boolean insert(cUser user);
    public boolean update(cUser user);
    public boolean delete(int Employee_idEmployee);
    public cUser search(int Employee_idEmployee);
}
