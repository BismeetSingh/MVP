package example.bismeet.com.mvp.di;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;
import example.bismeet.com.mvp.login.LoginActivity;

/**
 * Created by bismeet on 18/3/18.
 */
@Module
abstract class AppModule {
    @ContributesAndroidInjector(modules = {LoginModule.class})
     abstract LoginActivity bindloginActivity();


        @Provides
        @Singleton
        static Context getContext(Application application){
            return application.getApplicationContext();
        }
    }

