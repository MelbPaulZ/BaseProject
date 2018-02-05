package au.com.smedia.baseproject.manager;

import android.content.Context;

import au.com.smedia.baseproject.bean.MyObjectBox;
import au.com.smedia.baseproject.bean.SmediaIssue;
import au.com.smedia.baseproject.bean.SmediaIssue_;
import io.objectbox.Box;
import io.objectbox.BoxStore;
import io.objectbox.Property;

/**
 * Created by puzhao on 5/2/18.
 */

public class DBManager {
    private static DBManager instance = null;
    private Context mContext;
    private BoxStore boxStore ;
    private Box<SmediaIssue> smediaIssueBox;

    private DBManager(Context context){
        this.mContext = context;
        boxStore = MyObjectBox.builder().androidContext(context).build();
        smediaIssueBox = boxStore.boxFor(SmediaIssue.class);;
    }

    public static DBManager getInstance(Context context){
        if (instance == null){
            instance = new DBManager(context);
        }
        return instance;
    }

    public void saveOrReplaceMagazine(SmediaIssue smediaIssue){
        smediaIssueBox.put(smediaIssue);
    }

    public SmediaIssue getMagazine(String id){
        return smediaIssueBox.query().equal(SmediaIssue_.id, id).build().findFirst();
    }



}
