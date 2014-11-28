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


        if ( mes == findViewById(R.id.imageViewModelo).getId() )
        {
            ((TextView)findViewById(R.id.textViewTitle)).setText("Modelo");
        }
        else if ( mes == findViewById(R.id.imageViewVestimenta).getId() )
        {
            ((TextView)findViewById(R.id.textViewTitle)).setText("Vestimenta");
        }
        else if ( mes == findViewById(R.id.imageViewAgenda).getId() )
        {
            ((TextView)findViewById(R.id.textViewTitle)).setText("Agenda");
        }
        else if ( mes == findViewById(R.id.imageViewAspectos).getId() )
        {
            ((TextView)findViewById(R.id.textViewTitle)).setText("Aspectos");
        }
        else if ( mes == findViewById(R.id.imageViewAlimentos).getId() )
        {
            ((TextView)findViewById(R.id.textViewTitle)).setText("Alimentos");
        }
        else if ( mes == findViewById(R.id.imageViewRecomendaciones).getId() )
        {
            ((TextView)findViewById(R.id.textViewTitle)).setText("Recomendaciones");
        }
        else if ( mes == findViewById(R.id.imageViewInternet).getId() )
        {
            ((TextView)findViewById(R.id.textViewTitle)).setText("Internet");
        }
        else if ( mes == findViewById(R.id.imageViewInteres).getId() )
        {
            ((TextView)findViewById(R.id.textViewTitle)).setText("Interes");
        }
        else if ( mes == findViewById(R.id.imageViewAerolineas).getId() )
        {
            ((TextView)findViewById(R.id.textViewTitle)).setText("Aerolineas");
        }
        else if ( mes == findViewById(R.id.imageViewSalud).getId() )
        {
            ((TextView)findViewById(R.id.textViewTitle)).setText("Salud");
        }
        else if ( mes == findViewById(R.id.imageViewClima).getId() )
        {
            ((TextView)findViewById(R.id.textViewTitle)).setText("Clima");
        }
        else if ( mes == findViewById(R.id.imageViewVisa).getId() )
        {
            ((TextView)findViewById(R.id.textViewTitle)).setText("Visa");
        }
        else if ( mes == findViewById(R.id.imageViewAranceles).getId() )
        {
            ((TextView)findViewById(R.id.textViewTitle)).setText("Aranceles");
        }
        else if ( mes == findViewById(R.id.imageViewEmbajada).getId() )
        {
            ((TextView)findViewById(R.id.textViewTitle)).setText("Embajada");
        }
        else if ( mes == findViewById(R.id.imageViewConsulados).getId() )
        {
            ((TextView)findViewById(R.id.textViewTitle)).setText("Consulados");
        }
        else if ( mes == findViewById(R.id.imageViewTelefonos).getId() )
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
