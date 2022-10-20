package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button but1;
    private EditText text1;
    private EditText text2;
    private EditText text3;
    private EditText text4;
    private Button but2;
    private Button but3;
    private CheckBox chkMarie;
    private RadioButton radiobut;
    private RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        but1 = (Button) findViewById(R.id.button);
        but2 = (Button) findViewById(R.id.button2);
        but3 = (Button) findViewById(R.id.button3);
        text1 = (EditText) findViewById(R.id.text1);
        text2 = (EditText) findViewById(R.id.text2);
        text3 = (EditText) findViewById(R.id.text3);
        text4 = (EditText) findViewById(R.id.text4);
        chkMarie = (CheckBox) findViewById(R.id.checkBox);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);


        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "L'étudiant "+ text1.getText()+" "+text2.getText()+" a "+text3.getText()+" ans !",Toast.LENGTH_LONG).show();
                text4.setText("L'étudiant "+ text1.getText()+" "+text2.getText()+" a "+text3.getText()+" ans ");
            }
        });

        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (chkMarie.isChecked())
                    Toast.makeText(MainActivity.this, "Vous êtes marié",
                            Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(MainActivity.this, "Vous êtes célibataire",
                            Toast.LENGTH_LONG).show();
            }
        });

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            int radioI = radioGroup.getCheckedRadioButtonId();
                radiobut = findViewById(radioI);
                /*if(radioI==R.id.radioButton)
                {*/
                    Toast.makeText(MainActivity.this, "Vous etes en filiere "+radiobut.getText(),Toast.LENGTH_LONG).show();
               /* }*/

            }
        });

    }
}