package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.tvGoster);
    }

    String Metin = "";

    public void btntiklaninca(View view) {
        Button btn = findViewById(view.getId());
        Metin += btn.getText();
        textView.setText(Metin);
    }

    int sayi1 = 0;
    int sayi2 = 0;
    char islem;

    public void islem(View view) {
        sayi1 = Integer.parseInt((String) textView.getText());
        textView.setText("0");
        Metin = "";
        switch (view.getId()) {
            case R.id.btnTopla:
                islem = '+';
                break;
            case R.id.btnCikar:
                islem = '-';
                break;
            case R.id.btnBol:
                islem = '/';
                break;
            case R.id.btnCarp:
                islem = 'x';
                break;
            case R.id.btnSıfırla:
                islem = 'C';
                break;
            case R.id.btnÖnceki_Sıfırla:
                islem = 'T';
                break;

        }
    }
    int sonuc = 0;
    public void öncekini_sil(View view)
    {
        Metin="";
        textView.setText("0");
    }
    public void btn_sayisil(View view)
    {

   Metin=Metin.substring(0,Metin.length()-1);
    textView.setText(Metin);
    }
    public void btnEsittir(View view) {
        sayi2 = Integer.parseInt((String) textView.getText());

        if (islem == '+')
        {
            sonuc = sayi1 + sayi2;
            textView.setText("" + sonuc);
        } else if (islem == '-') {
            sonuc = sayi1 - sayi2;
            textView.setText("" + sonuc);
        } else if (islem == 'x')
        {
            sonuc = sayi1 * sayi2;
            textView.setText("" + sonuc);


        }
        else if (islem == 'C')
        {
            sonuc = 0;
            textView.setText("0");
        }

        else {
            double sonuc2 = (double) sayi1 / sayi2;
            textView.setText("" + sonuc2);
        }
    }

}
