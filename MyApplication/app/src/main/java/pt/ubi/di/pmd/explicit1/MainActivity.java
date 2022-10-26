package pt.ubi.di.pmd.explicit1;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.content.Intent;
import android.content.ComponentName;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void StartCalculator(View v){
        Intent iCalc = new Intent();
        iCalc.setAction(Intent.ACTION_MAIN);
        iCalc.setComponent(new ComponentName("com.android.settings","com.android.settings.Settings"));
        startActivity(iCalc);
    }

    public void startActivity2 ( View v ) {
        Intent iActivity = new Intent(this, Activity2.class);
        iActivity.putExtra("string1","If you were able to do this, you are FABULOUS!");
        startActivity(iActivity) ;
    }

}