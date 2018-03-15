package byd.com.byd.viewtest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * @author byd666
 */
public class ViewTestActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_test);
        initView();
    }
    private void initView() {
        findViewById(R.id.btn_scroll).setOnClickListener(this);
        findViewById(R.id.btn_animation).setOnClickListener(this);
        findViewById(R.id.btn_layoutParams).setOnClickListener(this);
        findViewById(R.id.btn_scroller).setOnClickListener(this);
        findViewById(R.id.btn_view_touch).setOnClickListener(this);
        findViewById(R.id.btn_activity_fragment).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_scroll:
                //ScrollTo和ScrollBy
                go2Activity(ScrollActivity.class,v);
                break;
            case R.id.btn_animation:
                //通过动画滑动
                go2Activity(AnimationActivity.class,v);
                break;
            case R.id.btn_layoutParams:
                //LayoutParams
                go2Activity(LayoutParamsActivity.class,v);
                break;
            case R.id.btn_scroller:
                //scroller
                go2Activity(ScrollerActivity.class,v);
                break;
            case R.id.btn_view_touch:
                //scroller
                go2Activity(TouchActivity.class,v);
                break;
            case R.id.btn_activity_fragment:
                go2Activity(Fragment1Activity.class,v);
            default:
                break;
        }
    }
    /**
     * activity跳转
     * @param clz
     * @param v
     */
    private void go2Activity(Class<?> clz,View v) {
        startActivity(new Intent(this,clz).putExtra("title",((Button)v).getText().toString().trim()));
    }
}
