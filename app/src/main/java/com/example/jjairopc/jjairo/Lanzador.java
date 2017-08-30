package com.example.jjairopc.jjairo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;


public class Lanzador extends AppCompatActivity {

    TextView recibenombre,recibeapellido,recibetelefono,recibedireccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lanzador);

        recibenombre = (TextView) findViewById( R.id.recibenombre );
        recibeapellido = (TextView) findViewById( R.id.recibeapellido );
        recibetelefono = (TextView) findViewById( R.id.recibetelefono );
        recibedireccion = (TextView) findViewById( R.id.recibedireccion );

        Intent intent=getIntent();
        Bundle extras =intent.getExtras();
        if (extras != null) {
            String dNombre=(String)extras.get("nombre");
            String dApellido= (String) extras.get("apellido");
            String dTelefono= (String) extras.get("telefono");
            String dDireccion= (String) extras.get("direccion");

            recibenombre.setText(dNombre);
            recibeapellido.setText(dApellido);
            recibetelefono.setText(dTelefono);
            recibedireccion.setText(dDireccion);
        }
    }
}