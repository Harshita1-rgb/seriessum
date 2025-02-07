package com.example.seriessum;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private EditText n;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n=findViewById(R.id.n);
        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n_S=n.getText().toString();
                if(TextUtils.isEmpty(n_S)){
                    n.setError("Field cannot be empty");
                    return;
                }
                int n_I=Integer.parseInt(n_S);
                double answer=1.0;
                if(n_I<1){
                    n.setError("Enter a positive number");
                    return;
                }
                else{
                    while(n_I>1){
                        answer=answer+((double) 1 /n_I);
                        n_I=n_I-1;
                    }
                }

                Intent intent=new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("EXTRA_DOUBLE",answer);
                startActivity(intent);
            }
        });
    }
}

