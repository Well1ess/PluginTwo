package nim.shs1330.netease.com.plugintwp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by shs1330 on 2017/10/31.
 */

public class PluginBroadCast extends BroadcastReceiver {
    private static final String TAG = "PluginBroadCast";
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "onReceive: " + context.getApplicationInfo().packageName);
    }
}
