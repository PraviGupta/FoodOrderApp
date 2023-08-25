package com.example.project1301;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.project1301.databinding.ActivityRegistrationActivityBinding;
import com.example.project1301.UserData;
import com.example.project1301.databinding.ActivityRegistrationActivityBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class RegistrationActivity extends AppCompatActivity {
    ActivityRegistrationActivityBinding binding;
    FirebaseAuth firebaseAuth;
    FirebaseDatabase firebaseDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityRegistrationActivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        firebaseAuth=FirebaseAuth.getInstance();
        firebaseDatabase= FirebaseDatabase.getInstance();
        binding.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = binding.etname.getText().toString();
                String phone = binding.etphone.getText().toString();
                String mail = binding.etmail.getText().toString();
                String pass = binding.etpass.getText().toString();
                String addr = binding.etadd.getText().toString();
                boolean numeric = true;
                numeric = name.matches("-?\\d+(\\.\\d+)?");
                if(!numeric)
                {
                    firebaseAuth.createUserWithEmailAndPassword(mail, pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                Toast.makeText(RegistrationActivity.this, "Congratulations! You are Successfully Registered", Toast.LENGTH_SHORT).show();
                                saveUser(name, phone, mail, pass, addr);
                                Intent intent=new Intent(RegistrationActivity.this,SignInActivity.class);
                                startActivity(intent);
                            } else {
                                Toast.makeText(RegistrationActivity.this, "Something Went Wrong ", Toast.LENGTH_SHORT).show();
                                Toast.makeText(RegistrationActivity.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
                else
                    Toast.makeText(RegistrationActivity.this, "Username is Invalid", Toast.LENGTH_LONG).show();
            }
        });
    }

    private void saveUser(String name, String phone, String mail, String pass, String addr) {
        String uuid=firebaseAuth.getCurrentUser().getUid();
        UserData data=new UserData(uuid,name,phone,mail,pass,addr);
        firebaseDatabase.getReference().child("Registered User").child(uuid).setValue(data).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if(task.isSuccessful())
                {
                    Toast.makeText(RegistrationActivity.this, "User Saved", Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(RegistrationActivity.this, SignInActivity.class);
                    startActivity(intent);

                }
                else {
                    Toast.makeText(RegistrationActivity.this, "User not Saved", Toast.LENGTH_SHORT).show();
                    Toast.makeText(RegistrationActivity.this,task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}