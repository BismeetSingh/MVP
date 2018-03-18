package example.bismeet.com.mvp.di;

import android.app.Application;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import example.bismeet.com.mvp.login.LoginActivity;

/**
 * Created by bismeet on 18/3/18.
 */
@Singleton
@Component(modules = {AppModule.class, LoginModule.class})
public interface AppComponent {
    void inject(LoginActivity loginActivity);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder appmod(Application application);

         AppComponent build();

    }
}
