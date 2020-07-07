package com.australia.now;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class MainActivity extends AppCompatActivity {

    private AdView mAdView,adBottom;
    TextView horescope,news,radio,video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setElevation(0);

        // Loading banner ADs....
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        adBottom=findViewById(R.id.adViewBottom);
        AdRequest adRequestBottom = new AdRequest.Builder().build();
        adBottom.loadAd(adRequestBottom);

        //ADs code finisd=hes here....
        // Start main code from here

        horescope=(TextView)findViewById(R.id.horscope);
        radio=(TextView)findViewById(R.id.radio);
        video=(TextView)findViewById(R.id.video);
        news=(TextView)findViewById(R.id.news);


        horescope.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent horscope=new Intent(MainActivity.this,HorescopeActivity.class);
                startActivity(horscope);
            }
        });
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent video=new Intent(MainActivity.this,VideoActivity.class);
                startActivity(video);
            }
        });
        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent news=new Intent(MainActivity.this,VideoActivity.class);
                startActivity(news);
            }
        });
        radio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent radio=new Intent(MainActivity.this,RadioActivity.class);
                startActivity(radio);
            }
        });

    }
}