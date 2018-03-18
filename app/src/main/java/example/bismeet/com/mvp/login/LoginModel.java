package example.bismeet.com.mvp.login;

/**
 * Created by bismeet on 18/3/18.
 */

public interface LoginModel {
    interface OnLoginFinishedListener{
        void onUsernameError();
        void onPasswordError();
        void onSuccess();
    }
    void login(String username,String password,OnLoginFinishedListener loginFinishedListener);
}
