package appewtc.masterung.welovewheelchair;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Vdo_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vdo_);
    }   // Main Method

    public void clickVideo1(View view) {
        showVideo("https://youtu.be/rj21mWDW39Y");
    }

    public void clickVideo2(View view) {
        showVideo("https://youtu.be/KMft2bVvGrQ");
    }
    public void clickVideo3(View view) {
        showVideo("https://youtu.be/zEYpYO6BS1U");
    }
    public void clickVideo4(View view) {
        showVideo("https://youtu.be/LZ4k8zPPVSY");
    }

    private void showVideo(String strURLvideo) {

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(strURLvideo));
        startActivity(intent);

    }   // showVideo


}   // Main Class
