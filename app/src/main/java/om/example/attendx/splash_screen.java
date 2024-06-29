package om.example.attendx;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class splash_screen extends AppCompatActivity {

    TextView textAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        textAnimation = findViewById(R.id.textAnimation);

        Animation size = AnimationUtils.loadAnimation(this,R.anim.size);
        textAnimation.setAnimation(size);

        Intent intent = new Intent(this,login_activity.class);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                textAnimation.setAnimation(size);
                startActivity(intent);
                finish();
            }
        },6000);
    }
}