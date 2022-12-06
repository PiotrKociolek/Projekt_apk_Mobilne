package com.aplikacjalowiecka.napolowanie;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {



  protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout linear=(LinearLayout)findViewById(R.id.linear);
        setContentView(R.layout.activity_main);






        Button button = findViewById(R.id.viewPdf);
        button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), WebActivity.class);
            intent.putExtra("pdf_url","https://www.soundczech.cz/temp/lorem-ipsum.pdf"); //plan polowan
            startActivity(intent);

            Button aparat; //aparat poczatek
            aparat = (Button) findViewById(R.id.aparat);
            aparat.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        Intent intent1 = new Intent();
                        intent1.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
                        startActivity(intent1);
                    } catch (Exception e)
                    {
                        e.printStackTrace();
                    }

                }//aparat koniec
            });

        }
    });



}

}