package aar.businessinspain;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class MenuEmergencias extends Activity {

    public static int mes = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_emergencias);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu_emergencias, menu);
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

    public void advanceToEmbajada(View view) {

        Intent intent = new Intent(this,Details.class);

        ImageView boton = (ImageView) findViewById(R.id.imageViewEmbajada);
        mes = boton.getId();
        intent.putExtra("Data", mes);
        startActivity(intent);
    }

    public void advanceToConsulados(View view) {
        Intent intent = new Intent(this,Details.class);

        ImageView boton = (ImageView) findViewById(R.id.imageViewConsulados);
        mes = boton.getId();
        intent.putExtra("Data", mes);
        startActivity(intent);
    }

    public void advanceToTelefonos(View view) {
        Intent intent = new Intent(this,Details.class);

        ImageView boton = (ImageView) findViewById(R.id.imageViewTelefonos);
        mes = boton.getId();
        intent.putExtra("Data", mes);
        startActivity(intent);

    }
}
