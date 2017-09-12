package implicitos.intents.curso.udemy.adolfo.com.intentsimplicitos;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


/**
 * intent implicitos
 * son los que pasan datos a otras aplicaciones
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        implicitIntent2();
    }

    public void implicitIntent(View view) {
        Intent implicitIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.com"));
        startActivity(implicitIntent);
    }

    private void implicitIntent2(){
        Intent implicitIntent = new Intent(Intent.ACTION_SEND);
        implicitIntent.setType("text/plain");
        implicitIntent.putExtra(Intent.EXTRA_TEXT,"Que onda perros");
        startActivity(implicitIntent);
    }

}
