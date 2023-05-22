
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TreeMap;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {

        TreeMap<String, ICalcular> inventario = new TreeMap<String, ICalcular>();

        Producto producto1 = new Producto("Guantes", 12.5, "G3487");
        Producto producto2 = new Producto("Botas", 40.25, "B9357");
        Producto producto3 = new Producto("Cinturón", 17, "C8334");
        Producto producto4 = new Producto("Pantalón", 22.45, "P0288");
        Producto producto5 = new Producto("Camisa", 2.5, "C3567");

        NoPerecedero noPerecedero1 = new NoPerecedero(new Producto("Exprimidor", 45.99, "E6478"));
        NoPerecedero noPerecedero2 = new NoPerecedero(new Producto("Freidora", 63.49, "F8113"));
        NoPerecedero noPerecedero3 = new NoPerecedero(new Producto("Lavadora", 155.99, "L6678"));
        NoPerecedero noPerecedero4 = new NoPerecedero(new Producto("Horno", 99.99, "H6878"));
        NoPerecedero noPerecedero5 = new NoPerecedero(new Producto("Microondas", 59.25, "M2467"));

        SimpleDateFormat patronFecha = new SimpleDateFormat("dd-MM-yyyy");
        Date caducidad1 = patronFecha.parse("04-08-2023");
        Date caducidad2 = patronFecha.parse("15-09-2023");
        Date caducidad3 = patronFecha.parse("22-07-2023");
        Date caducidad4 = patronFecha.parse("04-12-2023");
        Date caducidad5 = patronFecha.parse("20-05-2023");

        Perecedero perecedero1 = new Perecedero(caducidad1, new Producto("Leche", 0.89, "L5467"));
        Perecedero perecedero2 = new Perecedero(caducidad2, new Producto("Harina", 1.20, "H5897"));
        Perecedero perecedero3 = new Perecedero(caducidad3, new Producto("Yogur", 0.59, "Y5363"));
        Perecedero perecedero4 = new Perecedero(caducidad4, new Producto("Chocolate", 2.49, "C5456"));
        Perecedero perecedero5 = new Perecedero(caducidad5, new Producto("Anacardos", 12.89, "A5412"));

        inventario.put(perecedero1.getDatosProducto().getCodigo(), perecedero1);
        inventario.put(perecedero2.getDatosProducto().getCodigo(), perecedero2);
        inventario.put(perecedero3.getDatosProducto().getCodigo(), perecedero3);
        inventario.put(perecedero4.getDatosProducto().getCodigo(), perecedero4);
        inventario.put(perecedero5.getDatosProducto().getCodigo(), perecedero5);

        for(ICalcular datosArticulo : inventario.values()) {
                System.out.println("Articulo "+ datosArticulo+"\n");
            }

        }
    }



