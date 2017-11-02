package nim.shs1330.netease.com.plugintwp;

import android.app.Application;
import android.content.Context;
import android.util.Log;

/**
 * Created by shs1330 on 2017/10/24.
 */

public class PluginTwo extends Application {
    private static final String TAG = "PluginTwo";
    public static Context HOST_BASE_CONTEXT = null;
    public static Context MY_CONTEXT = null;

    public void setHostContext(Context context) {
        HOST_BASE_CONTEXT = context;
        Log.d(TAG, "setHostContext: " + context.getApplicationInfo().packageName);
        Log.d(TAG, "setHostContext: host 的Context已经注入到了plugin");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate: " + "PluginTwo Application has created");
        MY_CONTEXT = getApplicationContext();
    }
}
