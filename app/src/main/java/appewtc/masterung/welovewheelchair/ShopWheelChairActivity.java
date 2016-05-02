package appewtc.masterung.welovewheelchair;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import org.json.JSONArray;
import org.json.JSONObject;

public class ShopWheelChairActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_wheel_chair);

        ConnectedJSON connectedJSON = new ConnectedJSON();
        connectedJSON.execute();

    }   // Main Method

    //Create Inner Class
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

            Log.d("29April", "JSON ==> " + s);

            try {

                JSONArray jsonArray = new JSONArray(s);

                String[] ShopNameStrings = new String[jsonArray.length()];
                String[] AddressStrings = new String[jsonArray.length()];
                String[] PhoneStrings = new String[jsonArray.length()];
                String[] IconStrings = new String[jsonArray.length()];
                String[] LatStrings = new String[jsonArray.length()];
                String[] LngStrings = new String[jsonArray.length()];
                String[] CategoryStrings = new String[jsonArray.length()];

                for (int i = 0; i < jsonArray.length(); i++) {

                    JSONObject jsonObject = jsonArray.getJSONObject(i);
                    ShopNameStrings[i] = jsonObject.getString("ShopName");
                    AddressStrings[i] = jsonObject.getString("Address");
                    PhoneStrings[i] = jsonObject.getString("Phone");
                    IconStrings[i] = jsonObject.getString("Icon");
                    LatStrings[i] = jsonObject.getString("Lat");
                    LngStrings[i] = jsonObject.getString("Lng");
                    CategoryStrings[i] = jsonObject.getString("Category");

                }   // for

                ListView listView = (ListView) findViewById(R.id.listView);
                ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(ShopWheelChairActivity.this,
                        android.R.layout.simple_list_item_1, ShopNameStrings);
                listView.setAdapter(stringArrayAdapter);

            } catch (Exception e) {
                e.printStackTrace();
            }

        }   // onPost

    }   // ConnectedJSON Class

    public void clickBackShopWheelChair(View view) {
        finish();
    }

}   // Main Class
