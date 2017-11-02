package nim.shs1330.netease.com.plugintwp;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class TargetService extends Service {
    public TargetService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
