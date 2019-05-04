package pe.edu.idat.appejemplomaterialdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class FotoActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foto);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("IdatGram");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int idItem = item.getItemId();
        String mensaje = "";
        if(idItem == R.id.opcion_buscar){
            mensaje = "Click en buscar";
        }else if(idItem == R.id.opcion_config){
            mensaje = "Click en configuración";
        }
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT)
                .show();
        return super.onOptionsItemSelected(item);
    }
}
