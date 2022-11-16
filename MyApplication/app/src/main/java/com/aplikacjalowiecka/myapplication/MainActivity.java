package com.aplikacjalowiecka.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = findViewById(R. id.viewPDF); //kod uruchamiajacy pdf'a
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WebActivity.class);
                intent.putExtra("pdf_url", "https://www.kamionkawielka.pl/mfiles/390/28/0/z/Plan-polowan-KL-ZBIK.pdf");
                startActivity(intent);
            }
        });
    }
}