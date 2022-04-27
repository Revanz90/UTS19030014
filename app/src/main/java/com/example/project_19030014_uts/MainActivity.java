package com.example.project_19030014_uts;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnVolume;
    Button btnLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText ejarijari = (EditText) findViewById(R.id.Jarijari);
        EditText etinggi = (EditText) findViewById(R.id.Tinggi);
        btnVolume = (Button) findViewById(R.id.btnVolume);
        btnLuas = (Button) findViewById(R.id.btnluas);
        TextView tvvolume = (TextView) findViewById(R.id.hvolume);
        TextView tvluas = (TextView) findViewById(R.id.hluas);

        btnVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double r, t, volume;
                r = Double.valueOf(ejarijari.getText().toString().trim());
                t = Double.valueOf(etinggi.getText().toString().trim());

                volume = (3.14*r*r*t);
                String hasil2 = String.valueOf(volume);
                tvvolume.setText(hasil2);
            }
        });
        btnLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double r, t, luas;
                r = Double.valueOf(ejarijari.getText().toString().trim());
                t = Double.valueOf(etinggi.getText().toString().trim());
                luas = (2*3.14*r)*(r+t);
                String hasil1 = String.valueOf(luas);
                tvluas.setText(hasil1);
            }
        });
    }
}