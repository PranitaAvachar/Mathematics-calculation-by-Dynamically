package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintHelper;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private LinearLayout linearLayout,linearLayout2,linearLayoutInput;
    private TextView txtResult;
    private Button btnadd,btnsub,btnmulti,btndiv,btnInput;
    int sum=0;
    ArrayList<EditText> arrEditText=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        btnadd.setOnClickListener(new btnadd());
        btnsub.setOnClickListener(new btnsub());
        btnmulti.setOnClickListener(new btnmulti());
        btndiv.setOnClickListener(new btnmulti());
        btnInput.setOnClickListener(new btnInput());

    }
    private class btnInput implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            EditText btnInput = new EditText(MainActivity.this);
            btnInput.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            btnInput.setHint("Please Enter Input");
            btnInput.setInputType(InputType.TYPE_CLASS_NUMBER);
            linearLayoutInput.addView(btnInput);
            arrEditText.add(btnInput);
        }
    }
    private class btnadd implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            int sum = Integer.parseInt(arrEditText.get(0).getText().toString());
            for (int i = 1; i < arrEditText.size(); i++) {
                sum = sum + Integer.parseInt(arrEditText.get(i).getText().toString());
            }
            txtResult.setText(sum + "");
        }
        }
        private class btnsub implements View.OnClickListener {
            @Override
            public void onClick(View view) {
                int sum = Integer.parseInt(arrEditText.get(0).getText().toString());
                for (int i = 1; i < arrEditText.size(); i++) {
                    sum = sum - Integer.parseInt(arrEditText.get(i).getText().toString());
                }
                txtResult.setText(sum + "");
            }
        }
            private class btnmulti implements View.OnClickListener {

                @Override
                public void onClick(View view) {
                    int sum = Integer.parseInt(arrEditText.get(0).getText().toString());
                    for (int i = 1; i < arrEditText.size(); i++) {
                        sum = sum * Integer.parseInt(arrEditText.get(i).getText().toString());
                    }
                    txtResult.setText(sum + "");
                }
            }
                private class btndiv implements View.OnClickListener{
                    @Override
                    public void onClick(View view) {
                        int sum= Integer.parseInt(arrEditText.get(0).getText().toString());
                        for (int i = 1; i < arrEditText.size(); i++) {
                            sum = sum / Integer.parseInt(arrEditText.get(i).getText().toString());
                        }
                        txtResult.setText(sum+"");
                    }
                }
                private void init(){
                    linearLayout=findViewById(R.id.linearLayout);
                    linearLayout2=findViewById(R.id.linearLayout2);
                    linearLayoutInput=findViewById(R.id.linearLayoutInputs);
                    txtResult=findViewById(R.id.textview);
                    btnadd=findViewById(R.id.btnadd);
                    btndiv=findViewById(R.id.btndiv);
                    btnsub=findViewById(R.id.btnsub);
                    btnmulti=findViewById(R.id.btnmulti);
                    btnInput=findViewById(R.id.btnInput);
          }
            }
