package utilidades;

import modelos.Factura;
import modelos.LineaFactura;
import modelos.Producto;

import java.time.LocalDate;

public class UtilidadesFactura {

    public boolean esFacturaVencida(Factura factura) {

        boolean vencimiento = false;
        if (factura.getFechaVencimiento().isAfter(LocalDate.now()) || factura.getFechaVencimiento().equals(LocalDate.now())) {
            vencimiento = true;
            System.out.println("Está vencida");
        } else {
            vencimiento = false;
            System.out.println("No está vencida");
        }
        return vencimiento;
    }

    public double calcularBaseFactura(Factura factura) {
        Double total = 0.0;
        for (LineaFactura lF : factura.getLineaFactura()) {
            Producto p = lF.getProducto();
            Double precio = p.getPrecio();
            total = precio * lF.getCantidad();
        }
        return total;
    }

    public double calcularTotalAPagar(Factura factura){
        Double total = (factura.getImporteBase()-factura.getDescuento())* factura.getIva();
        return  total;
    }


}