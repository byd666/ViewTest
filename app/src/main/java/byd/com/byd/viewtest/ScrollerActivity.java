package byd.com.byd.viewtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import widget.ScrollerView;

/**
 * @author byd666
 */
public class ScrollerActivity extends AppCompatActivity {
    ScrollerView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroller);
        scrollView=new ScrollerView(this);
    }
}
