package com.example.aeiro.pekalonganunggulanku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class struktur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.struktur);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        TableLayout tablelayoutid = (TableLayout)this.findViewById(R.id.tablelayoutid);
        // Inflate your row "template" and fill out the fields.
        TableRow row = (TableRow)getLayoutInflater().inflate(R.layout.layout_row, null);
        ((TextView)row.findViewById(R.id.idnotabel)).setText("4");
        ((TextView)row.findViewById(R.id.idnamaperusahaantabel)).setText("Perusahaan D");
        ((TextView)row.findViewById(R.id.idpemasukantabel)).setText("Masuk");
        tablelayoutid.addView(row);
        return true;
    }


}