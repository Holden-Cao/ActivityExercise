package exercise.com.activityexercise;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by caohuabin on 2019/5/22.
 */

public class SecondActivity extends Activity {
    private static final String TAG="SecondActivity";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.i("CeShiB","onCreate");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("CeShiB","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("CeShiB","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("CeShiB","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("CeShiB","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("CeShiB","onDestroy");
    }
}
