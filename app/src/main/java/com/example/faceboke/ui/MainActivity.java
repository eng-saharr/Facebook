package com.example.faceboke.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.faceboke.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    EditText Email,passWord;
    Button login,forgetPassword,creatNewAcount;
    TextView Or;
    ImageView faceImage;

    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        auth=FirebaseAuth.getInstance();
        initUI();
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,HomeActivity2.class));
                finish();
                login();
            }
        });
        singUpWithEmailAndPassword("sahar@app.com","123456");

            }

    private void singUpWithEmailAndPassword(String email, String password) {
        auth.createUserWithEmailAndPassword(email,password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful())
                            Toast.makeText(MainActivity.this,"success",Toast.LENGTH_SHORT).show();
                        else
                            Log.d("ccccccc", "onComplete:"+ task.getException().getLocalizedMessage());

                    }
                });
    }



    private void initUI() {

        setContentView(R.layout.activity_main);
        Email=findViewById(R.id.email_txt);
        passWord=findViewById(R.id.password);
        login=findViewById(R.id.login);
        forgetPassword=findViewById(R.id.forget_password);
        creatNewAcount=findViewById(R.id.creat_account);
        Or=findViewById(R.id.or);
        faceImage=findViewById(R.id.face_img);

    }

    private void login() {
        if(Email.getText().toString().isEmpty()){
            Toast.makeText(this,"enter email",Toast.LENGTH_LONG).show();
            return;

        }
        if(Email.getText().toString().isEmpty()){
            Toast.makeText(this,"enter password",Toast.LENGTH_LONG).show();
            return;

        }
        if(Email.getText().toString().equals("sahar@app.com") && passWord.getText().toString().equals("123456")){
            Toast.makeText(this,"success",Toast.LENGTH_SHORT).show();

        }else
         {
            Toast.makeText(this,"error",Toast.LENGTH_SHORT).show();
         }




    }


}






