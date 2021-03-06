package aar.businessinspain;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MenuSpain extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_spain);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu_spain, menu);
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

    public void advanceToInfo(View view) {

        Intent intent = new Intent(this, MenuInfo.class);
        startActivity(intent);
    }

    public void advanceToProtocolo(View view) {

        Intent intent = new Intent(this, MenuProtocolo.class);
        startActivity(intent);

    }

    public void advanceToEmergencias(View view) {
        Intent intent = new Intent(this, MenuEmergencias.class);
        startActivity(intent);
    }

    public void advanceToGeneral(View view) {
        Intent intent = new Intent(this, MenuGeneral.class);
        startActivity(intent);
    }
}
