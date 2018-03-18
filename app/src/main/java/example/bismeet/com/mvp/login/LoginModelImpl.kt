package example.bismeet.com.mvp.login

import android.os.Handler
import android.text.TextUtils

/**
 * Created by bismeet on 18/3/18.
 */

class LoginModelImpl : LoginModel {
    override fun login(username: String, password: String, loginFinishedListener: LoginModel.OnLoginFinishedListener) {
        Handler().postDelayed(Runnable {
            if (TextUtils.isEmpty(username)) {
                loginFinishedListener.onUsernameError()
                return@Runnable
            }
            if (TextUtils.isEmpty(password)) {
                loginFinishedListener.onPasswordError()
                return@Runnable
            }
            loginFinishedListener.onSuccess()
        }, 2000)
    }
}
