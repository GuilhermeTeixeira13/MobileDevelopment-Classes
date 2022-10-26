package pt.ubi.di.pmd.activitylifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import android.util.*;

public class MainActivity extends Activity
{
    private static final String TAG = "P4";

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // FALTA CÓDIGO
        Log.i(TAG, "onCreate() method was called");
    }


    @Override
    public void onStart()
    {
        super.onStart();
        Log.i(TAG, "onStart() method was called");
    }

    @Override
    public void onResume()
    {
        super.onResume();
        Log.i(TAG, "onResume() method was called");
    }

    @Override
    public void onRestart()
    {
        super.onRestart();
        Log.i(TAG, "onRestart() method was called");
    }

    @Override
    public void onPause()
    {
        super.onPause();
        Log.i(TAG, "onPause() method was called");
    }

    @Override
    public void onStop()
    {
        super.onStop();
        Log.i(TAG, "onStop() method was called");
    }

    @Override
    public void onDestroy()
    {
        super.onDestroy();
        Log.i(TAG, "onDestroy() method was called");
    }
}

