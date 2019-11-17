package com.example.junction_project;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ProductListActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_list_layout);
        setTitle("swappy");

        final GridView gv = (GridView)findViewById(R.id.gridView);
        MyGridAdapter gridAdapter = new MyGridAdapter(this);
        gv.setAdapter(gridAdapter);
    }

    public class MyGridAdapter extends BaseAdapter{
        Context context;
        public MyGridAdapter(Context c){
            context = c;
        }
        public int getCount(){
            return sneakersID.length;
        }
        public Object getItem(int position){
            return null;
        }
        public long getItemId(int position){
            return 0;
        }
        public View getView(int position, View convertView, ViewGroup parent){
            ImageView imgView = new ImageView(context);
            imgView.setLayoutParams(new GridView.LayoutParams(400, 500));
            imgView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imgView.setPadding(5, 5, 5, 5);
            imgView.setImageResource(sneakersID[position]);

            final int pos = position;
            imgView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), ProductDesActivity.class);
                    startActivity(intent);
                }
            });
            return imgView;
        }
    }

    Integer[] sneakersID = {R.drawable.nikeair, R.drawable.redconvers, R.drawable.sneakers_cat, R.drawable.sneakers_gold,
                        R.drawable.sneakers_green, R.drawable.sneakers_red_white, R.drawable.sneakers_wlwphant};
}
