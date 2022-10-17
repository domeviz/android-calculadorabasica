package com.example.sumarrestarmultiplicarodividir;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et_valor1, et_valor2;
    private TextView tv_resultado;
    private RadioButton rb_suma, rb_resta, rb_mult, rb_div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_valor1=(EditText) findViewById(R.id.txt_valor1);
        et_valor2=(EditText) findViewById(R.id.txt_valor2);
        tv_resultado=(TextView) findViewById(R.id.tv_resultado);
        rb_suma=(RadioButton) findViewById(R.id.rb_suma);
        rb_resta=(RadioButton) findViewById(R.id.rb_resta);
        rb_mult=(RadioButton) findViewById(R.id.rb_producto);
        rb_div=(RadioButton) findViewById(R.id.rb_division);

    }

    public void calcular(View view){
        String valor1_String=et_valor1.getText().toString();
        String valor2_String=et_valor2.getText().toString();

        int valor1=Integer.parseInt(valor1_String);
        int valor2=Integer.parseInt(valor2_String);

        if(rb_suma.isChecked()==true){
            int suma=valor1+valor2;
            String resultado=String.valueOf(suma);
            tv_resultado.setText(resultado);

        } else if(rb_resta.isChecked()==true){
            int resta=valor1-valor2;
            String resultado=String.valueOf(resta);
            tv_resultado.setText(resultado);

        } else if(rb_mult.isChecked()==true){
            int mult=valor1*valor2;
            String resultado=String.valueOf(mult);
            tv_resultado.setText(resultado);

        } else if(rb_div.isChecked()==true){
            if(valor2!=0){
                int div=valor1/valor2;
                String resultado = String.valueOf(div);
                tv_resultado.setText(resultado);
            } else {
                Toast.makeText(this, "No es posible dividir para 0", Toast.LENGTH_LONG).show();
            }
        }
    }
}