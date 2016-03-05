package Model;
public class cPerson {
       
    private String cod;
    private String DNI;
    private String name;
    private String last_name;
    private String cell_phone;
    private String email;
    private String sex;
    private String birthdate;

    public cPerson(String cod, String DNI, String name, String last_name, String cell_phone, String email, String sex, String birthdate) {
        this.cod = "0";
        this.DNI = DNI;
        this.name = name;
        this.last_name = last_name;
        this.cell_phone =cell_phone;
        this.email = email;
        this.sex = sex;
        this.birthdate = birthdate;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String  last_name) {
        this.last_name = last_name;
    }

  
    public String getCell_phone() {
        return cell_phone;
    }

    public void setCell_phone(String cell_phone) {
        this.cell_phone = cell_phone;
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

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate= birthdate;
    }
    
    
}
