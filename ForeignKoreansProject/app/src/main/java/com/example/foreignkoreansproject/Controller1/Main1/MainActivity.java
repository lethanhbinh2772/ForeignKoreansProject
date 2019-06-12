package com.example.foreignkoreansproject.Controller1.Main1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.foreignkoreansproject.R;

public class MainActivity extends AppCompatActivity {
    TextView tvToContactsActivity;
    TextView tvToPlacesActivity;
    TextView tvToPromotionActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        toContactsActivity();
        toPlacesActivity();
        toPromotionActivity();
    }
    private void init() {
        tvToContactsActivity = findViewById(R.id.tv_contact);
        tvToPlacesActivity = findViewById(R.id.tv_places);
        tvToPromotionActivity = findViewById(R.id.tv_promotion);
    }

    private void toContactsActivity() {
        tvToContactsActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ContactsActivity.class);
                startActivity(intent);
            }
        });

    }
    private void toPromotionActivity(){
        tvToPlacesActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,PlacesActivity.class);
                startActivity(intent);
            }
        });


    }
    private void toPlacesActivity(){
        tvToPromotionActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,PromotionActivity.class);
                startActivity(intent);
            }
        });


    }
}
