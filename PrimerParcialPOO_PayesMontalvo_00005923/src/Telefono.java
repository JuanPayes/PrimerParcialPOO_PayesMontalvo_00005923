public class Telefono extends Producto implements MetodosPreDesc{
    private String red;
    private String anioSalida;
    @Override
    public float obetenerPrecio(float precio) {
        return precio;
    }

    @Override
    public String obtenerDescripcion(String descripcion) {
        return descripcion;
    }

    public Telefono(String red, String anioSalida) {
        this.red = red;
        this.anioSalida = anioSalida;
    }

    public Telefono(String nombre, String modelo, String descripcion, float precio, String red, String anioSalida) {
        super(nombre, modelo, descripcion, precio);
        this.red = red;
        this.anioSalida = anioSalida;
    }

    public Telefono(Producto producto, String red, String anioSalida) {
        super(producto);
        this.red = red;
        this.anioSalida = anioSalida;
    }

    public String getRed() {
        return red;
    }

    public void setRed(String red) {
        this.red = red;
    }

    public String getAnioSalida() {
        return anioSalida;
    }

    public void setAnioSalida(String anioSalida) {
        this.anioSalida = anioSalida;
    }
}
