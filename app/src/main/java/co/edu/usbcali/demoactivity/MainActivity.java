package co.edu.usbcali.demoactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnIr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getIntent().getSerializableExtra("mensaje2") != null) {
            String mensajeDevuelta = getIntent().getSerializableExtra("mensaje2").toString();
            Toast.makeText(this, mensajeDevuelta, Toast.LENGTH_SHORT).show();

        }

        btnIr = findViewById(R.id.btn_ir);
        btnIr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentActivity2 = new Intent(view.getContext(), Activity2.class);
                intentActivity2.putExtra("mensaje", "Hola");
                startActivity(intentActivity2);
            }
        });
    }
}
