package com.example.pkeduuiit18_arid_2507card_activityassingment2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etName,etEmail,etPass;
    Button button,login,Question1;
    RadioButton rdMale,rdFemale;
    CheckBox checkbox1,checkbox2,checkbox3;
    DBhelper databaseHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();
        performaction();
    }

    private void performaction() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String gender;
                if(rdMale.isChecked())
                {
                    gender="Male";
                }
                else
                {
                    gender="female";
                }
                String subject = null;
                if (checkbox1.isChecked()){
                    subject="BSCS";
                }
                if (checkbox2.isChecked()){
                    subject= subject +"BSIT";
                }
                if (checkbox3.isChecked()){
                    subject=subject+"BSSE";
                }
                Boolean user_data = databaseHelper.insertQuiz2(etName.getText().toString(), etEmail.getText().toString(), etPass.getText().toString(),gender,subject);


                startActivity(new Intent(MainActivity.this,Login.class));




            }
        });
        login.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         startActivity(new Intent(MainActivity.this,Login.class));
                                     }
                                 }

        );
        Question1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Question1.class));
            }
        });
    }
    private void initialize() {
        databaseHelper =new DBhelper(this);
        etEmail = (EditText) findViewById(R.id.etemail);
        login = (Button) findViewById(R.id.login);
        Question1=(Button) findViewById(R.id.Question1);
        etName = (EditText) findViewById(R.id.etname);
        etPass = (EditText) findViewById(R.id.etpass);
        button= (Button) findViewById(R.id.button);
        checkbox1=(CheckBox) findViewById(R.id.checkBox);
        checkbox2=(CheckBox) findViewById(R.id.checkBox2);
        checkbox3=(CheckBox) findViewById(R.id.checkBox3);
        rdMale=(RadioButton) findViewById(R.id.rbmale);
        rdFemale=(RadioButton) findViewById(R.id.rbfemale);
    }
}