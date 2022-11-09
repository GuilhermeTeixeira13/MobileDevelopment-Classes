package pt.ubi.di.pmd.exstorage1;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;
import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {
    EditText edText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edText = (EditText) findViewById(R.id.edText);

        putText();

        SharedPreferences oSP = getPreferences(0);
    }

    private void putText(){
        try {
            InputStream is = this.getResources().openRawResource(R.raw.instructions);
            byte[] buffer = new byte[is.available()];
            while (is.read(buffer) != -1);
            String text = new String(buffer);

            edText.setText(text);
        } catch (Exception e) {
            Log.e(TAG, ""+e.toString());
        }
    }

    public void exitNotSave(View v){

    }

    public void sendSave(View v){

    }
}