package utilities;

import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import models.Producto;
import models.Usuario;
import models.Venta;

public class TicketDeVenta {

    public static void ticket(ArrayList<Venta> ventas, Usuario u, float dineroRecibido, float cambio) {
        // Obtener la fecha actual
        for (Venta venta : ventas) {
            Producto productoInVenta = new dao.DAO_Producto().readProducto(venta.getId_producto());
            venta.setNombreProducto(productoInVenta.getNombre());
            venta.setPrecioProducto(productoInVenta.getPrecio());
        }

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        String fecha = dateFormat.format(date);

        // Crear el contenido del ticket
        StringBuilder ticketContent = new StringBuilder();
        ticketContent.append("=== Ticket de Venta ===\n");
        ticketContent.append("Fecha: ").append(fecha).append("\n");
        ticketContent.append("Lo atendio: ").append(u.getNombre()).append("\n");
        ticketContent.append("------------------------------------------------------\n");
        ticketContent.append(String.format("%-25s %-10s %-10s %-10s\n", "Producto", "Precio", "Cantidad", "Total"));
        ticketContent.append("------------------------------------------------------\n");

        // Iterar sobre las ventas y agregarlas al ticket
        double totalVenta = 0;
        for (Venta venta : ventas) {
            double totalProducto = venta.getTotal();
            totalVenta += totalProducto;

            // Asegurar que el nombre del producto tenga la longitud adecuada
            String nombreProductoFormateado = llenarConEspacios(venta.getNombreProducto(), 25);

            // Agregar información de la venta al ticket
            ticketContent.append(String.format("%s $%-9.2f %-10d $%-9.2f\n",
                    nombreProductoFormateado, venta.getPrecioProducto(),
                    venta.getCantidad(), totalProducto));
        }

        ticketContent.append("------------------------------------------------------\n");
        ticketContent.append(String.format("%-40s $%-9.2f\n", "Total Venta:", totalVenta));
        ticketContent.append(String.format("%-40s $%-9.2f\n", "Dinero Recibido:", dineroRecibido));
        ticketContent.append(String.format("%-40s $%-9.2f\n", "Cambio:", cambio));
        ticketContent.append("------------------------------------------------------\n");
        ticketContent.append("Gracias por su compra.\n");

        // Imprimir el ticket
        System.out.println(ticketContent.toString());
        //imprimirTicket(ticketContent.toString());
    }

    private static void imprimirTicket(String contenido) {
        // Utilizar la API de impresión de Java
        PrinterJob printerJob = PrinterJob.getPrinterJob();

        // Puedes seleccionar la impresora predeterminada o permitir que el usuario elija
        // printerJob.printDialog();
        printerJob.setPrintable(new Printable() {
            @Override
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
                if (pageIndex > 0) {
                    return Printable.NO_SUCH_PAGE;
                }

                // Definir la fuente y el tamaño
                Font font = new Font("Arial", Font.PLAIN, 12);
                graphics.setFont(font);

                // Configurar el área de impresión
                int x = (int) pageFormat.getImageableX() + 50;
                int y = (int) pageFormat.getImageableY() + 50;

                // Imprimir el contenido en la página
                String[] lines = contenido.split("\n");
                for (String line : lines) {
                    graphics.drawString(line, x, y);
                    y += 15; // Ajusta el espaciado entre líneas
                }

                return Printable.PAGE_EXISTS;
            }
        });

        try {
            printerJob.print();
        } catch (PrinterException e) {
            e.printStackTrace();
        }
    }

    private static String llenarConEspacios(String texto, int longitud) {
        StringBuilder resultado = new StringBuilder(texto);
        while (resultado.length() < longitud) {
            resultado.append(" ");
        }
        return resultado.toString();
    }
}
