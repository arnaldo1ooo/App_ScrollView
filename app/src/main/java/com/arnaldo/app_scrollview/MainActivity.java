package com.arnaldo.app_scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Seleccion(View view) {
        switch (view.getId()) {
            case R.id.iv_banana:
                Toast.makeText(this, "Estas son bananas", Toast.LENGTH_SHORT).show();
                break;

            case R.id.iv_cereza:
                Toast.makeText(this, "Estas son cerezas", Toast.LENGTH_SHORT).show();
                break;
            case R.id.iv_frambueza:
                Toast.makeText(this, "Estas son frambuezas", Toast.LENGTH_SHORT).show();
                break;

            case R.id.iv_fresa:
                Toast.makeText(this, "Estas son fresas", Toast.LENGTH_SHORT).show();
                break;
            case R.id.iv_kiwi:
                Toast.makeText(this, "Estos son kiwis", Toast.LENGTH_SHORT).show();
                break;

            case R.id.iv_mango:
                Toast.makeText(this, "Estos son mangos", Toast.LENGTH_SHORT).show();
                break;
            case R.id.iv_manzana:
                Toast.makeText(this, "Estas son manzanas", Toast.LENGTH_SHORT).show();
                break;

            case R.id.iv_melon:
                Toast.makeText(this, "Estos son melones", Toast.LENGTH_SHORT).show();
                break;
            case R.id.iv_naranja:
                Toast.makeText(this, "Estas son naranjas", Toast.LENGTH_SHORT).show();
                break;

            case R.id.iv_pina:
                Toast.makeText(this, "Estas son piñas", Toast.LENGTH_SHORT).show();
                break;
            case R.id.iv_sandia:
                Toast.makeText(this, "Estas son sandias", Toast.LENGTH_SHORT).show();
                break;
            case R.id.iv_uva:
                Toast.makeText(this, "Estas son uvas", Toast.LENGTH_SHORT).show();
                break;
            case R.id.iv_zarzamora:
                Toast.makeText(this, "Estas son zarzamoras", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
