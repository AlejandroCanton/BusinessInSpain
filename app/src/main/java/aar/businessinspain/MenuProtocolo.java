package aar.businessinspain;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class MenuProtocolo extends Activity {

    public static int mes = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_protocolo);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu_protocolo, menu);
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

    public void advanceToModelo(View view) {
        Intent intent = new Intent(this,Details.class);

        ImageView boton = (ImageView) findViewById(R.id.imageViewModelo);
        mes = boton.getId();
        intent.putExtra("Data", mes);
        startActivity(intent);
    }

    public void advanceToVestimenta(View view) {
        Intent intent = new Intent(this,Details.class);

        ImageView boton = (ImageView) findViewById(R.id.imageViewVestimenta);
        mes = boton.getId();
        intent.putExtra("Data", mes);
        startActivity(intent);

    }

    public void advanceToAgenda(View view) {
        Intent intent = new Intent(this,Details.class);

        ImageView boton = (ImageView) findViewById(R.id.imageViewAgenda);
        mes = boton.getId();
        intent.putExtra("Data", mes);
        startActivity(intent);
    }

    public void advanceToAspectos(View view) {
        Intent intent = new Intent(this,Details.class);

        ImageView boton = (ImageView) findViewById(R.id.imageViewAspectos);
        mes = boton.getId();
        intent.putExtra("Data", mes);
        startActivity(intent);
    }

    public void advanceToAlimentos(View view) {
        Intent intent = new Intent(this,Details.class);

        ImageView boton = (ImageView) findViewById(R.id.imageViewAlimentos);
        mes = boton.getId();
        intent.putExtra("Data", mes);
        startActivity(intent);
    }

    public void advanceToRecomendaciones(View view) {
        Intent intent = new Intent(this,Details.class);

        ImageView boton = (ImageView) findViewById(R.id.imageViewRecomendaciones);
        mes = boton.getId();
        intent.putExtra("Data", mes);
        startActivity(intent);
    }
}
