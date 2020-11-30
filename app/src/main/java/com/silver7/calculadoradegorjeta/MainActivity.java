package com.silver7.calculadoradegorjeta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private EditText campoNome;
    private TextInputEditText campoEmail;
    private TextView textoResultado;
    private CheckBox checkVerde, checkBranco, checkVermelho;
    private RadioButton sexoMasculino, sexoFeminino;
    private RadioGroup opcaoSexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome       = findViewById(R.id.editNome);
        campoEmail      = findViewById(R.id.editEmail);
        textoResultado  = findViewById(R.id.textResult);

        //checkBox
        checkVerde      = findViewById(R.id.checkVerde);
        checkBranco     = findViewById(R.id.checkBranco);
        checkVermelho   = findViewById(R.id.checkVermelho);

        //RadioButton
        sexoFeminino    = findViewById(R.id.radioButtonFeminino);
        sexoMasculino   = findViewById(R.id.radioButtonMasculino);
        opcaoSexo       = findViewById(R.id.RadioGroupSexo);

        radioButton();
    }


    public void radioButton (){

        opcaoSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.radioButtonMasculino){
                    textoResultado.setText("Sexo Maculino Selecionado");

                }else if (checkedId == R.id.radioButtonFeminino){
                    textoResultado.setText("Sexo Feminino Selecionado");
                }
            }
        });

        /*
        String texto ="";
        if (sexoFeminino.isChecked()) {
            texto = "Sexo Feminino Selecionado";

        }
        if (sexoMasculino.isChecked()){
            texto = "Sexo Masculino Selecionado";
        }
        textoResultado.setText(texto);

         */

    }



    public void enviar(View view){

        radioButton();
        //checkBox();

     /*
        String nome     = campoNome.getText().toString();
        String email    = campoEmail.getText().toString();

        textoResultado.setText("Seu nome é: "+nome+"\n Seu e-mail é:"+email);

      */

    }

    public void checkBox (){

        String texto = "";
        if (checkVerde.isChecked()){

            texto = "Verde Selecionado - ";

        }
        if (checkBranco.isChecked()){

            texto = texto + "Branco Selecionado - ";

        }
        if (checkVermelho.isChecked()){

            texto = texto + "Vermelho Selecionado - ";

        }

        textoResultado.setText(texto);
    }



    public void limpar (View view){

        campoNome.setText("");
        campoEmail.setText("");

    }
}
