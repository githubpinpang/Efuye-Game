package com.menu.efuye;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;

import android.annotation.*;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class StartUp extends AppCompatActivity {
    ImageButton ib;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startup);
        ib = (ImageButton) findViewById(R.id.ib);


        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent In2 = new Intent(StartUp.this, MainActivity.class);
                startActivity(In2);
            }
            });

//}
            // finish();

    }
}