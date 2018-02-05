package au.com.smedia.baseproject.ui.contract;

import android.support.annotation.NonNull;

import au.com.smedia.baseproject.base.BasePresenter;
import au.com.smedia.baseproject.base.BaseView;

/**
 * Created by puzhao on 2/2/18.
 */

public interface MainFragmentContract {
    interface View extends BaseView<Presenter>{
        void displayMagazineList();
        void updateMainIssueView(@NonNull String url, @NonNull String name, @NonNull String description);
    }

    interface Presenter extends BasePresenter<View>{
        void retriveLatestMagazines();
    }
}
