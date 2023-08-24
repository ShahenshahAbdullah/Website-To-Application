package com.murad.facebooklite;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView mwebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mwebview= findViewById(R.id.vaia);
        mwebview.getSettings().setJavaScriptEnabled(true);
        mwebview.setWebViewClient(new WebViewClient());

        mwebview.loadUrl("https://mlwbd.beauty");

    }
    private class Mywebclient extends WebViewClient{
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            return super.shouldOverrideUrlLoading(view, request);
        }

    }

    @Override
    public void onBackPressed() {
        if(mwebview.isFocused() && mwebview.canGoBack())
        {
            mwebview.goBack();
        }else {
            super.onBackPressed();

        }

    }
}