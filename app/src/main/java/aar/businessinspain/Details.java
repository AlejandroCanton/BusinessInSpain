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
            ((TextView)findViewById(R.id.textViewTitle)).setText("Modelo");
            ((TextView)findViewById(R.id.textViewDescripcion)).setText(getText(R.string.modelo_comunicacion_info)) ;
        }
        else if ( mes == (R.id.imageViewVestimenta) )
        {
            ((TextView)findViewById(R.id.textViewTitle)).setText("Vestimenta");
        }
        else if ( mes == (R.id.imageViewAgenda) )
        {
            ((TextView)findViewById(R.id.textViewTitle)).setText("Agenda");
        }
        else if ( mes == (R.id.imageViewAspectos) )
        {
            ((TextView)findViewById(R.id.textViewTitle)).setText("Aspectos");
        }
        else if ( mes == (R.id.imageViewAlimentos) )
        {
            ((TextView)findViewById(R.id.textViewTitle)).setText("Alimentos");
        }
        else if ( mes == (R.id.imageViewRecomendaciones) )
        {
            ((TextView)findViewById(R.id.textViewTitle)).setText("Recomendaciones");
        }
        else if ( mes == (R.id.imageViewInternet) )
        {
            ((TextView)findViewById(R.id.textViewTitle)).setText("Internet");
        }
        else if ( mes == (R.id.imageViewInteres) )
        {
            ((TextView)findViewById(R.id.textViewTitle)).setText("Interes");
        }
        else if ( mes == (R.id.imageViewAerolineas) )
        {
            ((TextView)findViewById(R.id.textViewTitle)).setText("Aerolineas");
        }
        else if ( mes == (R.id.imageViewSalud) )
        {
            ((TextView)findViewById(R.id.textViewTitle)).setText("Salud");
        }
        else if ( mes == (R.id.imageViewClima) )
        {
            ((TextView)findViewById(R.id.textViewTitle)).setText("Clima");
        }
        else if ( mes == (R.id.imageViewVisa) )
        {
            ((TextView)findViewById(R.id.textViewTitle)).setText("Visa");
        }
        else if ( mes == (R.id.imageViewAranceles) )
        {
            ((TextView)findViewById(R.id.textViewTitle)).setText("Aranceles");
        }
        else if ( mes == (R.id.imageViewEmbajada) )
        {
            ((TextView)findViewById(R.id.textViewTitle)).setText("Embajada");
        }
        else if ( mes == (R.id.imageViewConsulados) )
        {
            ((TextView)findViewById(R.id.textViewTitle)).setText("Consulados");
        }
        else if ( mes == (R.id.imageViewTelefonos) )
        {
            ((TextView)findViewById(R.id.textViewTitle)).setText("Telefonos");
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
