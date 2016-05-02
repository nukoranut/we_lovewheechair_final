package appewtc.masterung.welovewheelchair;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CommentWheelChair extends AppCompatActivity {

    //ประกาศตัวแปร
    private String[] chooseString, dataStrings;
    private int chooseATnt, imageAnInt;
    private String contentString;
    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment_wheel_chair);

        //
        imageView = (ImageView) findViewById(R.id.imageView20);
        textView = (TextView) findViewById(R.id.txtDetail);


        //รับค่า from intent
        chooseString = getIntent().getStringArrayExtra("Choose");
        // setup value
        chooseATnt = findChoose();


        //showView();
        ShowView();
    } //หลัก

    private void ShowView() {
        dataStrings = getResources().getStringArray(R.array.my_content);

        switch (chooseATnt) {


            case 11111:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 11112:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 11113:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
                break;
            case 11114:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
                break;
            //
            case 11121:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 11122:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[4];
                break;
            case 11123:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[4];
                break;
            case 11124:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[4];
                break;
            //
            case 11211:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 11212:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 11213:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[4];
                break;
            case 11214:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[4];
                break;
            //
            case 11221:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 11222:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[4];
                break;
            case 11223:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[4];
                break;
            case 11224:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[4];
                break;

            // 1.2
            case 12111:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 12112:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 12113:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[4];
                break;
            case 12114:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[3];
                break;
            //
            case 12121:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 12122:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 12123:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[4];
                break;
            case 12124:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[4];
                break;
            //
            case 12211:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 12212:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 12213:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[4];
                break;
            case 12214:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[3];
                break;
            //
            case 12321:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 12322:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 12323:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[4];
                break;
            case 12324:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[4];
                break;
            //
            case 13111:
                imageAnInt = R.drawable.wh5;
                contentString = dataStrings[5];
                break;
            case 13112:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 13113:
                imageAnInt = R.drawable.wh3;
                contentString = dataStrings[3];
                break;
            case 13114:
                imageAnInt = R.drawable.wh3;
                contentString = dataStrings[3];
                break;
            //
            case 13121:
                imageAnInt = R.drawable.wh5;
                contentString = dataStrings[5];
                break;
            case 13122:
                imageAnInt = R.drawable.wh3;
                contentString = dataStrings[3];
                break;
            case 13123:
                imageAnInt = R.drawable.wh3;
                contentString = dataStrings[3];
                break;
            case 13124:
                imageAnInt = R.drawable.wh3;
                contentString = dataStrings[3];
                break;
            // ๅๅๅๅๅๅๅๅๅๅๅๅๅๅๅๅๅๅๅๅๅๅๅๅๅๅๅๅๅๅๅๅๅๅ
            case 13211:
                imageAnInt = R.drawable.wh5;
                contentString = dataStrings[5];
                break;
            case 13212:
                imageAnInt = R.drawable.wh3;
                contentString = dataStrings[3];
                break;
            case 13213:
                imageAnInt = R.drawable.wh3;
                contentString = dataStrings[3];
                break;
            case 13214:
                imageAnInt = R.drawable.wh3;
                contentString = dataStrings[3];
                break;
            //
            case 13221:
                imageAnInt = R.drawable.wh5;
                contentString = dataStrings[5];
                break;
            case 13222:
                imageAnInt = R.drawable.wh3;
                contentString = dataStrings[3];
                break;
            case 13223:
                imageAnInt = R.drawable.wh3;
                contentString = dataStrings[3];
                break;
            case 13224:
                imageAnInt = R.drawable.wh3;
                contentString = dataStrings[3];
                break;

            // group 2
            case 21111:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 21112:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 21113:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
                break;
            case 21114:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
                break;
            //
            case 21121:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 21122:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
                break;
            case 21123:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
                break;
            case 21124:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
                break;
            //
            case 21211:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 21212:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
                break;
            case 21213:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
                break;
            case 21214:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
                break;
            //
            case 21221:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 21222:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
                break;
            case 21223:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
                break;
            case 21224:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
                break;
            //  2.1
            case 22111:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;

            case 22112:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
                break;
            case 22113:
                imageAnInt = R.drawable.wh3;
                contentString = dataStrings[3];
                break;
            case 22114:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
                break;
            //
            case 22121:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 22122:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 22123:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
                break;
            case 22124:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
                break;
            //
            case 22211:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 22212:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 22213:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 22214:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            //
            case 22221:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 22222:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 22223:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 22224:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            //
            case 23111:
                imageAnInt = R.drawable.wh5;
                contentString = dataStrings[5];
                break;
            case 23112:
                imageAnInt = R.drawable.wh5;
                contentString = dataStrings[5];
                break;
            case 23113:
                imageAnInt = R.drawable.wh3;
                contentString = dataStrings[3];
                break;
            case 23114:
                imageAnInt = R.drawable.wh3;
                contentString = dataStrings[3];
                break;
            //
            case 23121:
                imageAnInt = R.drawable.wh5;
                contentString = dataStrings[5];
                break;
            case 23122:
                imageAnInt = R.drawable.wh5;
                contentString = dataStrings[5];
                break;
            case 23123:
                imageAnInt = R.drawable.wh3;
                contentString = dataStrings[3];
                break;
            case 23124:
                imageAnInt = R.drawable.wh3;
                contentString = dataStrings[3];
                break;

            //
            case 23211:
                imageAnInt = R.drawable.wh5;
                contentString = dataStrings[5];
                break;
            case 23212:
                imageAnInt = R.drawable.wh2;
                contentString = dataStrings[2];
                break;
            case 23213:
                imageAnInt = R.drawable.wh2;
                contentString = dataStrings[2];
                break;
            case 23214:
                imageAnInt = R.drawable.wh2;
                contentString = dataStrings[2];
                break;
            //
            case 23221:
                imageAnInt = R.drawable.wh5;
                contentString = dataStrings[5];
                break;
            case 23242:
                imageAnInt = R.drawable.wh5;
                contentString = dataStrings[5];
                break;
            case 23243:
                imageAnInt = R.drawable.wh5;
                contentString = dataStrings[5];
                break;
            case 23244:
                imageAnInt = R.drawable.wh5;
                contentString = dataStrings[5];
                break;
            // group 3
            case 31111:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 31112:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 31113:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
                break;
            case 31114:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
                break;
            //
            case 31121:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 31122:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
            case 31123:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
            case 31124:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
                //
            case 31211:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 31212:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
            case 31213:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
            case 31214:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
                //
            case 31221:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 31222:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 31223:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 31224:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            // 3.2
            case 32111:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 32112:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 32113:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
                break;
            case 32114:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
                break;
            //
            case 32121:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 32122:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
            case 32123:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
            case 32124:
                imageAnInt = R.drawable.wh4;
                contentString = dataStrings[4];
                //
            case 32211:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 32212:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 32213:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 32214:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            //
            case 32221:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 32222:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 32223:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            case 32224:
                imageAnInt = R.drawable.wh1;
                contentString = dataStrings[1];
                break;
            //
            case 33111:
                imageAnInt = R.drawable.wh5;
                contentString = dataStrings[5];
                break;
            case 33112:
                imageAnInt = R.drawable.wh3;
                contentString = dataStrings[3];
                break;
            case 33113:
                imageAnInt = R.drawable.wh2;
                contentString = dataStrings[2];
                break;
            case 33114:
                imageAnInt = R.drawable.wh2;
                contentString = dataStrings[2];
                break;
            //
            case 33121:
                imageAnInt = R.drawable.wh5;
                contentString = dataStrings[5];
                break;
            case 33122:
                imageAnInt = R.drawable.wh2;
                contentString = dataStrings[2];
                break;
            case 33123:
                imageAnInt = R.drawable.wh2;
                contentString = dataStrings[2];
                break;
            case 33124:
                imageAnInt = R.drawable.wh2;
                contentString = dataStrings[2];
                break;
            //
            case 33211:
                imageAnInt = R.drawable.wh5;
                contentString = dataStrings[5];
                break;
            case 33212:
                imageAnInt = R.drawable.wh2;
                contentString = dataStrings[2];
                break;
            case 33213:
                imageAnInt = R.drawable.wh2;
                contentString = dataStrings[2];
                break;
            case 33214:
                imageAnInt = R.drawable.wh2;
                contentString = dataStrings[2];
                break;
            //
            case 33221:
                imageAnInt = R.drawable.wh5;
                contentString = dataStrings[5];
                break;
            case 33222:
                imageAnInt = R.drawable.wh2;
                contentString = dataStrings[2];
                break;
            case 33223:
                imageAnInt = R.drawable.wh2;
                contentString = dataStrings[2];
                break;
            case 33224:
                imageAnInt = R.drawable.wh2;
                contentString = dataStrings[2];
                break;
            default:

                imageAnInt = R.drawable.wh3;
                contentString = "ไม่มีข้อมูล";
                break;


        }// switch

        imageView.setImageResource(imageAnInt);
        textView.setText(contentString);

    } //show View


    private int findChoose() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < chooseString.length; i++) {
            stringBuilder.append(chooseString[i]);
        }


        return Integer.parseInt(stringBuilder.toString());
    }

} //ย่อย