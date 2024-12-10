package org.example.apellido;

//Apartado a)

import java.util.ArrayList;
import java.util.List;

public class Ventas {
    private String vendedor;
    private int productos;
    private double importe;

    public Ventas(String vendedor, int productos, double importe) {
        this.vendedor = vendedor;
        this.productos = productos;
        this.importe = importe;
    }

    public double precioMedio() {
        return importe / productos;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "vendedor='" + vendedor + '\'' +
                ", productos=" + productos +
                ", importe=" + importe +
                '}';
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public int getProductos() {
        return productos;
    }

    public void setProductos(int productos) {
        this.productos = productos;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    //Apartado b)
    public static List<Ventas> inicializa(List<String> vendedor, List<Integer> productos, List<Double> importe) {
        List<Ventas> ventas = new ArrayList<>();
        for (int i = 0; i < vendedor.size(); i++) {
            ventas.add(new Ventas(vendedor.get(i), productos.get(i), importe.get(i)));
        }
        return ventas;
    }

}


