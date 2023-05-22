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
        setCaducidad(caducidad);
        setDatosProducto(datosProducto);
    }

    public int calculaCaducidad(){
        Date fechaActual = new Date();
        return (int)((getCaducidad().getTime()-fechaActual.getTime())/86400000)+1;
    }

    public void introducirCantidad () {
        System.out.println("Introduce la catidad de productos perecederos " + getDatosProducto().getNombre() + ": ");
        this.cantidad = lecturaTeclado.nextInt();
    }
    public int getCantidad() {
        return this.cantidad;
    }


    @Override
    public double calcular() {
        introducirCantidad();
        System.out.println("Días para caducar: "+calculaCaducidad());
        if (calculaCaducidad() <= 3) {
            switch (calculaCaducidad()) {
                case 1:
                    this.precioTotal=((this.datosProducto.getPrecio() * this.cantidad) / 4);
                    break;
                case 2:
                    this.precioTotal=((this.datosProducto.getPrecio() * this.cantidad) / 3);
                    break;
                case 3:
                    this.precioTotal=((this.datosProducto.getPrecio() * this.cantidad) / 2);
                    break;
                default:break;
            }
        }
        else {
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
        return "Perecedero{" +
                "caducidad=" + patronFecha.format(caducidad) +
                ", datosProducto=" + getDatosProducto() +
                "\n"+this.calcular()+" es el Coste Total de " + getCantidad()+
                " unidades."+
                '}';
    }

}
