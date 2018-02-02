package au.com.smedia.baseproject.url;


/**
 * Created by puzhao on 2/2/18.
 */

public class SampleUrlFactory implements UrlFactory {

    @Override
    public BaseUrl getBaseUrl() {
        return new SampleUrl();
    }

}
