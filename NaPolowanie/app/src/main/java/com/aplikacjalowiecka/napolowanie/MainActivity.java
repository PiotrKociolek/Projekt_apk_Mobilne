package com.aplikacjalowiecka.napolowanie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

public class MainActivity extends AppCompatActivity {



  protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout linear=(LinearLayout)findViewById(R.id.linear);
        setContentView(R.layout.activity_main);







        Button button = findViewById(R.id.viewPdf);//pdf poczatek
        button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), WebActivity.class);
            intent.putExtra("pdf_url","https://www.soundczech.cz/temp/lorem-ipsum.pdf"); //plan polowan
            startActivity(intent);//pdf koniec

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



}//koniec programu

}
//private void CreatepopUpwindow() {
//    LayoutInflater inflater= (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
//    View popUpView=inflater.inflate(R.layout.activity_main,null);

//     int width=ViewGroup.LayoutParams.MATCH_PARENT;
//      int height=ViewGroup.LayoutParams.MATCH_PARENT;
//    boolean focusable=true;
//    PopupWindow popupWindow=new PopupWindow(popUpView,width,height,focusable);
// layout.post(new Runnable() {
//  @Override
//   public void run() {
//       popupWindow.showAtLocation(layout,Gravity.BOTTOM,0,0);
//
//     }
//     TextView OK  ;
//      Skip=popUpView.findViewById(R.id.Skip);
//     Gotit=popUpView.findViewById(R.id.Gotit);
//   Skip.setOnClickListener(new View.OnClickListener() {
//      @Override
//       public void onClick(View v) {
//         popupWindow.dismiss();
//      }
// });