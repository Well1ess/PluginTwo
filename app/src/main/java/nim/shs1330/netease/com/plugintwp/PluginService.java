package nim.shs1330.netease.com.plugintwp;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class PluginService extends Service {
    private static final String TAG = "PluginService";
    public PluginService() {
        Log.d(TAG, "PluginService: " + "zzz");
    }

    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
        Log.d(TAG, "onStart: " + "start");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "PluginService: " + "create");

    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
