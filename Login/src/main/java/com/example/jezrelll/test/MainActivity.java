package com.example.jezrelll.test;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void next(View bottom) {
        EditText nomUser = (EditText) findViewById(R.id.edUsername);
        EditText password = (EditText) findViewById(R.id.edPassword);

        String[][] lasPersonas = new String[4][5];
        lasPersonas[0][0] = "aacevedo";
        lasPersonas[0][1] = "1234";
        lasPersonas[0][2] = "Alicia Acevedo";
        lasPersonas[0][3] = "Damas Solteras";
        lasPersonas[0][4] = "Mas alla de las estrellas";
//----
        lasPersonas[1][0] = "sguzman";
        lasPersonas[1][1] = "abcd";
        lasPersonas[1][2] = "Santa Guzman";
        lasPersonas[1][3] = "Damas Mayores";
        lasPersonas[1][4] = "Biblia";

        lasPersonas[2][0] = "nacevedo";
        lasPersonas[2][1] = "12ab";
        lasPersonas[2][2] = "Nicolas Acevedo";
        lasPersonas[2][3] = "Caballeros";
        lasPersonas[2][4] = "Biblia";
//---
        lasPersonas[3][0] = "kvencen";
        lasPersonas[3][1] = "aaaa";
        lasPersonas[3][2] = "Kevin Vencen";
        lasPersonas[3][3] = "Niños de Cuna";
        lasPersonas[3][4] = "Pocoyo Book";
        int count = 0;


        String username = nomUser.getText().toString();
        String pass = password.getText().toString();

        if (username.isEmpty() || pass.isEmpty())
            Toast.makeText(this, "Debe colocar el usuario y la clave", Toast.LENGTH_SHORT).show();

        for (int x = 0; x < lasPersonas.length; x++) {

            if ((!lasPersonas[x][0].isEmpty() && lasPersonas[x][0].equals(username)) &&
                    (!lasPersonas[x][0].isEmpty() && lasPersonas[x][1].equals(pass))) {

                Intent intent = new Intent();
                count = 1;
                for (int y = 0; y < lasPersonas[x].length; y++) {

                    //Toast.makeText(this, "Ingreso Exitoso", Toast.LENGTH_SHORT).show();


                    if (y == 2)
                        intent.putExtra("wlcName", lasPersonas[x][y]);

                    if (y == 3)
                        intent.putExtra("Clase", lasPersonas[x][y]);

                    if (y == 4)
                        intent.putExtra("Libro", lasPersonas[x][y]);

                    System.out.println("2" + lasPersonas[x][y]);

                }

                intent.setClass(this, bienvenida.class);
                startActivity(intent);

            }

        }
        if (count == 0 )
            Toast.makeText(this, "Usuario o clave incorrecto", Toast.LENGTH_SHORT).show();

    }


    public void startActivity(Intent intent) {
        this.startActivity(intent, null);
    }
}
