package nim.shs1330.netease.com.plugintwp;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class MainFragment extends Fragment {
    private static final String TAG = "MainFragment";
    private Fragment f;
    PluginBroadCast pluginBroadCast;
    public void setProxyFragment(Fragment f) {
        Log.d(TAG, "setProxyFragment: " + "替身fragment已经激活");
        this.f = f;
    }

    TextView textView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pluginBroadCast = new PluginBroadCast(){
            @Override
            public void onReceive(Context context, Intent intent) {
                super.onReceive(context, intent);
                textView.setText(intent.getStringExtra("text"));
            }
        };
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView: "  + Thread.currentThread().getName());
        LayoutInflater layoutInflater = LayoutInflater.from(PluginTwo.MY_CONTEXT);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("plugtwo");
        PluginTwo.HOST_BASE_CONTEXT.registerReceiver(pluginBroadCast, intentFilter);
        View view = layoutInflater.inflate(R.layout.fragment_main, null);
        textView = (TextView) view.findViewById(R.id.text);
        return view;
    }

    @Override
    public void onDestroy() {
        PluginTwo.HOST_BASE_CONTEXT.unregisterReceiver(pluginBroadCast);
        super.onDestroy();
    }
}
