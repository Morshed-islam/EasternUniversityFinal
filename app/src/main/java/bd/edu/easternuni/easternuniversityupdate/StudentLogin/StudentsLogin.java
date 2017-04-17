package bd.edu.easternuni.easternuniversityupdate.StudentLogin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import bd.edu.easternuni.easternuniversity.R;


/**
 * Created by SWOPON on 6/6/2016.
 */
public class StudentsLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.varsity_login);




        WebView myWebView = (WebView) findViewById(R.id.teacherView);
        WebSettings webSettings = myWebView.getSettings();
        myWebView.setWebViewClient(new WebViewClient());
        webSettings.setJavaScriptEnabled(true);
        myWebView.getSettings().setSupportZoom(true);
        myWebView.getSettings().setBuiltInZoomControls(true);
        myWebView.getSettings().setDisplayZoomControls(false);
        myWebView.getSettings().setUseWideViewPort(true);
        myWebView.getSettings().setLoadWithOverviewMode(true);
        myWebView.loadUrl("http://webportal.easternuni.edu.bd:8080/student/_login.aspx");



    }
}
