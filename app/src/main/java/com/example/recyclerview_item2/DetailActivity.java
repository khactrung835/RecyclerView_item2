package com.example.recyclerview_item2;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;

public class DetailActivity extends AppCompatActivity {

    Toolbar mtoolbar;
    ImageView mFlower;
    TextView mDescription;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mtoolbar = findViewById(R.id.toolbar);
        mFlower = findViewById(R.id.imageView_detail);
        mDescription = findViewById(R.id.textView_detail_Description);

        Bundle bundle =getIntent().getExtras();
            if (bundle != null) {
                mtoolbar.setTitle(bundle.getString("Title"));
                mFlower.setImageResource(bundle.getInt("Image"));
                mDescription.setText(bundle.getString("Description"));
            }
        }
    }

