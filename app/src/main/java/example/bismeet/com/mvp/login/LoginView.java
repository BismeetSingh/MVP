package example.bismeet.com.mvp.login;

/**
 * Created by bismeet on 18/3/18.
 */

public interface LoginView {
    void showProgress();
    void hideProgress();
    void setUsernameError();
    void setPasswordError();
    void showToast(String text);


}
