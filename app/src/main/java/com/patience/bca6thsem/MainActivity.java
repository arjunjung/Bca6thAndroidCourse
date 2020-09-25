package com.patience.bca6thsem;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    Button buttonHo;
    ImageView imageHo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        buttonHo = findViewById(R.id.buttonHo);
        imageHo = findViewById(R.id.imageHo);

        buttonHo.setText("Button ko Text Change");

        buttonHo.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageHo.setVisibility( View.VISIBLE );
            }
        } );
    }
}