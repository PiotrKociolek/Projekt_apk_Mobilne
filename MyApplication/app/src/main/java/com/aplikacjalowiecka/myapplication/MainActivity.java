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


<<<<<<< HEAD:NaPolowanie/app/src/main/java/com/aplikacjalowiecka/napolowanie/MainActivity.java

        Button button = findViewById(R.id.viewPdf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), WebActivity.class);
                    intent.putExtra("pdf_url", "https://www.soundczech.cz/temp/lorem-ipsum.pdf");
                    startActivity(intent);

                }
            });
        }
=======
        Button button = findViewById(R. id.viewPDF); //kod uruchamiajacy pdf'a
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WebActivity.class);
                intent.putExtra("pdf_url", "https://www.kamionkawielka.pl/mfiles/390/28/0/z/Plan-polowan-KL-ZBIK.pdf");
                startActivity(intent);
            }
        });
>>>>>>> parent of cafe5c9 (poprawiona nazwa i działanie planu polowań pdf):MyApplication/app/src/main/java/com/aplikacjalowiecka/myapplication/MainActivity.java
    }


    }

}