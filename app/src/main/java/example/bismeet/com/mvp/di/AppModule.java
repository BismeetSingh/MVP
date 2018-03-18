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
    //a way to create subcomponents
    @ContributesAndroidInjector(modules = {LoginModule.class})
     abstract LoginActivity bindloginActivity();

//static so dagger2 doesnt have to create an instance and is more efficient.
        @Provides
        @Singleton
        static Context getContext(Application application){
            return application.getApplicationContext();
        }
    }

