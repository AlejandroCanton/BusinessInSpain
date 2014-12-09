package aar.businessinspain;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;


public class Details extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent intent = getIntent();
        int mes = intent.getIntExtra("Data", MenuProtocolo.mes);

        System.out.println("Llego   " + mes);


        int rec = (R.id.imageViewModelo);


        System.out.println("Comparar con   " + rec);


        if ( mes == (R.id.imageViewModelo) )
        {
            ((TextView)findViewById(R.id.textViewTitle)).setText("Modelo de Comunicación");
            ((ImageView) findViewById(R.id.imageViewIcon)).setImageResource(R.drawable.modelo);
            ((TextView)findViewById(R.id.textViewDescripcion)).setText(getText(R.string.modelo_comunicacion_info)) ;
        }
        else if ( mes == (R.id.imageViewVestimenta) )
        {
            ((TextView)findViewById(R.id.textViewTitle)).setText("Código de Vestimenta");
            ((ImageView) findViewById(R.id.imageViewIcon)).setImageResource(R.drawable.vestimenta);
            ((TextView)findViewById(R.id.textViewDescripcion)).setText(getText(R.string.codigo_vestimenta_info)) ;
        }
        else if ( mes == (R.id.imageViewAgenda) )
        {
            ((TextView)findViewById(R.id.textViewTitle)).setText("Agenda");
            ((ImageView) findViewById(R.id.imageViewIcon)).setImageResource(R.drawable.agenda);
            ((TextView)findViewById(R.id.textViewDescripcion)).setText(getText(R.string.agenda_info)) ;
        }
        else if ( mes == (R.id.imageViewAspectos) )
        {
            ((TextView)findViewById(R.id.textViewTitle)).setText("Aspectos Generales");
            ((ImageView) findViewById(R.id.imageViewIcon)).setImageResource(R.drawable.generales);
            ((TextView)findViewById(R.id.textViewDescripcion)).setText(getText(R.string.aspectos_generales_info)) ;
        }
        else if ( mes == (R.id.imageViewAlimentos) )
        {
            ((TextView)findViewById(R.id.textViewTitle)).setText("Alimentos");
            ((ImageView) findViewById(R.id.imageViewIcon)).setImageResource(R.drawable.alimentos);
            ((TextView)findViewById(R.id.textViewDescripcion)).setText(getText(R.string.horario_alimentos_info)) ;
        }
        else if ( mes == (R.id.imageViewRecomendaciones) )
        {
            ((TextView)findViewById(R.id.textViewTitle)).setText("Recomendaciones");
            ((ImageView) findViewById(R.id.imageViewIcon)).setImageResource(R.drawable.recomendaciones);
            ((TextView)findViewById(R.id.textViewDescripcion)).setText(getText(R.string.recomendaciones_info)) ;
        }
        else if ( mes == (R.id.imageViewInternet) )
        {
            ((TextView)findViewById(R.id.textViewTitle)).setText("Telefonía e Internet");
            ((ImageView) findViewById(R.id.imageViewIcon)).setImageResource(R.drawable.internet);
            ((TextView)findViewById(R.id.textViewDescripcion)).setText(getText(R.string.telefonia_internet_info)) ;
        }
        else if ( mes == (R.id.imageViewInteres) )
        {
            ((TextView)findViewById(R.id.textViewTitle)).setText("Lugares de Interés");
            ((ImageView) findViewById(R.id.imageViewIcon)).setImageResource(R.drawable.interes);
            ((TextView)findViewById(R.id.textViewDescripcion)).setText(getText(R.string.interes_info)) ;
        }
        else if ( mes == (R.id.imageViewAerolineas) )
        {
            ((TextView)findViewById(R.id.textViewTitle)).setText("Aerolíneas");
            ((ImageView) findViewById(R.id.imageViewIcon)).setImageResource(R.drawable.aerolineas);
            ((TextView)findViewById(R.id.textViewDescripcion)).setText(getText(R.string.aerolineas_info)) ;
        }
        else if ( mes == (R.id.imageViewSalud) )
        {
            ((TextView)findViewById(R.id.textViewTitle)).setText("Salud");
            ((ImageView) findViewById(R.id.imageViewIcon)).setImageResource(R.drawable.salud);
            ((TextView)findViewById(R.id.textViewDescripcion)).setText(getText(R.string.salud_info)) ;
        }
        else if ( mes == (R.id.imageViewClima) )
        {
            ((TextView)findViewById(R.id.textViewTitle)).setText("Clima");
            ((ImageView) findViewById(R.id.imageViewIcon)).setImageResource(R.drawable.clima);
            ((TextView)findViewById(R.id.textViewDescripcion)).setText(getText(R.string.clima_info)) ;
        }
        else if ( mes == (R.id.imageViewVisa) )
        {
            ((TextView)findViewById(R.id.textViewTitle)).setText("Visa y Pasaporte");
            ((ImageView) findViewById(R.id.imageViewIcon)).setImageResource(R.drawable.visa);
            ((TextView)findViewById(R.id.textViewDescripcion)).setText(getText(R.string.visa_info)) ;
        }
        else if ( mes == (R.id.imageViewAranceles) )
        {
            ((TextView)findViewById(R.id.textViewTitle)).setText("Trámites Arancelarios");
            ((ImageView) findViewById(R.id.imageViewIcon)).setImageResource(R.drawable.aranceles);
            ((TextView)findViewById(R.id.textViewDescripcion)).setText(getText(R.string.aranceles_info)) ;
        }
        else if ( mes == (R.id.imageViewEmbajada) )
        {
            ((TextView)findViewById(R.id.textViewTitle)).setText("Embajada");
            ((ImageView) findViewById(R.id.imageViewIcon)).setImageResource(R.drawable.embajada);
            ((TextView)findViewById(R.id.textViewDescripcion)).setText(getText(R.string.embajadas_info)) ;
        }
        else if ( mes == (R.id.imageViewConsulados) )
        {
            ((TextView)findViewById(R.id.textViewTitle)).setText("Consulados");
            ((ImageView) findViewById(R.id.imageViewIcon)).setImageResource(R.drawable.consulados);
            ((TextView)findViewById(R.id.textViewDescripcion)).setText(getText(R.string.consulado_info)) ;
        }
        else if ( mes == (R.id.imageViewTelefonos) )
        {
            ((TextView)findViewById(R.id.textViewTitle)).setText("Teléfonos de Emergencia");
            ((ImageView) findViewById(R.id.imageViewIcon)).setImageResource(R.drawable.telefonos);
            ((TextView)findViewById(R.id.textViewDescripcion)).setText(getText(R.string.telefonos_info)) ;
        }


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_details, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
