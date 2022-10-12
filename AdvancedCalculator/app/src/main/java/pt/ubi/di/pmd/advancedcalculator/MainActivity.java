package pt.ubi.di.pmd.advancedcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.*;
import android.widget.*;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText oTEdit1;
    EditText oTEdit2;
    Button oButton;
    TextView oTView1;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        oTEdit1 = (EditText) findViewById(R.id.number1);
        oTEdit2 = (EditText) findViewById(R.id.number2);

        oButton = (Button) findViewById(R.id.sum);
        oTView1 = (TextView) findViewById(R.id.result);

        oButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        int id = view.getId();

        if(id == R.id.sum){
            try {
                double n1 = Double.parseDouble(oTEdit1.getText().toString());
                double n2 = Double.parseDouble(oTEdit2.getText().toString());
                oTView1.setText("Result-> "+String.valueOf(soma(n1, n2)));
            }catch (Exception e){
                oTView1.setText("Ocorreu um erro!");
            }
        }
    }

    public double soma(double d1, double d2){
        return d1 + d2;
    }
}