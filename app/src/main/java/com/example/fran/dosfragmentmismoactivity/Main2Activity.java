package com.example.fran.dosfragmentmismoactivity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getIntent();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if (resultCode == Activity.RESULT_OK) {
                String mensaje = data.getStringExtra(MainActivity.MENSAJE);
                TextView edtmensaje = (TextView) findViewById(R.id.txtv2_fragment_b_land);
                edtmensaje.setText(mensaje);
            }
        }
    }


}
