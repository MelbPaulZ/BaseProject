package au.com.smedia.baseproject.base;

/**
 * Created by puzhao on 2/2/18.
 */

public interface BasePresenter<V> {
    void subscribe(V view);
    void unsubscribe();
}
