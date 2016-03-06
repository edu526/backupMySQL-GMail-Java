package Model;
public class cProvider {
    
}

    private String idProvider;
    private String nameProvider;
    private String lastProvider;
    private String phoneProvider;
    private String descripcionProvider;


    public cProveedor() {
        this.idProvider = "0";
        this.nomProveedor = "";
        this.direcProveedor = "";
        this.phoneProvider = "";
        this.descripcionProveedor = "";
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

    public String getDirecProveedor() {
        return direcProveedor;
    }

    public void setDirecProveedor(String direcProveedor) {
        this.direcProveedor = direcProveedor;
    }

    public String getTelfProveedor() {
        return telfProveedor;
    }

    public void setTelfProveedor(String telfProveedor) {
        this.telfProveedor = telfProveedor;
    }

    public String getDescripcionProveedor() {
        return descripcionProveedor;
    }

    public void setDescripcionProveedor(String descripcionProveedor) {
        this.descripcionProveedor = descripcionProveedor;
    }
    
    
}
