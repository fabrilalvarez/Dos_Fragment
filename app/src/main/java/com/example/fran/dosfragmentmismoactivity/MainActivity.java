package com.example.fran.dosfragmentmismoactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static String MENSAJE = "ENVIAR MENSAJE BOTON PICADO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lanzarGiro();
    }

    public void lanzarGiro() {
        FragmentB fragment = (FragmentB) getFragmentManager().findFragmentById(R.id.id_fragment_b);
        if (fragment == null || !fragment.isInLayout()) {
            // start new Activity
            TextView txtv1 = (TextView) findViewById(R.id.txtv_fragment_a_port);
            txtv1.setText("Port");
        } else {
            //fragment.update(...);
            TextView txtv1 = (TextView) findViewById(R.id.txtv_fragment_a_port);
            txtv1.setText("Land");
        }
    }

    public void irActivity2(View v) {
        FragmentB fragment = (FragmentB) getFragmentManager().findFragmentById(R.id.id_fragment_b);
        if (fragment == null || !fragment.isInLayout()) {
            // start new Activity
            Intent irActivity2 = new Intent(this, Main2Activity.class);
            startActivityForResult(irActivity2, 1);
        } else {
            //fragment.update(...);
            TextView txtv2 = (TextView) findViewById(R.id.txtv2_fragment_b_land);
            txtv2.setText("HAS PICADO EL BOTON!");
            Intent enActivity2 = new Intent(this, Main2Activity.class);
            enActivity2.putExtra(MENSAJE, txtv2.getText().toString());

        }

    }
}
