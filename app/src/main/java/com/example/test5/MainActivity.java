package com.example.test5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        Button button=(Button) findViewById(R.id.btn_browse);
        final EditText editurl=(EditText) findViewById(R.id.edit_url);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.setData(Uri.parse(editurl.getText().toString()));
                startActivity(intent);
            }
        });
    }
}
