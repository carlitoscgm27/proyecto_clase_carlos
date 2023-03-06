import modelos.*;

import java.time.LocalDate;

public class pruebaV1 {
    public static void main(String[] args) {

        Almacen a1 = new Almacen();
        a1.setIdentificador(152);
        a1.setNombre("Almacen1");
        a1.setCapacidad(400);

        System.out.println(a1);

        Producto p1 = new Producto();
        p1.setIdentificador(123);
        p1.setCodigo("234425");
        p1.setFechaCaducidad(LocalDate.of(2023,07,12));
        p1.setTipoProducto(TipoProducto.ALIMENTACION);
        p1.setAlmacen(a1);

        System.out.println(p1);

        Cliente c1 = new Cliente();
        c1.setIdentificador(234);
        c1.setDni("52357893Y");
        c1.setNombre("Jose");
        c1.setApellidos("Okocha");
        c1.setDireccion("Calle fiambre numero 23");
        c1.setTipoCliente(TipoCliente.PARTICULAR);

        System.out.println(c1);
    }

}
