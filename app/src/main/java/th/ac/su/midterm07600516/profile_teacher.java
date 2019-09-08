package th.ac.su.midterm07600516;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class profile_teacher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_teacher);
        Intent intent = getIntent();
        String name = intent.getStringExtra("bbb");
        Toast.makeText(profile_teacher.this,(R.string.Welcome)+" "+(name.toString()),Toast.LENGTH_SHORT).show();
    }
}
