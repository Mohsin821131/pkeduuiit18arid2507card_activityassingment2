package com.example.pkeduuiit18_arid_2507card_activityassingment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Question1 extends AppCompatActivity {
    Button button2;
    ImageButton imageButtonUI;
    TextView TextviewUI;
    EditText etText;
    CheckBox checkBox,checkBox2,checkBox3;
    RadioButton rbtake,rbdine;
    ToggleButton toggleButton;
    ImageView imageView;
    SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);

        initialize();
        performance();
    }

    private void performance() {
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Question1.this, "Button is clicked", Toast.LENGTH_SHORT).show();
            }
        });
        imageButtonUI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Question1.this, "Image Button is clicked", Toast.LENGTH_SHORT).show();
            }
        });
        TextviewUI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Question1.this, "Control is on Text view", Toast.LENGTH_SHORT).show();
            }
        });
        etText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Question1.this, "Control is on Text Field", Toast.LENGTH_SHORT).show();

            }
        });
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Question1.this, "You select Pizza", Toast.LENGTH_SHORT).show();
            }
        });
        checkBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Question1.this, "You select Burger", Toast.LENGTH_SHORT).show();
            }
        });
        checkBox3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Question1.this, "You select Molten Lava", Toast.LENGTH_SHORT).show();
            }
        });
        rbtake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Question1.this, "Take Away in 5 MIN", Toast.LENGTH_SHORT).show();
            }
        });
        rbdine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Question1.this, "Dine ready in 5 MIN", Toast.LENGTH_SHORT).show();
            }
        });
        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Question1.this, "Toggle is clicked", Toast.LENGTH_SHORT).show();
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Question1.this, "Control is on imageView", Toast.LENGTH_SHORT).show();
            }
        });
        seekBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Question1.this, "You are playing with Seekbar", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initialize() {
        button2=(Button) findViewById(R.id.button2);
        imageButtonUI=(ImageButton) findViewById(R.id.imageButtonUI);
        TextviewUI = (TextView) findViewById(R.id.textviewUI);
        etText = (EditText) findViewById(R.id.etText);
        checkBox= (CheckBox) findViewById(R.id.checkBox);
        checkBox2=(CheckBox) findViewById(R.id.checkBox2);
        checkBox3 =(CheckBox) findViewById(R.id.checkBox3);
        rbtake=(RadioButton) findViewById(R.id.rbtake);
        rbdine=(RadioButton) findViewById(R.id.rbdine);
        toggleButton=(ToggleButton) findViewById(R.id.toggleButton);
        imageView=(ImageView) findViewById(R.id.imageview);
        seekBar=(SeekBar) findViewById(R.id.seekBar);
    }
}