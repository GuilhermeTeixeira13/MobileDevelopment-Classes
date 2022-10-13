package pt.ubi.di.pmd.advancedcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.text.Editable;
import android.text.TextWatcher;
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
        oTEdit2.addTextChangedListener(
                new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    }

                    @Override
                    public void afterTextChanged(Editable editable) {
                        soma(oTEdit1.getText().toString(),oTEdit2.getText().toString());
                    }
                }
        );
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        if (id == R.id.sum) {
            soma(oTEdit1.getText().toString(),oTEdit2.getText().toString());
        }
    }

    public void soma(String d1, String d2){
        try {
            double n1 = Double.parseDouble(d1);
            double n2 = Double.parseDouble(d2);
            oTView1.setText("Result-> " + String.valueOf(n1 + n2));
        } catch (Exception e) {
            oTView1.setText("Ocorreu um erro!");
        }
    }
}