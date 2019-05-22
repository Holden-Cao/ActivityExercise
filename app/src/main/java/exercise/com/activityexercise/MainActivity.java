package exercise.com.activityexercise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button BtnJump;
    private static final String TAG="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("CeShiA","onCreate");
        Button BtnJump=(Button) findViewById(R.id.btn_jump);
        BtnJump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.setClass(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("CeShiA","onReStart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("CeShiA","onStart");
    }



    @Override
    protected void onResume() {
        super.onResume();
        Log.i("CeShiA","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("CeShiA","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("CeShiA","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("CeShiA","onDestroy");
    }
}
