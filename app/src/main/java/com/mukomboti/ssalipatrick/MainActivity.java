package com.mukomboti.ssalipatrick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


/* Using xml to call the function agree
        button = (Button) findViewById(R.id.agree);
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                Intent myIntent = new Intent(MainActivity.this,
                        NewActivity.class);
                startActivity(myIntent);
            }
        });
*/
    }

    public void agree(View view){
        Intent myIntent = new Intent(this, personal_account.class);
        startActivity(myIntent);
    }
}
