package com.example.exercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnlogin, btnsignin;
    EditText edemail, edpassword;
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnlogin = findViewById(R.id.Login);
        edemail = findViewById(R.id.edEmail);
        edpassword = findViewById(R.id.edpassword);
        btnsignin = findViewById(R.id.SignIn);

        btnsignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Register.class);
                startActivity(i);

            }
        });

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nama = edemail.getText().toString();

                password = edpassword.getText().toString();


                String email = "admin@mail.com";

                String pass = "123456";

                if (nama.isEmpty() || password.isEmpty()) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Email dan Password harus Di isi !!!",
                            Toast.LENGTH_SHORT);
                    t.show();

                }else {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "LoginBerhasil",Toast.LENGTH_LONG);
                    Bundle b = new Bundle();
                    b.putString("a",nama.trim());
                    b.putString("b",password.trim());
                    Intent i = new Intent(getApplicationContext(), HomeActivity.class);
                    i.putExtras(b);
                    startActivity(i);
                    t.show();
                }

            }
        });
    }
}