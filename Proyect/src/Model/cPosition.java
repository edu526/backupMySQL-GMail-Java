package Model;
public class cPosition {

    private String idPosition; //cargo
    private String namePosition;  //nombre del cargo
    private double salary; //sueldo cargo
    private String description; //descripcion de cargo 

    public cPosition() {
        this.idPosition = "0";
        this.namePosition = "";
        this.salary = 0.00;
        this.description= "";
    }

    public String getidPosition() {
        return idPosition;
    }

    public void setidPosition(String idPosition) {
        this.idPosition = idPosition;
    }

    public String getnamePosition() {
        return namePosition;
    }

    public void setNomCargo(String namePosition) {
        this.namePosition = namePosition;
    }

    public double getsalary() {
        return salary;
    }

    public void setsalary(double salary) {
        this.salary = salary;
    }

    public String getdescription() {
        return description;
    }

    public void setdescription(String description) {
        this.description= description;
    }
    
    
}