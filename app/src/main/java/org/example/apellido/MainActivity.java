package org.example.apellido;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.List;

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
    }

    //Al pulsar sobre cualquiera de los 7 botones, su texto se añadirá a la derecha del botón “=”.
    public void onClick(View view) {
        Button botonPulsado = (Button) view;  //El botón que ha sido pulsado
        Button botonIgual = findViewById(R.id.button3); //El botón “=”
        botonIgual.setText(botonIgual.getText() + botonPulsado.getText().toString()); //Añadimos el texto del botón pulsado a la derecha del botón “=”
    }
}