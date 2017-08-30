package com.example.jjairopc.jjairo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText nombre,apellido,direccion,telefono;
    private Button enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enviar =(Button)findViewById(R.id.enviar);
        nombre = (EditText) findViewById( R.id.nombre );
        apellido = (EditText) findViewById( R.id.apellido );
        direccion = (EditText) findViewById( R.id.direccion );
        telefono = (EditText) findViewById( R.id.telefono );

        enviar.setOnClickListener((View.OnClickListener) this);

    }

    @Override
    public void onClick(View v) {

        Intent explicit_intent;


        explicit_intent = new Intent(this,Lanzador.class);
        String auxEdiNombre=nombre.getText().toString();
        String auxEdiApellido=apellido.getText().toString();
        String auxEdiDireccion=direccion.getText().toString();
        String auxEdiTelefono=telefono.getText().toString();

        explicit_intent.putExtra("nombre",auxEdiNombre);
        explicit_intent.putExtra("apellido",auxEdiApellido);
        explicit_intent.putExtra("direccion",auxEdiDireccion);
        explicit_intent.putExtra("telefono",auxEdiTelefono);


        startActivity(explicit_intent);
    }
}
