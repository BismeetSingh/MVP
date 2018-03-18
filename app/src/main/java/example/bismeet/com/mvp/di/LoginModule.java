package example.bismeet.com.mvp.di;

import dagger.Module;
import dagger.Provides;
import example.bismeet.com.mvp.login.LoginModel;
import example.bismeet.com.mvp.login.LoginModelImpl;
import example.bismeet.com.mvp.login.LoginPresenter;
import example.bismeet.com.mvp.login.LoginPresenterImpl;

/**
 * Created by bismeet on 18/3/18.
 */
@Module
class LoginModule {


    @Provides
    static LoginPresenter getLoginPresenter(LoginModel loginModel) {
        return new LoginPresenterImpl(loginModel);

    }

    @Provides
    static LoginModel getLoginModel() {
        return new LoginModelImpl();
    }
}



