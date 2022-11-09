package pt.ubi.di.pmd.exintentfilters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "INTFILT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, Intent.EXTRA_TEXT);
    }
}