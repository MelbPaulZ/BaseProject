package au.com.smedia.baseproject.ui.contract;

import au.com.smedia.baseproject.base.BasePresenter;
import au.com.smedia.baseproject.base.BaseView;

/**
 * Created by puzhao on 2/2/18.
 */

public interface MainFragmentContract {
    interface View extends BaseView<Presenter>{
        void displayMagazineList();
    }

    interface Presenter extends BasePresenter<View>{
        void retriveLatestMagazines();
    }
}
