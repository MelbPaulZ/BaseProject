package au.com.smedia.baseproject.restfulresponse;

/**
 * Created by puzhao on 2/2/18.
 */

public class HttpResult<T> {
    private T[] titles;
    private String result;

    public T[] getTitles() {
        return titles;
    }

    public void setTitles(T[] titles) {
        this.titles = titles;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
