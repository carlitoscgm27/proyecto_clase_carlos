package utilidades;

import modelos.Almacen;
import modelos.Producto;
import modelos.TipoProducto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UtilidadesProducto {
    public List<Producto>getPorTipo(List<Producto>productos, TipoProducto tipo){
        List<Producto> productosFinales = new ArrayList<>();
        for(Producto p : productos){
            if(p.getTipoProducto().equals(tipo)){
                productosFinales.add(p);
            }
        }
        return productosFinales;
    }

    public List<Producto> getPorTipoStream(List<Producto> productos, TipoProducto tipo){


        return productos
                .stream()
                .filter(p -> p.getTipoProducto().equals(tipo))
                .collect(Collectors.toList());
    }


    public List<Producto>getPorAlmacen(List<Producto>productos, Almacen almacen){
        List<Producto> productosFinales = new ArrayList<>();
        for(Producto p : productos){
            if(p.getTipoProducto().equals(almacen)){
                productosFinales.add(p);
            }
        }
        return productosFinales;
    }
    public List<Producto> getPorAlmacenStram(List<Producto> productos, Almacen almacen){
        return productos
                .stream()
                .filter(p -> p.getTipoProducto().equals(almacen))
                .collect(Collectors.toList());
    }
}
