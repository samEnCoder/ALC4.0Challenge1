package com.ntongai.andelalc40;

import android.app.Activity;
import android.content.Intent;
import android.net.http.SslError;
import  android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toolbar;

public class About extends AppCompatActivity {

    private WebView webView;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        Intent i = getIntent();
        String url = i.getStringExtra("url");
        webView = (WebView) findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.setWebViewClient(new WebViewClient(){
             @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error){
                 handler.proceed();
             }
        });
        webView.loadUrl(url);
    }
}
