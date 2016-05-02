package appewtc.masterung.welovewheelchair;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DetailWheelChairActivity extends AppCompatActivity  {

    //Explicit
    private ImageView hub10ImageView, hub11ImageView, hub12ImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_wheel_chair);
    }


    public void clickHub10(View view) {
        startActivity(new Intent(DetailWheelChairActivity.this, RequestInFrom.class));
    }

    public void clickHub11(View view) {
        startActivity(new Intent(DetailWheelChairActivity.this, money.class));
    }

    public void clickHub12(View view) {
        startActivity(new Intent(DetailWheelChairActivity.this, Vdo_Activity.class));
    }
// Main Class
}
