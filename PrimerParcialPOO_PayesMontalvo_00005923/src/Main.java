import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList listaProductos = new ArrayList<Producto>();

        menu();
    }
    static void menu(){
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("Bienvenido a nuestra tienda ElectroMart");
            System.out.println("\t1. Agregar producto");
            System.out.println("\t2 modificar producto");
            System.out.println("\t3 ver lista de productos");
            System.out.println("opcion ->");
            try{
                opcion = sc.nextInt();

                switch (opcion){
                    case 1:
                        agregarProductos();
                        break;
                    case 2:
                        modificar();
                        break;
                    case 3:
                        mostrarLista();
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        break;
                    case 0:
                        System.out.println("Se va cerrar el programa");

                }

            }catch (InputMismatchException e){
                System.out.println("Opcion no valida");
                sc.nextLine();
            }
        }while (opcion != 0);
    }

    private static int tipoProducto(){

        Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.println("Ingrese que tipo de Producto quiere:");
        System.out.println("\t1. Movil");
        System.out.println("\t2. Telefono");
        System.out.println("\t3 .Laptop");
        System.out.println("\t0. salir");
        opcion = sc.nextInt();
        return opcion;
    }
    private static void agregarProductos() {
        ArrayList listaProductos = new ArrayList<>();

        Moviles movil= null;
        Telefono telefono = null;
        Laptops laptops = null;
        Scanner sc = new Scanner(System.in);
        int eleccionProducto = tipoProducto();
        System.out.println("Ingrese nombre del producto: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese modelo del producto: ");
        String modelo = sc.nextLine();
        System.out.println("Ingrese la descripcion del del producto: ");
        String descripcion = sc.nextLine();
        System.out.println("Ingrese precio del producto: ");
        float precio = sc.nextFloat();
        sc.nextLine();
        switch (eleccionProducto){
            case 1:
                System.out.println("Ingrese el sistema operativo");
                String OS = sc.nextLine();
                System.out.println("Ingrese el tipo de pantalla: ");
                String pantalla = sc.nextLine();

                    movil = new Moviles(nombre, modelo, descripcion, precio, OS, pantalla);
                    listaProductos.add(movil);
                break;
            case 2:
                System.out.println("Ingrese el nombre de la red");
                String red = sc.nextLine();
                System.out.println("Ingese el anio de salida");
                String anioSalida  = sc.nextLine();

                        telefono = new Telefono(nombre, modelo, descripcion, precio, red, anioSalida);
                        listaProductos.add(telefono);
                    break;
            case 3:
                System.out.println("Ingrese la marca del CPU");
                String marcaCPU = sc.nextLine();
                System.out.println("Ingrese la marca de la GPU");
                String marcaGPU = sc.nextLine();

                laptops = new Laptops(nombre, modelo, descripcion, precio, marcaCPU, marcaGPU);
                listaProductos.add(laptops);
                break;
        }

    }
    public static void modificar() {
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Ingrese el nombre del producto:");
        String nombre = sc.nextLine();

        for (int i = 0; i < listaProductos.get(i);i++){
            if(listaProductos.get(i).getNombre().equals(nombe)){
                System.out.println("Ingrese el nuevo salario");
                float salario = sc.nextFloat();

                listaProductos.get(i).setSalario(salario);
            }
        }
    }

    public static void mostrarLista(){

        for (int i = 0; i < listaProductos.size();i++){
            System.out.println("Nombre: " + listaProductos.get(i).getNombre());
            System.out.println("modelo: "+ listaProductos.get(i).getMOdelo());
            System.out.println("descripcion" + listaProductos.get(i).getDescripcion());
            System.out.println("precio: "+ listaProductos.get(i).getPrecio());
        }
    }
}

