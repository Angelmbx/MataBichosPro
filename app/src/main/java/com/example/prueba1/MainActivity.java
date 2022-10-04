package com.example.prueba1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = findViewById(R.id.button);
        TextView txt = findViewById(R.id.textView);
        txt.setText("¡Mátalo!");
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setVisibility(View.INVISIBLE);


        b1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {


                contador++;

                txt.setText("Has matado "+ contador + " bichos.");

                if (contador>14){
                    b1.setVisibility(View.INVISIBLE);

                    txt.setText("Los has matado a todos D:");


                    imageView.setVisibility(View.VISIBLE);

                }




            }
        });


    }
}