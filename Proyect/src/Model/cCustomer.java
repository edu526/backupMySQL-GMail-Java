package Model;

public class cCustomer {
       
    private int idCustomer;                 //idCustomer int auto_increment primary key,
    private String nameCustomer;                 //nameCustomer varchar(30) not null,
    private String last_name;                //last_name varchar(50) not null,
    private String dni;           //dni varchar(8) not null,
    private String cell_phone;          //cell_phone varchar(9),
    private String phone;               //phone varchar(7),
    private String birthdate;                 //birthdate date not null,
    private String email;   	//email varchar(60),
    private String sex;   	//email varchar(60),

    public cCustomer() {
        this.idCustomer = 0;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
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

    
}
