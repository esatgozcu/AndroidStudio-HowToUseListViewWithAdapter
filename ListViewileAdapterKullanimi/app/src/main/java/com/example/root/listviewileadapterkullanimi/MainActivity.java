package com.example.root.listviewileadapterkullanimi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Listelerimizi oluşturuyoruz
    static final String[] ingilizce_kelimeler = new String[] { "access", "hang up", "headline",
            "homepage", "hardware", "invent", "dial" };

    static final String[]  ingilizce_kelimeler_anlami = new String[] { "erişim", "kapamak", "manşet",
            "giriş sayfası", "donanım", "icat etmek", "telefon numarasını çevirmek" };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Listviewi tanımlıyoruz
        ListView ListView;
        ListView =(ListView)findViewById(R.id.ListView);

        //ArrayAdapterimizi tanımlıyoruz.
        //4.parametreye ingilizce kelimeler olan listemizi yazıyoruz
        ArrayAdapter<String> veriAdaptoru=new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, android.R.id.text1, ingilizce_kelimeler);

        //Listviewin içine adapteri set edip adaptere verdiğimiz ismi yazıyoruz
        ListView.setAdapter(veriAdaptoru);


        //Listviewde bir item tıklandığında olucakları belirliyoruz
        //onClikListener değil onItemClickListener olduğuna dikkat ediniz
        ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(MainActivity.this, ingilizce_kelimeler_anlami[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
