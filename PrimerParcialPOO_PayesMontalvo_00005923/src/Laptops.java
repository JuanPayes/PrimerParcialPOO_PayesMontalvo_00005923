public class Laptops extends Producto implements MetodosPreDesc{
    private String marcaCPU;
    private String marcaGPU;
    @Override
    public float obetenerPrecio(float precio) {
        return 0;
    }

    @Override
    public String  obtenerDescripcion(String descripcion) {
        return descripcion;
    }

    public Laptops(String marcaCPU, String marcaGPU) {
        this.marcaCPU = marcaCPU;
        this.marcaGPU = marcaGPU;
    }

    public Laptops(String nombre, String modelo, String descripcion, float precio, String marcaCPU, String marcaGPU) {
        super(nombre, modelo, descripcion, precio);
        this.marcaCPU = marcaCPU;
        this.marcaGPU = marcaGPU;
    }

    public Laptops(Producto producto, String marcaCPU, String marcaGPU) {
        super(producto);
        this.marcaCPU = marcaCPU;
        this.marcaGPU = marcaGPU;
    }

    public String getMarcaCPU() {
        return marcaCPU;
    }

    public void setMarcaCPU(String marcaCPU) {
        this.marcaCPU = marcaCPU;
    }

    public String getMarcaGPU() {
        return marcaGPU;
    }

    public void setMarcaGPU(String marcaGPU) {
        this.marcaGPU = marcaGPU;
    }
}
