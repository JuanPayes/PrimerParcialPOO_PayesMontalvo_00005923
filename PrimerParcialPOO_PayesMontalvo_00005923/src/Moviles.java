public class Moviles extends Producto implements MetodosPreDesc{
    private String OS;
    private String pantalla;
    public Moviles() {
    }

    public Moviles(String nombre, String modelo, String descripcion, float precio, String OS, String pantalla) {
        super(nombre, modelo, descripcion, precio);
        this.OS = OS;
        this.pantalla = pantalla;
    }

    public Moviles(Producto producto, String OS, String pantalla){
        super(producto);
        this.OS = OS;
        this.pantalla = pantalla;
    }
    @Override
    public float obetenerPrecio(float precio) {
        return precio;
    }

    @Override
    public String obtenerDescripcion(String descripcion) {
        return descripcion;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }
}
