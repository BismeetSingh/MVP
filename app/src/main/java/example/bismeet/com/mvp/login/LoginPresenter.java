package example.bismeet.com.mvp.login;

/**
 * Created by bismeet on 18/3/18.
 */

public interface LoginPresenter {
    void onDestroy();
    void validateCredentials(String username,String password);
    //This method is used to bind the activity lifecycle to the presenter since we cant create a new instance of the view.
    void onAccept(LoginActivity loginActivity);

}
