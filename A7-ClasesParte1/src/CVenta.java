import java.util.Date;

public class CVenta {
    private String idVenta;
    private String tipoDocumento;
    private String nroDocumento;
    private Date fechaVenta;
    private int idVendedor;
    private int idCliente;
    private double precioTotal;
    private double igv;
    private double descuento;
    private String estado;

    public CVenta(String idVenta, String tipoDocumento, String nroDocumento, Date fechaVenta, int idVendedor, int idCliente, double precioTotal, double igv, double descuento, int idDetalleVenta, String estado) {
        this.idVenta = idVenta;
        this.tipoDocumento = tipoDocumento;
        this.nroDocumento = nroDocumento;
        this.fechaVenta = fechaVenta;
        this.idVendedor = idVendedor;
        this.idCliente = idCliente;
        this.precioTotal = precioTotal;
        this.igv = igv;
        this.descuento = descuento;
        this.estado = estado;

    }

    public String getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(String idVenta) {
        this.idVenta = idVenta;
    }

    public String getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(String nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
