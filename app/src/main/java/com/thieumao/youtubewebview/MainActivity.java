package com.thieumao.youtubewebview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void watchYoutube(View view) {
        this.openWebview(Constant.linkWatchYoutube, false);
    }

    public void history(View view) {
        this.openWebview(Constant.linkHistory, false);
    }

    public void signUp(View view) {
        this.openWebview(Constant.linkSignUp, true);
    }

    public void singIn(View view) {
        this.openWebview(Constant.linkSignIn, true);
    }

    private void openWebview(String link, Boolean isBrowser) {
        Intent intent = new Intent(this, WebviewActivity.class);
        intent.putExtra("link", link);
        intent.putExtra("isBrowser", isBrowser);
        startActivity(intent);
    }
}
