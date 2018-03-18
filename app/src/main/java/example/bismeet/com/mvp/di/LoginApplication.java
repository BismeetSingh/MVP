package example.bismeet.com.mvp.di;

import android.app.Application;

import dagger.android.support.DaggerApplication;
import example.bismeet.com.mvp.BuildConfig;
import timber.log.Timber;

/**
 * Created by bismeet on 18/3/18.
 */

public class LoginApplication extends Application {
    private static AppComponent appComponent;
    public static AppComponent getAppComponent(){
        return appComponent;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        if(BuildConfig.DEBUG){
            Timber.plant(new Timber.DebugTree());
        }
        appComponent=buildAppComponent();
    }

    private AppComponent buildAppComponent() {
        return DaggerAppComponent.builder().appmod(this).build();


    }
}
