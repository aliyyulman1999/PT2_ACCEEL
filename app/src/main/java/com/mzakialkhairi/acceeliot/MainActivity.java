// code by Muhammad Zaki Alkhairi

package com.mzakialkhairi.acceeliot;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    // pindah layout
    public void Mode(View view){
        Intent intent = new Intent(MainActivity.this, ModeActivity.class);
        startActivity(intent);
    }

}

