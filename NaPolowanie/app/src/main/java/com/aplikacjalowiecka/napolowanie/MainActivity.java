package com.aplikacjalowiecka.napolowanie;

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
    }


    }

}