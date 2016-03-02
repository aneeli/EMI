/*Aneeli Bhartepudi A03954308*/

package com.example.aneeli.emi_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private interestcalculator interestcalculator;

//VIEW OBJECTS
private EditText principal$;
private EditText interest;
private TextView five;
private TextView ten;
private TextView fifeteen;
private TextView twenty;
private TextView twentyfive;
private TextView thirty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        interestcalculator = new interestcalculator();

        //REFERENCES TO INPUTS
        principal$ = (EditText) findViewById(R.id.editText);
        interest = (EditText) findViewById(R.id.editText2);

        // REFERENCES TO OUTPUT ELEMENTS
        five = (TextView) findViewById(R.id.textView4);
        ten = (TextView) findViewById(R.id.textView6);
        fifeteen = (TextView) findViewById(R.id.textView10);
        twenty = (TextView) findViewById(R.id.textView12);
        twentyfive = (TextView) findViewById(R.id.textView14);
        thirty = (TextView) findViewById(R.id.textView16);

        //LISTENER EVENT FOR PRINCIPAL INPUT
        principal$.addTextChangedListener(principalTextWatcher);
        interest.addTextChangedListener(interestTextWatcher);

    }




private TextWatcher interestTextWatcher = new TextWatcher() {
    //THESE METHODS ARE CALLED WHEN THE TEXT IS CHANGED

    public void onTextChanged(CharSequence s, int start, int before, int count) {
        //CATCH AN EXCEPTION WHEN THE INPUT IS NOT A NUMBER

        try {
            interestcalculator.setinterest((int) Double.parseDouble(s.toString()));
        } catch (NumberFormatException e) {
            interestcalculator.setinterest(0);
        }
        Showresult();
    }

    public void afterTextChanged(Editable s) {
    }

    public void beforeTextChanged(CharSequence s,int start, int count, int after) {
    }
};
    private TextWatcher principalTextWatcher = new TextWatcher() {
        // THESE METHODS ARE CALLED WHEN THE TEXT IS CHANGED

        public void onTextChanged(CharSequence s, int start, int before, int count) {
            //CATCH AN EXCEPTION WHEN THE INPUT IS NOT A NUMBER

            try {
                interestcalculator.setprincipal$((int) Double.parseDouble(s.toString()));
            } catch (NumberFormatException e) {
                interestcalculator.setprincipal$(0);
            }
            Showresult();
        }


        public void afterTextChanged(Editable s) {
        }

        public void beforeTextChanged(CharSequence s,int start, int count, int after) {
        }

    };


    public void Showresult() {

        five.setText("$" + String.format("%.02f", interestcalculator.getmfive()));
        ten.setText("$" + String.format("%.02f", interestcalculator.getmten()));
        fifeteen.setText("$" + String.format("%.02f", interestcalculator.getmfifeteen()));
        twenty.setText("$" + String.format("%.02f", interestcalculator.getmtwenty()));
        twentyfive.setText("$" + String.format("%.02f", interestcalculator.getmtwentyfive()));
        thirty.setText("$" + String.format("%.02f", interestcalculator.getmthirty()));


    }
}