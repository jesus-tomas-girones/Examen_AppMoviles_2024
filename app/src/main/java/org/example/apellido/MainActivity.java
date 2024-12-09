package org.example.apellido;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

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
    }

    //Al pulsar sobre cualquiera de los 7 botones, su texto se añadirá a la derecha del botón “=”.
    public void onClick(View view) {
        Button botonPulsado = (Button) view;  //El botón que ha sido pulsado
        Button botonIgual = findViewById(R.id.button3); //El botón “=”
        botonIgual.setText(botonIgual.getText() + botonPulsado.getText().toString()); //Añadimos el texto del botón pulsado a la derecha del botón “=”
    }
}