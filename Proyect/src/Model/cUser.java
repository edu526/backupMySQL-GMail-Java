package Model;

public class cUser{
   
   private int idUser;
   private String user;
   private String pass;
   private int Employee_idEmployee;

   
    public cUser() {
        idUser = 0;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getEmployee_idEmployee() {
        return Employee_idEmployee;
    }

    public void setEmployee_idEmployee(int Employee_idEmployee) {
        this.Employee_idEmployee = Employee_idEmployee;
    }

    
}
