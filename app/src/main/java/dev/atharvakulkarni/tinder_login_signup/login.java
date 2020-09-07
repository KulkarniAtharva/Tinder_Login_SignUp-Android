package dev.atharvakulkarni.tinder_login_signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class login extends AppCompatActivity
{

    TextView log_in_withphone;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        log_in_withphone = findViewById(R.id.log_in_withphone);
        log_in_withphone.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(login.this,add_number.class);
                startActivity(intent);
            }
        });
    }
}