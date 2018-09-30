package yasamani.com.myapplication;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    @GET(".")
    Observable<BaseResponse> call(@Query("t") String title);
}
