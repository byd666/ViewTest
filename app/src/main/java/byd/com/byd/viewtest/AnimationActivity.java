package byd.com.byd.viewtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

/**
 * @author byd666
 */
public class AnimationActivity extends AppCompatActivity {
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        btn= (Button) findViewById(R.id.btn_animation);
        btn.setAnimation(AnimationUtils.loadAnimation(this,R.anim.translate));
        //使用属性动画
        //ObjectAnimator.ofFloat(btn,"translationX",0,500).setDuration(10000).start();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AnimationActivity.this, "点击了Button", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
