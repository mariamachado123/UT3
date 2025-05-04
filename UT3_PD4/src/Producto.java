public class Producto {
    private String codigo;
    private String descripcion;
    private double precioUnitario;
    private int cantidad;

    public Producto(String codigo, String descripcion, double precioUnitario, int cantidad) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void agregarStock(int cantidad) {
        this.cantidad += cantidad;
    }

    public boolean venderProducto(int cantidad) {
        if (this.cantidad >= cantidad) {
            this.cantidad -= cantidad;
            return true;
        } else {
            // No hay suficiente stock para la venta
            return false;
        }
    }

    public double calcularValorStock() {
        return this.cantidad * this.precioUnitario;
    }

    @Override
    public String toString() {
        return "Producto [Codigo=" + codigo + ", Descripcion=" + descripcion + ", Precio Unitario=" + precioUnitario
                + ", Cantidad=" + cantidad + "]";
    }
}
