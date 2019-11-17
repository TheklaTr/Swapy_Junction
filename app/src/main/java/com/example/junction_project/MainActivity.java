package com.example.junction_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {
    EditText searchEdt, citySearch;
    SeekBar sb1, sb2;
    Button searchBtn;
    String itemStr, cityStr;
    Integer price, location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("");

        searchEdt = (EditText)findViewById(R.id.searchBox);
        citySearch = (EditText)findViewById(R.id.cityTxt);
        sb1 = (SeekBar)findViewById(R.id.seekBar1);
        sb2 = (SeekBar)findViewById(R.id.seekBar2);
        searchBtn = (Button)findViewById(R.id.searchBtn);

        itemStr = searchEdt.getText().toString();
        cityStr = citySearch.getText().toString();

        sb1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
            public void onStartTrackingTouch(SeekBar seekBar){
            }

            public void onStopTrackingTouch(SeekBar seekBar){
            }

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser){
                price = sb1.getProgress();
                location = sb2.getProgress();
            }
        });

        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ProductListActivity.class);

                startActivity(intent);
            }
        });
    }
}
