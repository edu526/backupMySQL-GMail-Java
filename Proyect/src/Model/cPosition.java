package Model;
public class cPosition {

    private int idPosition; //cargo
    private String namePosition;  //nombre del cargo
    private String description; //descripcion de cargo 
    private double salary; //sueldo cargo

    public cPosition() {
        this.idPosition = 0;
        this.namePosition = "";
        this.salary = 0.00;
        this.description= "";
    }

    public int getIdPosition() {
        return idPosition;
    }

    public void setIdPosition(int idPosition) {
        this.idPosition = idPosition;
    }

    public String getNamePosition() {
        return namePosition;
    }

    public void setNamePosition(String namePosition) {
        this.namePosition = namePosition;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}