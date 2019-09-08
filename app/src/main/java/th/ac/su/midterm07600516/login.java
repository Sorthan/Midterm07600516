package th.ac.su.midterm07600516;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import th.ac.su.midterm07600516.ModelProfile.Auth;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final Button loginButton = findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText UsernameText = findViewById(R.id.username_editText);
                EditText PasswordText = findViewById(R.id.password_editText);
                String userRecieveid = UsernameText.getText().toString();
                String passRecieveid = PasswordText.getText().toString();
                Auth auth = new Auth(userRecieveid,passRecieveid);
                if(auth.checkInput()){
                    if(userRecieveid.equals("aaa")) {
                        Intent intent = new Intent(login.this, profile_student.class);
                        intent.putExtra("aaa","Sorathan Saetang");
                        startActivity(intent);
                        finish();
                    }
                    else if(userRecieveid.equals("bbb")){
                        Intent intent = new Intent(login.this, profile_teacher.class);
                        intent.putExtra("bbb","Promlert Lovichit");
                        startActivity(intent);
                        finish();
                    }
                }
                else{
                    new AlertDialog.Builder(login.this).setTitle("INCORRECT").setMessage(R.string.Invalid_Input)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    //todo:
                                }
                            })
                            .show();
                }
            }
        });
    }
}
