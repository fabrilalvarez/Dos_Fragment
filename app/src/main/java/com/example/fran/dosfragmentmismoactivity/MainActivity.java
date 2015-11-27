package com.example.fran.dosfragmentmismoactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

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
}
