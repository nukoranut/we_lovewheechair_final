package appewtc.masterung.welovewheelchair;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import org.json.JSONArray;
import org.json.JSONObject;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private static  double centerLatAdoule = 14.850893;
    private static  double centerLngAdoule = 101.217796;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    } // main หลัก
    //Create Inner class
    public class ConnectedJSON extends AsyncTask<Void, Void, String> {

        @Override
        protected String doInBackground(Void... voids) {

            try {

                OkHttpClient okHttpClient = new OkHttpClient();
                Request.Builder builder = new Request.Builder();
                Request request = builder.url("http://swiftcodingthai.com/nuk/php_get_shop.php").build();
                Response response = okHttpClient.newCall(request).execute();
                return response.body().string();

            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }

        }   // doInBack

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            Log.d("2May", "JSON ==> " + s);

            try {

                JSONArray jsonArray = new JSONArray(s);

                String[] ShopNameStrings = new String[jsonArray.length()];
                String[] AddressStrings = new String[jsonArray.length()];
                String[] PhoneStrings = new String[jsonArray.length()];
                String[] IconStrings = new String[jsonArray.length()];
                String[] LatStrings = new String[jsonArray.length()];
                String[] LngStrings = new String[jsonArray.length()];
                String[] CategoryStrings = new String[jsonArray.length()];
                int[] iconInts = new int[jsonArray.length()];



                for (int i = 0; i < jsonArray.length(); i++) {

                    JSONObject jsonObject = jsonArray.getJSONObject(i);
                    ShopNameStrings[i] = jsonObject.getString("ShopName");
                    AddressStrings[i] = jsonObject.getString("Address");
                    PhoneStrings[i] = jsonObject.getString("Phone");
                    IconStrings[i] = jsonObject.getString("Icon");
                    LatStrings[i] = jsonObject.getString("Lat");
                    LngStrings[i] = jsonObject.getString("Lng");
                    CategoryStrings[i] = jsonObject.getString("Category");

                    //find Icon Marker
                    iconInts[i] = findIconForMarker(IconStrings[i]);



                    // cretea all maker
                    double lat = Double.parseDouble(LatStrings[i]);
                    double lag = Double.parseDouble(LngStrings[i]);
                    LatLng latLng = new LatLng(lat,lag);
                    mMap.addMarker(new MarkerOptions()
                            .position(latLng)
                    .icon(BitmapDescriptorFactory.fromResource(iconInts[i])));


                }   // for
                mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
                    @Override
                    public boolean onMarkerClick(Marker marker) {

                        Intent intent = new Intent(MapsActivity.this, Detailshop.class);
                        startActivity(intent);
                        return true;
                    }
                });






            } catch (Exception e) {
                e.printStackTrace();
            }

        }   // onPost

    }   // ConnectedJSON Class ใส่รูป marker

    private int findIconForMarker(String iconString) {

        int inIcon = R.drawable.first_hand;
        if (iconString.equals("มือหนึ่ง")){
            inIcon =  R.drawable.first_hand;

        }else {
            inIcon = R.drawable.second_hand;
        }

        return inIcon;
    }

    public void clickListShop (View view){
        startActivity(new Intent(MapsActivity.this,ChooseSection.class));
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        //set up Thai
        LatLng latLng = new LatLng(centerLatAdoule,centerLngAdoule);
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng,6));

        ConnectedJSON connectedJSON = new ConnectedJSON();
        connectedJSON.execute();
    } // onMap


} // คลาสซ้อนคลาส

