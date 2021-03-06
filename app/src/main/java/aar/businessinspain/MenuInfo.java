package aar.businessinspain;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class MenuInfo extends Activity {

    public static int mes = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_info);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu_info, menu);
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

    public void advanceToInternet(View view) {

        Intent intent = new Intent(this,Details.class);

        ImageView boton = (ImageView) findViewById(R.id.imageViewInternet);
        mes = boton.getId();
        intent.putExtra("Data", mes);
        startActivity(intent);
    }

    public void advanceToInteres(View view) {

        Intent intent = new Intent(this,Details.class);

        ImageView boton = (ImageView) findViewById(R.id.imageViewInteres);
        mes = boton.getId();
        intent.putExtra("Data", mes);
        startActivity(intent);
    }

    public void advanceToAerolineas(View view) {

        Intent intent = new Intent(this,Details.class);

        ImageView boton = (ImageView) findViewById(R.id.imageViewAerolineas);
        mes = boton.getId();
        intent.putExtra("Data", mes);
        startActivity(intent);
    }

    public void advanceToSalud(View view) {

        Intent intent = new Intent(this,Details.class);

        ImageView boton = (ImageView) findViewById(R.id.imageViewSalud);
        mes = boton.getId();
        intent.putExtra("Data", mes);
        startActivity(intent);
    }

    public void advanceToClima(View view) {

        Intent intent = new Intent(this,Details.class);

        ImageView boton = (ImageView) findViewById(R.id.imageViewClima);
        mes = boton.getId();
        intent.putExtra("Data", mes);
        startActivity(intent);
    }

    public void advanceToVisa(View view) {

        Intent intent = new Intent(this,Details.class);

        ImageView boton = (ImageView) findViewById(R.id.imageViewVisa);
        mes = boton.getId();
        intent.putExtra("Data", mes);
        startActivity(intent);
    }

    public void advanceToAranceles(View view) {

        Intent intent = new Intent(this,Details.class);

        ImageView boton = (ImageView) findViewById(R.id.imageViewAranceles);
        mes = boton.getId();
        intent.putExtra("Data", mes);
        startActivity(intent);
    }
}
