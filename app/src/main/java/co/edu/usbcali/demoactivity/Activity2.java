package co.edu.usbcali.demoactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by usuario on 18/11/17.
 */

public class Activity2 extends AppCompatActivity {

    private TextView txtDemo;
    private Button btnVolver;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        String mensaje = getIntent().getSerializableExtra("mensaje").toString();
        txtDemo = findViewById(R.id.txt_demo);
        txtDemo.setText(mensaje);

        btnVolver = findViewById(R.id.btn_volver);
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMainActivity = new Intent(view.getContext(), MainActivity.class);
                intentMainActivity.putExtra("mensaje2", "recibido");
                startActivity(intentMainActivity);
            }
        });


    }
}
