package com.ntongai.andelalc40;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToPage (View view) {
        goToUrl ("https://andela.com/alc");
    }

    private void goToUrl(String url) {
        Intent intent = new Intent(this, About.class);
        intent.putExtra("url", url);
        startActivity(intent);
    }

    public void goToProfile (View view){
        Intent intent = new Intent (this, Profile.class);
        startActivity(intent);
    }

}
