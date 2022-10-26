package pt.ubi.di.pmd.implicit;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View v){
        Intent iSendMessage = new Intent(Intent.ACTION_SEND);
        iSendMessage.putExtra(Intent.EXTRA_TEXT, "You should type the message here!");
        iSendMessage.setType("text/plain");
        startActivity(iSendMessage);
    }
}