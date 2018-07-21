package com.example.minhd.my_practice_java_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtUserName,edtPassword;
    CheckBox chboxSaveInfor;
    Button btnLogin,btnSignUp;
    TextView txtGetPassword;
    ImageButton imgbtnFacebook,imgbtnGoogle,imgbtnMicrosoft;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mapping();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               Toast.makeText(MainActivity.this,"Username = "+edtUserName.getText(),Toast.LENGTH_LONG).show();
            }
        });

    }

    public void mapping() {

        edtUserName=findViewById(R.id.edt_userName);
        edtPassword=findViewById(R.id.edt_password);
        chboxSaveInfor=findViewById(R.id.chbox_saveInformation);
        btnLogin=findViewById(R.id.btn_login);
        btnSignUp=findViewById(R.id.btn_signup);
        txtGetPassword=findViewById(R.id.txt_getPassWord);
        imgbtnFacebook=findViewById(R.id.imgbtn_facebook);
        imgbtnMicrosoft=findViewById(R.id.imgbtn_microsoft);
        imgbtnGoogle=findViewById(R.id.imgbtn_google);

    }
}
