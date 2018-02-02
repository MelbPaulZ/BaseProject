package au.com.smedia.baseproject.restfulapi;

import au.com.smedia.baseproject.restfulresponse.HttpResult;
import au.com.smedia.baseproject.restfulresponse.SmediaResponseTitle;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by puzhao on 2/2/18.
 */

public interface MagazineApi {
    @GET("retrieve_latest.php")
    public Observable<HttpResult<SmediaResponseTitle>> retrieveLatest(@Query("deviceid") String deviceId, @Query("email") String email);


}
