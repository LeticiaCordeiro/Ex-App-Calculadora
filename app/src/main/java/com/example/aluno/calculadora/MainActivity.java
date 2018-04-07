package com.example.aluno.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText valor_1;
    EditText valor_2;
    Button mais;
    Button menos;
    Button mult;
    Button div;
    Button calcular;
    TextView resultadoFinal;
    String operacao;
    int val1;
    int val2;
    int res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor_1 = (EditText)findViewById(R.id.valor1);
        valor_2 = (EditText)findViewById(R.id.valor2);

        mais = (Button)findViewById(R.id.mais);
        menos = (Button)findViewById(R.id.menos);
        mult = (Button)findViewById(R.id.multi);
        div = (Button)findViewById(R.id.div);

        calcular = (Button)findViewById(R.id.botaoCalcula);
        resultadoFinal = (TextView)findViewById(R.id.resultadoFinal);

        mais.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                operacao = "mais";
            }
        });

        menos.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                operacao = "menos";
            }
        });

        mult.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                operacao = "mult";
            }
        });

        div.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                operacao = "div";
            }
        });

        calcular.setOnClickListener(new Button.OnClickListener(){

            public void onClick(View v){

                val1 = Integer.parseInt(valor_1.getText().toString());
                val2 = Integer.parseInt(valor_2.getText().toString());

                if(operacao.equals("mais")){
                    res =  (val1 + val2);
                    resultadoFinal.setText(String.valueOf(res));
                }
                else if(operacao.equals("menos")){
                    res =  (val1 - val2);
                    resultadoFinal.setText(String.valueOf(res));
                }
                else if(operacao.equals("mult")){
                    res =  (val1 * val2);
                    resultadoFinal.setText(String.valueOf(res));
                }
                else if(operacao.equals("div")){
                    res =  (val1 / val2);
                    resultadoFinal.setText(String.valueOf(res));
                }
                else {
                    resultadoFinal.setText("Algum erro ocorreu");
                }
            }
        });
    }
}
