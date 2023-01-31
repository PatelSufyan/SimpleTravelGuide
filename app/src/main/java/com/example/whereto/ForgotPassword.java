package com.example.whereto;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class ForgotPassword extends AppCompatActivity {


    private EditText enterEmail;
    private Button btnReset;
    private String email;

    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

          getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        enterEmail = findViewById(R.id.enterEmail);
        btnReset = findViewById(R.id.btnReset);

        auth = FirebaseAuth.getInstance();


        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                forgetPassword();

            }
        });
    }

    private void validateData() {
        email = enterEmail.getText().toString();
        if (email.isEmpty()) {
            enterEmail.setError("Email is required!");
        } else {
            forgetPassword();
        }
    }


     private void forgetPassword() {
          auth.sendPasswordResetEmail(email).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
          public void onComplete(@NonNull Task<Void> task) {
            if(task.isSuccessful()){
              Toast.makeText(ForgotPassword.this,"Please check your mail",Toast.LENGTH_LONG).show();
            startActivity(new Intent(ForgotPassword.this,LoginScreen.class));
          finish();
    }
     else{
        Toast.makeText(ForgotPassword.this,"Error : "+task.getException().getMessage(),Toast.LENGTH_LONG).show();
    }
     }
        });
    }

}
