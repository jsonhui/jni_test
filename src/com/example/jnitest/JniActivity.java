package com.example.jnitest;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class JniActivity extends Activity {
	private EditText editText1;
    private EditText editText2;
    private Button testButton;


    static {
        System.loadLibrary("JniTest");//加载类库
    }

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_jni);
		  testButton = (Button) findViewById(R.id.test);
	        editText1 = (EditText) findViewById(R.id.editText1);
	        editText2 = (EditText) findViewById(R.id.editText2);
	        
	        testButton.setOnClickListener(
	        		new OnClickListener() {
						@Override
						public void onClick(View v) {
						    String num1 = editText1.getText().toString().trim();
						    String num2 = editText2.getText().toString().trim();
						    if(TextUtils.isEmpty(num1)&&TextUtils.isEmpty(num2)){
						        return;
						    }else{
						        int a=Integer.parseInt(num1);
						        int b=Integer.parseInt(num2);
						        int iSum = JniClient.AddInt(a, b);
						        String strSum = num1+"+"+num2+"="+ iSum;
						        Toast.makeText(getApplicationContext(), strSum, 0).show();
						    }
						}
					});
	    }
	}
