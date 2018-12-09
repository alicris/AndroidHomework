package com.example.jezrelll.test;

import android.service.autofill.TextValueSanitizer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class bienvenida extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida);
        Bundle bundle = getIntent().getExtras();
        TextView ecnombre = (TextView) findViewById(R.id.txt2Name);
        EditText eclase = (EditText) findViewById(R.id.edClase);
        EditText eclibro = (EditText) findViewById(R.id.edLibro);


        ecnombre.setText(bundle.getString("wlcName"));
        eclase.setText(bundle.getString("Clase"));
        eclibro.setText(bundle.getString("Libro"));

        final Button button = (Button) findViewById(R.id.btnSalir);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });
    }

}

