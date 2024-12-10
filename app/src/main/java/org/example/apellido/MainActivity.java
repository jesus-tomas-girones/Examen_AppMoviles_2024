package org.example.apellido;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    //Ejercicio 4: JAVA
    static List<String>  VENDEDOR =Arrays.asList("Pepe", "Ana", "Ana","Pepe","Ana");
    static List<Integer> PRODUCTOS=Arrays.asList(     6,     9,    10,     5,    3);
    static List<Double> IMPORTE  = Arrays.asList(  60.0,  45.0,  60.6,  55.0, 30.0);

    public static List<Ventas> listaVentas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
/*        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });*/

        //Ejercicio 4: JAVA
        listaVentas = Ventas.inicializa(VENDEDOR, PRODUCTOS, IMPORTE);
        Log.d("EXAMEN",  listaVentas.toString());

        //Ejercicio 5: ALGORITMO 1
        Set<String> vendedores = new HashSet<>();
        for (Ventas venta : listaVentas) {
            vendedores.add(venta.getVendedor());
        }
        Map<String,Integer> totalProductos = new HashMap<>();
        for (String vendedor : vendedores) {
            int total = 0;
            for (Ventas venta : listaVentas) {
                if (venta.getVendedor().equals(vendedor)) {
                    total += venta.getProductos();
                }
            }
            totalProductos.put(vendedor, total);
        }
        Log.d("EXAMEN",  "Ejercicio 5: " + totalProductos);

        //Ejercicio 6: ALGORITMO 2
        ejercicio6(listaVentas);
    }

    /*Crea un método que tenga como parámetro la lista obtenida en el ejercicio anterior y nos devuelva el nombre del trabajador que consiguió vender en una jornada los productos con mayor valor medio. Muestra las soluciones en el LogCat usando el tag EXAMEN.*/
    public void ejercicio6(List<Ventas> listaVentas) {
        String vendedor = "";
        double precioMedio = 0;
        for (Ventas venta : listaVentas) {
            if (venta.precioMedio() > precioMedio) {
                precioMedio = venta.precioMedio();
                vendedor = venta.getVendedor();
            }
        }
        Log.d("EXAMEN", "Ejercicio 6: " + vendedor);
    }


    //Ejercicio 3: BOTONES
    public void onClick(View view) {
        Button botonPulsado = (Button) view;  //El botón que ha sido pulsado
        Button botonIgual = findViewById(R.id.button3); //El botón “=”
        botonIgual.setText(botonIgual.getText() + botonPulsado.getText().toString()); //Añadimos el texto del botón pulsado a la derecha del botón “=”
    }
}