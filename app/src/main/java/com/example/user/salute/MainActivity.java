package com.example.user.salute;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void saludar(View view){
    // obtenemos referencia al campo de texto
    EditText nombre = (EditText) this.findViewById(R.id.EditTextNombre);
    // obtenemos referencia al control que mostrara el nombre
    TextView saludo = (TextView) this.findViewById(R.id.textViewSaludo);
    // recuperamos el contenido del campo de texto y formamos el mensaje de saludo
    String texto = "Bienvenido Sr/a " + nombre.getText();
    // Volcamos el mensaje en el TextView
    saludo.setText(texto);
    }
}
