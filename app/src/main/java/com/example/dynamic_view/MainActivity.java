package com.example.dynamic_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout namelist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        namelist=findViewById(R.id.nameview);
    }

    public void add(View view){
        final View nameview = getLayoutInflater().inflate(R.layout.fieldview,null,false);
        ImageView removeb=nameview.findViewById(R.id.remove);
        removeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               removeView(nameview);
            }
        });
        namelist.addView(nameview);
    }

    public void removeView(View v){
        namelist.removeView(v);
    }
}