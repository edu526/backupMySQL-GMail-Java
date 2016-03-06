package Model;
public class cproduc {
    
    private String idProduc;
    private String nameProduc;
  //  private String fechEmision;
   // private String fechVencimiento;
    //private String descripcionProducto;
    private int stock;
    private double precOriginal;
    private double precVenta;
    private String idProveedor;
    //private String idLaboratorio;
    private String idCategoria;

    public cproduc() {
        idProduc="0";
       // fechEmision="";
        //fechVencimiento="";
    }


    public String getIdProduc() {
        return idProduc;
    }

    public void setIdProduc(String idProduc) {
        this.idProduc = idProduc;
    }

    public String getNameProduc() {
        return nameProduc;
    }

    public void setNameProduc(String nameProduc) {
        this.nameProduc = nameProduc;
    }

    //public String getFechEmision() {
      //return fechEmision;
   // }

    
   //public void setFechEmision(String fechEmision) {
     //   this.fechEmision = fechEmision;
    }

    public String getFechVencimiento() {
        return fechVencimiento;
    }

    public void setFechVencimiento(String fechVencimiento) {
        this.fechVencimiento = fechVencimiento;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecOriginal() {
        return precOriginal;
    }

    public void setPrecOriginal(double precOriginal) {
        this.precOriginal = precOriginal;
    }

    public double getPrecVenta() {
        return precVenta;
    }

    public void setPrecVenta(double precVenta) {
        this.precVenta = precVenta;
    }

    public String getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getIdLaboratorio() {
        return idLaboratorio;
    }

    public void setIdLaboratorio(String idLaboratorio) {
        this.idLaboratorio = idLaboratorio;
    }

    public String getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
    }
