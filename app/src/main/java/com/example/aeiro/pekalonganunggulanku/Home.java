package com.example.aeiro.pekalonganunggulanku;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button buttonsatu = (Button) findViewById(R.id.button1);

        buttonsatu.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                //Toast.makeText(getApplicationContext(), "Tes", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(),submenu.class);
                startActivity(i);
            }
        });
    }
}
