package appewtc.masterung.welovewheelchair;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RequestInFrom extends AppCompatActivity {
    //exelicit
    private RadioGroup radioGroup1, radioGroup2, radioGroup3, radioGroup4, radioGroup5;
    private RadioButton choiceRadio1, choiceRadio2, choiceRadio3, choiceRadio4, choiceRadio5, choiceRadio15, choiceRadio6, choiceRadio7, choiceRadio8, choiceRadio9, choiceRadio10, choiceRadio13, choiceRadio14;
    private String[] chooseString = new String[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_in_from);
        //bind
        bindWidet();
        //เชคปุ่ม
        radioController();


    }//main method หลัก

    public void clickDataRequest(View view) {
        //เชคการเลือกทุกปุ่ม
        if (checChoose()) {
            //เมื่อเลือกทุกปุ่ม
            Intent intent = new Intent(RequestInFrom.this, CommentWheelChair.class);
            intent.putExtra("Choose", chooseString);
            startActivity(intent);

        } else {
            //ถ้าเลือกไม่ครบ
            Toast.makeText(RequestInFrom.this, "โปรดกรอกให้ครบ", Toast.LENGTH_LONG).show();
        }   // if

    }   // clickData

    private boolean checChoose() {

        boolean bolresult = true;
        bolresult = (choiceRadio1.isChecked() ||
                choiceRadio2.isChecked() ||
                choiceRadio3.isChecked()) &&

                (choiceRadio4.isChecked() ||
                        choiceRadio5.isChecked() ||
                        choiceRadio6.isChecked()) &&

                (choiceRadio7.isChecked() ||
                        choiceRadio8.isChecked()) &&

                (choiceRadio10.isChecked() ||
                        choiceRadio13.isChecked() ||
                        choiceRadio14.isChecked() ||
                        choiceRadio9.isChecked());


        return bolresult;
    }


    private void radioController() {

        //Group1
        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                switch (i) {

                    case R.id.radioButton:
                        chooseString[0] = "1"; //มีค่าเท่ากับ 1

                        break;
                    case R.id.radioButton2:
                        chooseString[0] = "2";
                        break;
                    case R.id.radioButton3:
                        chooseString[0] = "3";
                        break;

                }
            } //event
        });
        //Group2
        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                switch (i) {

                    case R.id.radioButton4:
                        chooseString[1] = "1";
                        break;
                    case R.id.radioButton5:
                        chooseString[1] = "2";
                        break;
                    case R.id.radioButton6:
                        chooseString[1] = "3";
                        break;

                }
            } //event
        });
        //Group3
        radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                switch (i) {

                    case R.id.radioButton7:
                        chooseString[2] = "1";
                        break;
                    case R.id.radioButton8:
                        chooseString[2] = "2";
                        break;

                }
            } //event
        });
        //Group4
        radioGroup4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                switch (i) {

                    case R.id.radioButton10:
                        chooseString[3] = "1";
                        break;
                    case R.id.radioButton11:
                        chooseString[3] = "2";
                        break;

                }
            } //event
        });

        //Group5
        radioGroup5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                switch (i) {

                    case R.id.radioButton13:
                        chooseString[4] = "1";
                        break;
                    case R.id.radioButton14:
                        chooseString[4] = "2";
                        break;
                    case R.id.radioButton15:
                        chooseString[4] = "3";
                        break;
                    case R.id.radioButton9:
                        chooseString[4] = "4";
                        break;

                }
            } //event
        });


    } //คลุมปุ่ม

    private void bindWidet() {
        radioGroup1 = (RadioGroup) findViewById(R.id.ragGroup1);
        radioGroup2 = (RadioGroup) findViewById(R.id.ragGroup2);
        radioGroup3 = (RadioGroup) findViewById(R.id.ragGroup3);
        radioGroup4 = (RadioGroup) findViewById(R.id.ragGroup4);
        radioGroup5 = (RadioGroup) findViewById(R.id.ragGroup5);

        choiceRadio1 = (RadioButton) findViewById(R.id.radioButton);
        choiceRadio2 = (RadioButton) findViewById(R.id.radioButton2);
        choiceRadio3 = (RadioButton) findViewById(R.id.radioButton3);

        choiceRadio4 = (RadioButton) findViewById(R.id.radioButton4);
        choiceRadio5 = (RadioButton) findViewById(R.id.radioButton5);
        choiceRadio6 = (RadioButton) findViewById(R.id.radioButton6);

        choiceRadio7 = (RadioButton) findViewById(R.id.radioButton7);
        choiceRadio8 = (RadioButton) findViewById(R.id.radioButton8);


        choiceRadio9 = (RadioButton) findViewById(R.id.radioButton10);
        choiceRadio10 = (RadioButton) findViewById(R.id.radioButton11);


        choiceRadio13 = (RadioButton) findViewById(R.id.radioButton13);
        choiceRadio14 = (RadioButton) findViewById(R.id.radioButton14);
        choiceRadio15 = (RadioButton) findViewById(R.id.radioButton15);
        choiceRadio9 = (RadioButton) findViewById(R.id.radioButton9);


    }
} //main class
