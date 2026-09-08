package pe.edu.upeu.sysventas.enums;

import lombok.Getter;

@Getter

public enum TipoProducto {

    PREPARADO("Producto"),
    PRODUCTO("Preparado"),
    SERVICIO("Servicio");

    String descripcion;
    TipoProducto(String descripcion){
        this.descripcion=descripcion;
    }
}
