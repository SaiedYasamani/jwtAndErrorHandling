package yasamani.com.myapplication;


import android.content.Context;
import android.widget.Toast;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.IOException;
import java.net.SocketTimeoutException;
import io.reactivex.observers.DisposableObserver;
import okhttp3.ResponseBody;

public class CallBackWrapper<T extends BaseResponse> extends DisposableObserver<T> {

    Context context;

    public CallBackWrapper(Context context) {
        this.context = context;
    }

    @Override
    public void onNext(T t) {

    }

    @Override
    public void onError(Throwable e) {
        String ErrorMessage;
        if(e instanceof com.jakewharton.retrofit2.adapter.rxjava2.HttpException){
            ErrorMessage = getError(((com.jakewharton.retrofit2.adapter.rxjava2.HttpException) e).response().errorBody());
        }else if(e instanceof SocketTimeoutException){
            ErrorMessage = "TimeOut Exception";
        }else if(e instanceof IOException){
            ErrorMessage = "Network Exception";
        }else {
            ErrorMessage = e.getMessage();
        }

        Toast.makeText(context, "error: " + ErrorMessage, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onComplete() {

    }

    private String getError(ResponseBody responseBody) {
        try {
            JSONObject jsonObject = new JSONObject(responseBody.toString());
            return jsonObject.getString("message");
        } catch (JSONException e) {
            return e.getMessage();
        }
    }
}
