package com.example.ejercicio_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
import java.lang.String;

public class MainActivity extends AppCompatActivity {

    Button btnpiedra, btnpapel, btntijera;
    TextView txtMarcador, txtJugador, txtCPU;
    ImageView jugador, cpu;
    int JugadorPuntaje = 0;
    int CPUPuntaje = 0;
    String elejido;
    String dispositivo_selecciono = " ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnpiedra = (Button) findViewById(R.id.btnPiedra);
        btnpapel = (Button) findViewById(R.id.btnPapel);
        btntijera = (Button) findViewById(R.id.btnTijera);

        txtMarcador = (TextView) findViewById(R.id.txtMarcador);
        txtJugador = (TextView) findViewById(R.id.txtJugador);
        txtCPU = (TextView) findViewById(R.id.txtCPU);

        jugador = (ImageView) findViewById(R.id.imgJugador);
        cpu = (ImageView) findViewById(R.id.imgCPU);

        btnpiedra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jugador.setImageResource(R.drawable.piedra);
                String turno = ("piedra");
                Toast.makeText(MainActivity.this, turno, Toast.LENGTH_SHORT).show();
                txtMarcador.setText("jugador: " + Integer.toString(JugadorPuntaje) + " cpu: " + Integer.toString(CPUPuntaje));
            }
        });

        btnpapel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jugador.setImageResource(R.drawable.papel);
                String turno = ("papel");
                Toast.makeText(MainActivity.this, turno, Toast.LENGTH_SHORT).show();
                txtMarcador.setText("jugador: " + Integer.toString(JugadorPuntaje) + "cpu: " + Integer.toString(CPUPuntaje));
            }
        });

        btntijera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jugador.setImageResource(R.drawable.tijera);
                String turno = ("tijera");
                Toast.makeText(MainActivity.this, turno, Toast.LENGTH_SHORT).show();
                txtMarcador.setText("jugador: " + Integer.toString(JugadorPuntaje) + "cpu: " + Integer.toString(CPUPuntaje));
            }
        });




            Random random = new Random();

            int dispos_selecciono_numero = random.nextInt(3) + 1;

            if (dispos_selecciono_numero == 1) {
                dispositivo_selecciono = "piedra";
            } else if (dispos_selecciono_numero == 2) {
                dispositivo_selecciono = "papel";
            } else if (dispos_selecciono_numero == 3) {
                dispositivo_selecciono = "tijera";
            }


            if (dispositivo_selecciono == "piedra") {
                cpu.setImageResource(R.drawable.piedra);

            } else if (dispositivo_selecciono == "papel") {
                cpu.setImageResource(R.drawable.papel);

            } else if (dispositivo_selecciono == "tijera") {
                cpu.setImageResource(R.drawable.tijera);
            }




            if (dispositivo_selecciono == elejido) {
                return;

            } else if (elejido == "piedra" && dispositivo_selecciono == "tijera") {
                JugadorPuntaje++;
                return;

            } else if (elejido == "piedra" && dispositivo_selecciono == "papel") {
                CPUPuntaje++;
                return;

            } else if (elejido == "tijera" && dispositivo_selecciono == "piedra") {
                CPUPuntaje++;
                return;

            } else if (elejido == "tijera" && dispositivo_selecciono == "papel") {
                JugadorPuntaje++;
                return;

            } else if (elejido == "papel" && dispositivo_selecciono == "piedra") {
                JugadorPuntaje++;
                return;

            } else if (elejido == "papel" && dispositivo_selecciono == "tijera") {
                CPUPuntaje++;
                return;

            } else return;

        }
    }









