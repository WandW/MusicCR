package com.example.adw.musiccr;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by ADW on 2016/6/30.
 */
public class loginactivity  extends Activity{
    EditText ac,pw;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginlayout);
        ac =(EditText) findViewById(R.id.ac);
        pw =(EditText) findViewById(R.id.pw);
        login =(Button)findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ac.getText().toString().equals("admin")&&pw.getText().toString().equals("123456")){
                    Intent intent = new Intent();
                    intent.setClass(loginactivity.this,albumactivity.class);
                    startActivity(intent);
                    finish();
                }else{
                    Toast.makeText(loginactivity.this,"账户密码错误",Toast.LENGTH_LONG).show();
                }



            }
        });



    }
}
