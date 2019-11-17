package com.example.junction_project;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProductDesActivity extends Activity {
    Button btn;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prod_des_layout);
        setTitle("Swappy");

        btn = (Button)findViewById(R.id.conSelBtn);
    }
}
