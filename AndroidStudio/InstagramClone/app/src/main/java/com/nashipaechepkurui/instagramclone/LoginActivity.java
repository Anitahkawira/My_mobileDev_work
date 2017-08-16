package com.nashipaechepkurui.instagramclone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText utUserName = (EditText) findViewById(R.id.utUserEmail);
        EditText etpassword = (EditText) findViewById(R.id.etPassword);

        Button btnSignUp = (Button) findViewById(R.id.btnSignUp);
        Button btnLogin = (Button) findViewById(R.id.btnLogin);

        ImageView ivlogo = (ImageView) findViewById(R.id.ivLogo);

        TextView tvOR =(TextView) findViewById(R.id.tvOr);
        TextView tvHelp =(TextView) findViewById(R.id.btnLogin);
        TextView tvLanguage =(TextView) findViewById(R.id.tvLanguage);
        TextView tvFacebook =(TextView) findViewById(R.id.tvFacebook);

    }
}
