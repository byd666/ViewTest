package byd.com.byd.viewtest;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * @author Administrator
 */
public class Fragment1Activity extends AppCompatActivity {
    private static String TAG="Fragment1Activity";
    private ThreadLocal<Boolean> mThreadLocal=new ThreadLocal<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment1);
        System.out.print("Fragment1Activity------>onCreate");

        BlankFragment fragment=BlankFragment.newInstance("f1");
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = supportFragmentManager.beginTransaction();
        transaction.add(R.id.container_fg,fragment,"").commit();
        System.out.println("Fragment1Activity------>onCreate");

        mThreadLocal.set(true);
        Log.e(TAG, "[Thread#main]mBooleanThreadLocal=" + mThreadLocal.get());
        new Thread("thread1"){
            @Override
            public void run() {
                mThreadLocal.set(false);
                Log.e(TAG, "[Thread1]mBooleanThreadLocal=" + mThreadLocal.get());
            }
        }.start();
        new Thread("thread2"){
            @Override
            public void run() {
                Log.e(TAG, "[Thread2]mBooleanThreadLocal=" + mThreadLocal.get());
            }
        }.start();

    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("Fragment1Activity------>onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("Fragment1Activity------>onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("Fragment1Activity------>onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("Fragment1Activity------>onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("Fragment1Activity------>onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("Fragment1Activity------>onRestart");
    }
}
