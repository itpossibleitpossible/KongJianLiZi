package com.universe_explorer.kongjianlizi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class X55para extends AppCompatActivity {
    EditText Intercept, B1, B2;
    String s1, s2, s3;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_x55para);

        Intercept = (EditText)findViewById(R.id.Intercept);
        B1 = (EditText)findViewById(R.id.B1);
        B2 = (EditText)findViewById(R.id.B2);
        bt = (Button)findViewById(R.id.bt);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 = Intercept.getText().toString();
                s2 = B1.getText().toString();
                s3 = B2.getText().toString();;

                Intent intent = new Intent(X55para.this, X55M.class);
                intent.putExtra("Intercept", s1);
                intent.putExtra("B1", s2);
                intent.putExtra("B2", s3);
                startActivity(intent);
            }
        });


    }
}
