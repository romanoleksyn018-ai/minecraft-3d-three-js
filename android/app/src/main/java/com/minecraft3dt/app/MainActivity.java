package com.minecraft3dt.app;
import android.app.Activity; import android.os.Bundle; import android.webkit.WebChromeClient; import android.webkit.WebSettings; import android.webkit.WebView;
public class MainActivity extends Activity {
    private WebView webView;
    @Override protected void onCreate(Bundle s) {
        super.onCreate(s); webView = new WebView(this); setContentView(webView);
        WebSettings ws = webView.getSettings(); ws.setJavaScriptEnabled(true); ws.setDomStorageEnabled(true); ws.setMediaPlaybackRequiresUserGesture(false); ws.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
        webView.setWebChromeClient(new WebChromeClient()); webView.loadUrl("file:///android_asset/index.html");
    }
    @Override public void onBackPressed() { if (webView.canGoBack()) webView.goBack(); else super.onBackPressed(); }
}