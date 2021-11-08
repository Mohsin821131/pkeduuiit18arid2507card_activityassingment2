package com.example.pkeduuiit18_arid_2507card_activityassingment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText etEmail,etpass;
    Button button;
    DBhelper databaseHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initialize();
        performance();

    }

    private void performance() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor Login_data = databaseHelper .login(etEmail.getText().toString(),etpass.getText().toString());
                if((Login_data != null) && (Login_data.getCount() > 0)){

                    startActivity(new Intent(Login.this,Student_Activity.class));
                }
                else{
                    Toast.makeText(Login.this, "Invalid Cardinals",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private void initialize() {
        databaseHelper=new DBhelper(this);
        etEmail =(EditText) findViewById(R.id.etemail);
        etpass = (EditText) findViewById(R.id.etpass);
        button = (Button)  findViewById(R.id.button);
    }
}