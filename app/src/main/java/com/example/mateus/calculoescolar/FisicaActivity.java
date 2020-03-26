package com.example.mateus.calculoescolar;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class FisicaActivity extends AppCompatActivity {

    EditText txtB1, txtB2, txtB3, txtB4, txtF1, txtF2, txtF3, txtF4;
    TextView txtSituacao,txtFaltas, txtMedia;
    Button btnCalcular, btnVoltar;
    float falta = 0;
    float bimestre;
    int totalBimestre = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fisica);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Calc Média");

        Locale.setDefault(Locale.US);

        final NotesFisica notes = new NotesFisica();




        txtB1 = (EditText) findViewById(R.id.txtB1);
        txtB2 = (EditText) findViewById(R.id.txtB2);
        txtB3 = (EditText) findViewById(R.id.txtB3);
        txtB4 = (EditText) findViewById(R.id.txtB4);
        txtF1 = (EditText) findViewById(R.id.txtF1);
        txtF2 = (EditText) findViewById(R.id.txtF2);
        txtF3 = (EditText) findViewById(R.id.txtF3);
        txtF4 = (EditText) findViewById(R.id.txtF4);
        txtSituacao = (TextView) findViewById(R.id.txtSituacao);
        txtFaltas = (TextView) findViewById(R.id.txtFaltas);
        txtMedia = (TextView) findViewById(R.id.txtMedia);
        btnCalcular = (Button) findViewById(R.id.btnCalcular);


        final SharedPreferences settings = getSharedPreferences("save", 0);
        notes.b1 = settings.getFloat("fisica1",0);
        notes.b2 = settings.getFloat("fisica2",0);
        notes.b3 = settings.getFloat("fisica3",0);
        notes.b4 = settings.getFloat("fisica4",0);
        notes.f1 = settings.getFloat("fisica5",0);
        notes.f2 = settings.getFloat("fisica6",0);
        notes.f3 = settings.getFloat("fisica7",0);
        notes.f4 = settings.getFloat("fisica8",0);
        falta = settings.getFloat("fisica9", 0) ;
        bimestre = settings.getFloat("fisica10", 0);




        if(notes.b1 > 0){
            txtB1.setText(String.format("%.1f", notes.b1));
        }else{
            txtB1.setText(String.format(""));
        }

        if(notes.b2 > 0){
            txtB2.setText(String.format("%.1f", notes.b2));
        }else{
            txtB2.setText(String.format(""));
        }

        if(notes.b3 > 0){
            txtB3.setText(String.format("%.1f", notes.b3));
        }else{
            txtB3.setText(String.format(""));
        }

        if(notes.b4 > 0){
            txtB4.setText(String.format("%.1f", notes.b4));
        }else{
            txtB4.setText(String.format(""));
        }

        if(notes.f1 > 0){
            txtF1.setText(String.format("%.0f", notes.f1));
        }else{
            txtF1.setText(String.format(""));
        }

        if(notes.f2 > 0){
            txtF2.setText(String.format("%.0f", notes.f2));
        }else{
            txtF2.setText(String.format(""));
        }

        if(notes.f3 > 0){
            txtF3.setText(String.format("%.0f", notes.f3));
        }else{
            txtF3.setText(String.format(""));
        }

        if(notes.f4 > 0){
            txtF4.setText(String.format("%.0f", notes.f4));
        }else{
            txtF4.setText(String.format(""));
        }

        if(falta > 0){
            txtFaltas.setText(String.format("Faltas: %.0f",falta));
        }else{
            txtFaltas.setText(String.format(""));
        }

        if(bimestre > 0){
            txtMedia.setText(String.format("Média: %.1f", bimestre));
        }else{
            txtMedia.setText(String.format(""));
        }


        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtMedia.setText("");
                txtSituacao.setText("");
                txtFaltas.setText("");

                // Leitura dos Campos da Nota


                if (txtB1.getText().toString().trim().equals("") & txtB2.getText().toString().trim().equals("") & txtB3.getText().toString().trim().equals("") & txtB4.getText().toString().trim().equals("") ){

                    txtSituacao.setText("Favor inserir a nota do 1º Bimestre!");
                    notes.b1 = 0;
                }else{
                    notes.b1 = Float.parseFloat(String.valueOf(txtB1.getText())) ;
                }

                if(txtB2.getText().toString().trim().equals("") & txtB3.getText().toString().trim().equals("") & txtB4.getText().toString().trim().equals("")){

                    txtSituacao.setText("Situação: Cursando");
                    notes.b2 = 0;
                }else{
                    notes.b2 = Float.parseFloat(String.valueOf(txtB2.getText()));
                }

                if(txtB3.getText().toString().trim().equals("") & txtB4.getText().toString().trim().equals("")){

                    txtSituacao.setText("Situação: Cursando");
                    notes.b3 = 0;
                }else{
                    notes.b3 = Float.parseFloat(String.valueOf(txtB3.getText()));
                }

                if(txtB4.getText().toString().trim().equals("")){
                    txtSituacao.setText("Situação: Cursando");
                    notes.b4 = 0;


                }else{
                    notes.b4 = Float.parseFloat(String.valueOf(txtB4.getText()));

                    txtMedia.setText(String.format("Média: %.1f", notes.addResultFinal()));

                    if (notes.addResultFinal() >= notes.media) {
                        txtSituacao.setText("Parabens vc foi aprovado!");

                    } else {
                        txtSituacao.setText("Vc foi reprovado!");
                    }
                }

                // Leitura dos campos de Falta

                if(txtF1.getText().toString().trim().equals("")){
                    txtFaltas.setText("");
                    notes.f1 = 0;

                }else{
                    notes.f1 = Float.parseFloat(String.valueOf(txtF1.getText()));
                }

                if(txtF2.getText().toString().trim().equals("")){
                    txtFaltas.setText("");
                    notes.f2 = 0;

                }else{
                    notes.f2 = Float.parseFloat(String.valueOf(txtF2.getText()));
                }

                if(txtF3.getText().toString().trim().equals("")){
                    txtFaltas.setText("");
                    notes.f3 = 0;

                }else{
                    notes.f3 = Float.parseFloat(String.valueOf(txtF3.getText()));
                }

                if(txtF4.getText().toString().trim().equals("")){
                    txtFaltas.setText("");
                    notes.f4 = 0;

                }else{
                    notes.f4 = Float.parseFloat(String.valueOf(txtF4.getText()));
                }

                falta = notes.f1 + notes.f2 + notes.f3 + notes.f4;

                txtFaltas.setText(String.format("Faltas: %.0f",falta));

                bimestre = (notes.b1 + notes.b2 + notes.b3 + notes.b4) / totalBimestre;





                SharedPreferences.Editor editor = settings.edit();
                editor.putFloat("fisica1", notes.b1);
                editor.putFloat("fisica2", notes.b2);
                editor.putFloat("fisica3", notes.b3);
                editor.putFloat("fisica4", notes.b4);
                editor.putFloat("fisica5", notes.f1);
                editor.putFloat("fisica6", notes.f2);
                editor.putFloat("fisica7", notes.f3);
                editor.putFloat("fisica8", notes.f4);
                editor.putFloat("fisica9",falta) ;
                editor.putFloat("fisica10", bimestre);
                editor.commit();

            }

        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                startActivity(new Intent(this, PrincipalActivity.class));

                break;
            default:break;
        }
        return true;
    }

    @Override
    public void onBackPressed(){
        startActivity(new Intent(this, PrincipalActivity.class));

        return;
    }
}
