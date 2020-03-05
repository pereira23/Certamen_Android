package com.example.certamen_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView caja1, caja2,caja3, resultnumerico;
    Button suma, resta, limpiar, mult, div, par, primo, random;
    int entero1, entero2, rta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caja1 = findViewById(R.id.cajaRandom1);
        caja2 = findViewById(R.id.cajaRandom2);
        caja3 = findViewById(R.id.cajaOper);
        suma = findViewById(R.id.btnsuma);
        resta = findViewById(R.id.btnresta);
        limpiar = findViewById(R.id.btnlimpiar);
        mult = findViewById(R.id.btnmult);
        div = findViewById(R.id.btndiv);
        par = findViewById(R.id.btnpar);
        primo = findViewById(R.id.btnprimo);
        random = findViewById(R.id.btnrandom);
        resultnumerico= findViewById(R.id.resultnumerico);

        suma.setOnClickListener(this);
        resta.setOnClickListener(this);
        limpiar.setOnClickListener(this);
        mult.setOnClickListener(this);
        div.setOnClickListener(this);
        par.setOnClickListener(this);
        primo.setOnClickListener(this);
        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random r = new Random();
                entero1= r.nextInt(100);
                entero2= r.nextInt(100);

                String n1 = String.valueOf(entero1);
                String n2 = String.valueOf(entero2);

                caja1.setText(n1);
                caja2.setText(n2);
            }
        });


    }

    //@Override
    public void onClick(View view) {
      //  switch (){
        //    case R.id.btnsuma:
              //rta= entero1+entero2;
              //  break;
          //  case R.id.btnresta:
                //rta=entero1-entero2;
              //  break;
            //case R.id.btnmult:
                //rta=entero1*entero2;
                //break;
            //case R.id.btndiv:
              //  rta= entero1/entero2;
                //break;
        //}
       // resultnumerico.setText(""+rta);
    }

}
