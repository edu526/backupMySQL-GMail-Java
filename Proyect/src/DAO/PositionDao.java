package DAO;

    import Model.cPosition;
    import java.util.List;

public interface PositionDao {
    public List<cPosition> list(String q);
    public boolean insert(cPosition p);
    public boolean update(cPosition p);
    public boolean delete(int idPosition);
    public cPosition search(int idPosition);
}
