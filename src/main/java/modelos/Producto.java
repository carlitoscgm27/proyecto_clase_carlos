package modelos;

import java.time.LocalDate;
import java.util.Objects;

public class Producto {

    private int identificador;
    private String codigo;
    private LocalDate fechaCaducidad;
    private Enum TipoProducto;
    private Almacen almacen;
    private Double precio;

    public Producto() {
    }

    public Producto(int identificador, String codigo, LocalDate fechaCaducidad, Enum tipoProducto, Almacen almacen, Double precio) {
        this.identificador = identificador;
        this.codigo = codigo;
        this.fechaCaducidad = fechaCaducidad;
        TipoProducto = tipoProducto;
        this.almacen = almacen;
        this.precio = precio;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public Enum getTipoProducto() {
        return TipoProducto;
    }

    public void setTipoProducto(Enum tipoProducto) {
        TipoProducto = tipoProducto;
    }

    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return identificador == producto.identificador && Objects.equals(codigo, producto.codigo) && Objects.equals(fechaCaducidad, producto.fechaCaducidad) && Objects.equals(TipoProducto, producto.TipoProducto) && Objects.equals(almacen, producto.almacen) && Objects.equals(precio, producto.precio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador, codigo, fechaCaducidad, TipoProducto, almacen, precio);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "identificador=" + identificador +
                ", codigo='" + codigo + '\'' +
                ", fechaCaducidad=" + fechaCaducidad +
                ", TipoProducto=" + TipoProducto +
                ", almacen=" + almacen +
                ", precio=" + precio +
                '}';
    }
}
