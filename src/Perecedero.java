import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Perecedero implements ICalcular {

    private Date caducidad;
    private SimpleDateFormat patronFecha = new SimpleDateFormat("dd-MM-yyyy");
    //private int diasDescuento;
    private Producto datosProducto;
    private double precioTotal;
    private Scanner lecturaTeclado = new Scanner(System.in);
    private int cantidad;


    public Perecedero(Date caducidad, Producto datosProducto) {
        this.caducidad = caducidad;
        this.datosProducto = datosProducto;
    }

    public int calculaCaducidad(){
        Date fechaActual = new Date();
        return (int) caducidad.compareTo(fechaActual);

    }
    @Override
    public double calcular() {
        Date fechaActual = new Date();
        System.out.println("\nIntroduce la catidad de productos perecederos "+ getDatosProducto().getNombre() + ": ");
        this.cantidad =lecturaTeclado.nextInt();

        if (calculaCaducidad() <= 3) {
            switch (calculaCaducidad()) {
                case 1:
                    this.precioTotal=((this.datosProducto.getPrecio() * this.cantidad) / 4);
                case 2:
                    this.precioTotal=((this.datosProducto.getPrecio() * this.cantidad) / 3);
                case 3:
                    this.precioTotal=((this.datosProducto.getPrecio() * this.cantidad) / 2);

            }


        } else {
            this.precioTotal=(this.datosProducto.getPrecio() * this.cantidad);
        }
        return this.precioTotal;
    }

    public Date getCaducidad() {
        return this.caducidad;
    }

    public void setCaducidad(Date caducidad) {
        this.caducidad = caducidad;
    }

    public Producto getDatosProducto() {
        return this.datosProducto;
    }

    public void setDatosProducto(Producto datosProducto) {
        this.datosProducto = datosProducto;
    }

    @Override
    public String toString() {
        return String.format("Perecedero{" +
                "caducidad=" + patronFecha.format(caducidad) +
                ", datosProducto=" + this.datosProducto +
                "\nCoste Total de " + this.cantidad +
                " unidades: "+ this.calcular() +
                '}');
    }
}
