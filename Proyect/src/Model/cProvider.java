package Model;
public class cProvider {
  
    private int idProvider;     
    private String nameProvider;
    private String addres;	
    private String cell_phone;	
    private String phone;	

    

    public cProvider() {
        this.idProvider = 0;
    }

    public cProvider(int idProvider, String nameProvider, String addres, String cell_phone, String phone) {
        this.idProvider = idProvider;
        this.nameProvider = nameProvider;
        this.addres = addres;
        this.cell_phone = cell_phone;
        this.phone = phone;
    }
    
    public int getIdProvider() {
        return idProvider;
    }

    public void setIdProvider(int idProvider) {
        this.idProvider = idProvider;
    }

    public String getNameProvider() {
        return nameProvider;
    }

    public void setNameProvider(String nameProvider) {
        this.nameProvider = nameProvider;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
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
    
    
}