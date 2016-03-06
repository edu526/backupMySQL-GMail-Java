package Model;
public class cProvider {
    


    private String idProvider;
    private String nameProvider;
    private String lastProvider;
    private String phoneProvider;
    private String descripcionProvider;


    public cProvider() {
        this.idProvider = "0";
        this.nameProvider = "";
        this.lastProvider = "";
        this.phoneProvider = "";
        this.descripcionProvider = "";
    }

    public String getIdProveedor() {
        return idProvider;
    }

    public void setIdProvider(String idProvider) {
        this.idProvider = idProvider;
    }

    public String getNameProvider() {
        return nameProvider;
    }

    public void setNameProvider(String nameProvider) {
        this.nameProvider = nameProvider;
    }

    public String getlastProvider() {
        return lastProvider;
    }

    public void setlastProvider(String lastProvider) {
        this.lastProvider = lastProvider;
    }

    public String getphoneProvider() {
        return phoneProvider;
    }

    public void setphoneProvider(String phoneProvider) {
        this.phoneProvider = phoneProvider;
    }

    public String getdescripcionProvider() {
        return descripcionProvider;
    }

    public void setdescripcionProvider(String descripcionProvider) {
        this.descripcionProvider = descripcionProvider;
    }
    
    
}
