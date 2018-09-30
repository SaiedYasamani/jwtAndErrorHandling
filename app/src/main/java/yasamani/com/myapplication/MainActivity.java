package yasamani.com.myapplication;

import android.arch.lifecycle.MutableLiveData;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final MutableLiveData<String> ErrorMessage = new MutableLiveData<>();

        final String jwtString = "eyJhbGciOiJodHRwOi8vd3d3LnczLm9yZy8yMDAxLzA0L3htbGRzaWctbW9yZSNobWFjLXNoYTI1NiIsInR5cCI6IkpXVCJ9" +
                ".eyJodHRwOi8vc2NoZW1hcy54bWxzb2FwLm9yZy93cy8yMDA1LzA1L2lkZW50aXR5L2NsYWltcy9uYW1lIjoiMDkxMjY0NDY2ODkiLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiMSIsIklzQWN0aXZlIjoiRmFsc2UiLCJOZXdEZXZpY2UiOiJUcnVlIiwibmJmIjoxNTM4MzE0NDIwLCJleHAiOjE1MzgzMTQ3MjAsImlzcyI6Imh0dHA6Ly9sb2NhbGhvc3QvIiwiYXVkIjoiQW55In0" +
                ".sN2kd4BAxaBM3twwJDlmeDD7BtW3JPBy1Pt8PvuxDk0";

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                String[] split = jwtString.split("\\.");
//                byte[] bytes = Base64.decode(split[1],Base64.URL_SAFE);
//                try {
//                    String json = new String(bytes,"UTF-8");
//                    Log.d("json", "onClick: " + json);
//                    Gson gson = new Gson();
//                    jwtPayload payload = gson.fromJson(json, jwtPayload.class);
//                    payload.getIsActive();
//                    JSONObject jsonObject = new JSONObject(json);
//                    String isActive = jsonObject.getString("IsActive");
//                    Toast.makeText(MainActivity.this, "json: " + json + " isActive " + isActive, Toast.LENGTH_SHORT).show();
//                } catch (UnsupportedEncodingException e) {
//                    e.printStackTrace();
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }

                RetrofitConfig.getApiService().call("godfather")
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(new CallBackWrapper<BaseResponse>(MainActivity.this){
                            @Override
                            public void onNext(BaseResponse baseResponse) {
                                super.onNext(baseResponse);
                            }

                            @Override
                            public void onError(Throwable e) {
                                super.onError(e);
                            }

                            @Override
                            public void onComplete() {
                                super.onComplete();
                            }
                        });
            }
        });


    }
}
