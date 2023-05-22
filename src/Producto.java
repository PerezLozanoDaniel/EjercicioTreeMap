import java.util.Scanner;

public class Producto implements ICalcular{
    private String nombre;
    private double precio;
    private String codigo;
    Scanner lecturaTeclado = new Scanner(System.in);
    int cantidad;

    public Producto(String nombre, double precio, String codigo) {
        setNombre(nombre);
        setPrecio(precio);
        setCodigo(codigo);
    }

    @Override
    public double calcular() {

        System.out.println("\nIntroduce la catidad de productos: ");
        cantidad=lecturaTeclado.nextInt();
        return (getPrecio()*cantidad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", codigo='" + codigo + '\''+
                '}';
    }
}
