package example.bismeet.com.mvp.login;

/**
 * Created by bismeet on 18/3/18.
 */

public interface LoginPresenter {
    void onDestroy();
    void validateCredentials(String username,String password);
    void onAccept(LoginActivity loginActivity);

}
