package com.example.mateus.calculoescolar;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.ShareActionProvider;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.Button;
import android.widget.TextView;

public class PrincipalActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    Button btnPortugues,btnMatematica,btnFisica,btnQuimica,btnGeografia,btnHistoria;

    Button btnFilosofia,btnSociologia,btnIngles,btnBiologia,btnArtes,btnEducacaoFisica;

    TextView txtPortuguesN, txtPortuguesF;

    TextView txtMatematicaN, txtMatematicaF;

    TextView txtFisicaN, txtFisicaF;

    TextView txtQuimicaN, txtQuimicaF;

    TextView txtGeografiaN, txtGeografiaF;

    TextView txtHistoriaN, txtHistoriaF;

    TextView txtFilosofiaN, txtFilosofiaF;

    TextView txtSociologiaN, txtSociologiaF;

    TextView txtInglesN, txtInglesF;

    TextView txtBiologiaN, txtBiologiaF;

    TextView txtArtesN, txtArtesF;

    TextView txtEducacaoFisicaN, txtEducacaoFisicaF;

    private ShareActionProvider mShareActionProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /////////////////////////////////////////////////////////////////////////

        final PortuguesActivity portuguesActivity = new PortuguesActivity();

        final MatematicaActivity matematicaActivity = new MatematicaActivity();

        final FisicaActivity fisicaActivity = new FisicaActivity();

        final QuimicaActivity quimicaActivity = new QuimicaActivity();

        final GeografiaActivity geografiaActivity = new GeografiaActivity();

        final HistoriaActivity historiaActivity = new HistoriaActivity();

        final FilosofiaActivity filosofiaActivity = new FilosofiaActivity();

        final SociologiaActivity sociologiaActivity = new SociologiaActivity();

        final InglesActivity inglesActivity = new InglesActivity();

        final BiologiaActivity biologiaActivity = new BiologiaActivity();

        final ArtesActivity artesActivity = new ArtesActivity();

        final EducacaoFisicaActivity educacaoFisicaActivity = new EducacaoFisicaActivity();



        btnPortugues = (Button)findViewById(R.id.btnPortugues);

        btnMatematica = (Button)findViewById(R.id.btnMatematica);

        btnFisica = (Button)findViewById(R.id.btnFisica);

        btnQuimica = (Button)findViewById(R.id.btnQuimica);

        btnGeografia = (Button)findViewById(R.id.btnGeografia);

        btnHistoria = (Button)findViewById(R.id.btnHistoria);

        btnFilosofia = (Button)findViewById(R.id.btnFilosofia);

        btnSociologia = (Button)findViewById(R.id.btnSociologia);

        btnIngles = (Button)findViewById(R.id.btnIngles);

        btnBiologia = (Button)findViewById(R.id.btnBiologia);

        btnArtes = (Button)findViewById(R.id.btnArtes);

        btnEducacaoFisica = (Button)findViewById(R.id.btnEducacaoFisica);

        txtPortuguesF = (TextView)findViewById(R.id.txtPortuguesF);
        txtPortuguesN = (TextView)findViewById(R.id.txtPortuguesN);

        txtMatematicaF  = (TextView)findViewById(R.id.txtMatematicaF);
        txtMatematicaN = (TextView)findViewById(R.id.txtMatematicaN);

        txtFisicaF = (TextView)findViewById(R.id.txtFisicaF);
        txtFisicaN = (TextView)findViewById(R.id.txtFisicaN);

        txtQuimicaF = (TextView)findViewById(R.id.txtQuimicaF);
        txtQuimicaN = (TextView)findViewById(R.id.txtQuimicaN);

        txtGeografiaF = (TextView)findViewById(R.id.txtGeografiaF);
        txtGeografiaN = (TextView)findViewById(R.id.txtGeografiaN);

        txtHistoriaF = (TextView)findViewById(R.id.txtHistoriaF);
        txtHistoriaN = (TextView)findViewById(R.id.txtHistoriaN);

        txtFilosofiaF = (TextView)findViewById(R.id.txtFilosofiaF);
        txtFilosofiaN = (TextView)findViewById(R.id.txtFilosofiaN);

        txtSociologiaF = (TextView)findViewById(R.id.txtSociologiaF);
        txtSociologiaN = (TextView)findViewById(R.id.txtSociologiaN);

        txtInglesF = (TextView)findViewById(R.id.txtInglesF);
        txtInglesN = (TextView)findViewById(R.id.txtInglesN);

        txtBiologiaF = (TextView)findViewById(R.id.txtBiologiaF);
        txtBiologiaN = (TextView)findViewById(R.id.txtBiologiaN);

        txtArtesF = (TextView)findViewById(R.id.txtArtesF);
        txtArtesN = (TextView)findViewById(R.id.txtArtesN);

        txtEducacaoFisicaF = (TextView)findViewById(R.id.txtEducacaoFisicaF);
        txtEducacaoFisicaN = (TextView)findViewById(R.id.txtEducacaoFisicaN);





        btnPortugues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent portugues = new Intent(PrincipalActivity.this, PortuguesActivity.class);
                startActivity(portugues);

            }
        });

        btnMatematica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent matematica = new Intent(PrincipalActivity.this, MatematicaActivity.class);
                startActivity(matematica);

            }
        });

        btnFisica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent fisica = new Intent(PrincipalActivity.this, FisicaActivity.class);
                startActivity(fisica);

            }
        });

        btnQuimica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent quimica = new Intent(PrincipalActivity.this, QuimicaActivity.class);
                startActivity(quimica);

            }
        });

        btnGeografia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent geografia = new Intent(PrincipalActivity.this , GeografiaActivity.class);
                startActivity(geografia);

            }
        });

        btnHistoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent historia = new Intent(PrincipalActivity.this , HistoriaActivity.class);
                startActivity(historia);
            }
        });

        btnFilosofia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent filosofia = new Intent(PrincipalActivity.this, FilosofiaActivity.class);
                startActivity(filosofia);

            }
        });

        btnSociologia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent sociologia = new Intent(PrincipalActivity.this, SociologiaActivity.class);
                startActivity(sociologia);

            }
        });

        btnIngles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ingles = new Intent(PrincipalActivity.this, InglesActivity.class);
                startActivity(ingles);

            }
        });

        btnBiologia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent biologia = new Intent(PrincipalActivity.this, BiologiaActivity.class);
                startActivity(biologia);

            }
        });

        btnArtes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent artes = new Intent(PrincipalActivity.this, ArtesActivity.class);
                startActivity(artes);
            }
        });

        btnEducacaoFisica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent edFisica= new Intent(PrincipalActivity.this, EducacaoFisicaActivity.class);
                startActivity(edFisica);

            }
        });





        final SharedPreferences settings = getSharedPreferences("save", 0);

        portuguesActivity.falta = settings.getFloat("valor9", 0) ;
        portuguesActivity.bimestre = settings.getFloat("valor10", 0);

        if(portuguesActivity.falta > 0){
            txtPortuguesF.setText(String.format("Faltas : %.0f",portuguesActivity.falta));
        }

        if(portuguesActivity.bimestre > 0){
            txtPortuguesN.setText(String.format("Média : %.1f",portuguesActivity.bimestre));
        }

        matematicaActivity.falta = settings.getFloat("matematica9", 0) ;
        matematicaActivity.bimestre = settings.getFloat("matematica10", 0);

        if(matematicaActivity.falta > 0){
            txtMatematicaF.setText(String.format("Faltas : %.0f",matematicaActivity.falta));
        }

        if(matematicaActivity.bimestre > 0){
            txtMatematicaN.setText(String.format("Média : %.1f",matematicaActivity.bimestre));
        }

        fisicaActivity.falta = settings.getFloat("fisica9",0);
        fisicaActivity.bimestre = settings.getFloat("fisica10",0);

        if(fisicaActivity.falta > 0){
            txtFisicaF.setText(String.format("Faltas : %.0f",fisicaActivity.falta));
        }

        if(fisicaActivity.bimestre > 0){
            txtFisicaN.setText(String.format("Média : %.1f",fisicaActivity.bimestre));
        }

        quimicaActivity.falta = settings.getFloat("quimica9",0);
        quimicaActivity.bimestre = settings.getFloat("quimica10",0);

        if(quimicaActivity.falta > 0){
            txtQuimicaF.setText(String.format("Faltas : %.0f",quimicaActivity.falta));
        }

        if(quimicaActivity.bimestre > 0){
            txtQuimicaN.setText(String.format("Média : %.1f",quimicaActivity.bimestre));
        }

        geografiaActivity.falta = settings.getFloat("geografia9", 0) ;
        geografiaActivity.bimestre = settings.getFloat("geografia10", 0);

        if(geografiaActivity.falta > 0){
            txtGeografiaF.setText(String.format("Faltas : %.0f",geografiaActivity.falta));
        }

        if(geografiaActivity.bimestre > 0){
            txtGeografiaN.setText(String.format("Média : %.1f",geografiaActivity.bimestre));
        }

        historiaActivity.falta = settings.getFloat("historia9", 0) ;
        historiaActivity.bimestre = settings.getFloat("historia10", 0);

        if(historiaActivity.falta > 0){
            txtHistoriaF.setText(String.format("Faltas : %.0f",historiaActivity.falta));
        }

        if(historiaActivity.bimestre > 0){
            txtHistoriaN.setText(String.format("Média : %.1f",historiaActivity.bimestre));
        }

        filosofiaActivity.falta = settings.getFloat("filosofia9", 0) ;
        filosofiaActivity.bimestre = settings.getFloat("filosofia10", 0);

        if(filosofiaActivity.falta > 0){
            txtFilosofiaF.setText(String.format("Faltas : %.0f",filosofiaActivity.falta));
        }

        if(filosofiaActivity.bimestre > 0){
            txtFilosofiaN.setText(String.format("Média : %.1f",filosofiaActivity.bimestre));
        }

        sociologiaActivity.falta = settings.getFloat("sociologia9", 0) ;
        sociologiaActivity.bimestre = settings.getFloat("sociologia10", 0);

        if(sociologiaActivity.falta > 0){
            txtSociologiaF.setText(String.format("Faltas : %.0f",sociologiaActivity.falta));
        }

        if(sociologiaActivity.bimestre > 0){
            txtSociologiaN.setText(String.format("Média : %.1f",sociologiaActivity.bimestre));
        }

        inglesActivity.falta = settings.getFloat("ingles9", 0) ;
        inglesActivity.bimestre = settings.getFloat("ingles10", 0);

        if(inglesActivity.falta > 0){
            txtInglesF.setText(String.format("Faltas : %.0f",inglesActivity.falta));
        }

        if(inglesActivity.bimestre > 0){
            txtInglesN.setText(String.format("Média : %.1f",inglesActivity.bimestre));
        }

        biologiaActivity.falta = settings.getFloat("biologia9", 0) ;
        biologiaActivity.bimestre = settings.getFloat("biologia10", 0);

        if(biologiaActivity.falta > 0){
            txtBiologiaF.setText(String.format("Faltas : %.0f",biologiaActivity.falta));
        }

        if(biologiaActivity.bimestre > 0){
            txtBiologiaN.setText(String.format("Média : %.1f",biologiaActivity.bimestre));
        }

        artesActivity.falta = settings.getFloat("artes9", 0) ;
        artesActivity.bimestre = settings.getFloat("artes10", 0);

        if(artesActivity.falta > 0){
            txtArtesF.setText(String.format("Faltas : %.0f",artesActivity.falta));
        }

        if(artesActivity.bimestre > 0){
            txtArtesN.setText(String.format("Média : %.1f",artesActivity.bimestre));
        }

        educacaoFisicaActivity.falta = settings.getFloat("edFisica9", 0) ;
        educacaoFisicaActivity.bimestre = settings.getFloat("edFisica10", 0);

        if(educacaoFisicaActivity.falta > 0){
            txtEducacaoFisicaF.setText(String.format("Faltas : %.0f",educacaoFisicaActivity.falta));
        }

        if(educacaoFisicaActivity.bimestre > 0){
            txtEducacaoFisicaN.setText(String.format("Média : %.1f",educacaoFisicaActivity.bimestre));
        }





        SharedPreferences.Editor editor = settings.edit();

        editor.putFloat("valor9",portuguesActivity.falta) ;
        editor.putFloat("valor10",portuguesActivity.bimestre);

        editor.putFloat("matematica9",matematicaActivity.falta) ;
        editor.putFloat("matematica10",matematicaActivity.bimestre);

        editor.putFloat("fisica9",fisicaActivity.falta);
        editor.putFloat("fisica10",fisicaActivity.bimestre);

        editor.putFloat("quimica9",quimicaActivity.falta);
        editor.putFloat("quimica10",quimicaActivity.bimestre);

        editor.putFloat("geografia9",geografiaActivity.falta);
        editor.putFloat("geografia10",geografiaActivity.bimestre);

        editor.putFloat("historia9",historiaActivity.falta);
        editor.putFloat("historia10",historiaActivity.bimestre);

        editor.putFloat("filosofia9",filosofiaActivity.falta);
        editor.putFloat("filosofia10",filosofiaActivity.bimestre);

        editor.putFloat("sociologia9",sociologiaActivity.falta);
        editor.putFloat("sociologia10",sociologiaActivity.bimestre);

        editor.putFloat("ingles9",inglesActivity.falta);
        editor.putFloat("ingles10",inglesActivity.bimestre);

        editor.putFloat("biologia9",biologiaActivity.falta);
        editor.putFloat("biologia10",biologiaActivity.bimestre);

        editor.putFloat("artes9",artesActivity.falta);
        editor.putFloat("artes10",artesActivity.bimestre);

        editor.putFloat("edFisica",educacaoFisicaActivity.falta);
        editor.putFloat("edFisica10",educacaoFisicaActivity.bimestre);

        editor.commit();

        /////////////////////////////////////////////////////////////////////////////



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }



    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.principal, menu);
        return true;
    }


    /*@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {


            //return true;
        }

        return super.onOptionsItemSelected(item);
    }*/



    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_sobre) {

            Intent sobre = new Intent(PrincipalActivity.this, Sobre_AppActivity.class);
            startActivity(sobre);

        } else if (id == R.id.nav_config) {

            Intent configuracao = new Intent(PrincipalActivity.this, ConfiguracaoActivity.class);
            startActivity(configuracao);

        } else if (id == R.id.nav_comousar) {

            Intent comousar = new Intent(PrincipalActivity.this, Como_UsarActivity.class);
            startActivity(comousar);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
