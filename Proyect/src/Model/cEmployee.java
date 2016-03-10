package Model;

import java.sql.Date;

public class cEmployee {
       
    private int idEmployee;     
    private String nameEmployee;
    private String last_name;   
    private String dni;         
    private String cell_phone;  
    private String phone;       
    private String birthdate;     
    private String email;   	
    private String sex;   	
    private int Position_idPosition;

    public cEmployee() {
        this.idEmployee = 0;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCell_phone() {
        return cell_phone;
    }

    public void setCell_phone(String cell_phone) {
        this.cell_phone = cell_phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getPosition_idPosition() {
        return Position_idPosition;
    }

    public void setPosition_idPosition(int Position_idPosition) {
        this.Position_idPosition = Position_idPosition;
    }
    
}
