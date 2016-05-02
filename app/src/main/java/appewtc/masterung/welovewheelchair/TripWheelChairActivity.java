package appewtc.masterung.welovewheelchair;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TripWheelChairActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trip_wheel_chair);
    }
    public void clickHub5(View view) {
        startActivity(new Intent(TripWheelChairActivity.this, trip_aplane.class));
    }

    public void clickHub6(View view) {
        startActivity(new Intent(TripWheelChairActivity.this, trip_taxi.class));

    }

    public void clickHub7(View view) {
        startActivity(new Intent(TripWheelChairActivity.this, trip_bts.class));
    }

    public void clickHub8(View view) {
        startActivity(new Intent(TripWheelChairActivity.this, trip_mrt.class));
    }
    public void clickHub9(View view) {
        startActivity(new Intent(TripWheelChairActivity.this, trip_vip.class));
    }
}
