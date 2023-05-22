import java.util.Scanner;

public class NoPerecedero implements ICalcular{

    private String tipo="No Perecedero";

    Producto datosProducto;

    public NoPerecedero(Producto datosProducto) {
        setTipo();
        setDatosProducto(datosProducto);
    }


    @Override
    public double calcular() {
        Scanner lecturaTeclado = new Scanner(System.in);

        System.out.println("\nIntroduce la catidad de productos no perecederos: ");

        return (this.datosProducto.getPrecio()*lecturaTeclado.nextDouble());
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo() {
        this.tipo = "No Perecedero";
    }

    public Producto getDatosProducto() {
        return datosProducto;
    }

    public void setDatosProducto(Producto datosProducto) {
        this.datosProducto = datosProducto;
    }

    @Override
    public String toString() {
        return "NoPerecedero{" +
                "tipo='" + getTipo() + '\'' +
                ", datosProducto=" + getDatosProducto() +
                '}';
    }
}
