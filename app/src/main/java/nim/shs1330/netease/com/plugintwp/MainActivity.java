package nim.shs1330.netease.com.plugintwp;

import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    public static Context HOSTCONTEXT;

    public void setHostContext(Context context) {
        Log.d(TAG, "setHostContext: " + context.getApplicationInfo().packageName);
        HOSTCONTEXT = context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt = (Button) findViewById(R.id.bt);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HOSTCONTEXT == null ? MainActivity.this : HOSTCONTEXT, "zzz", Toast.LENGTH_SHORT).show();
//                Class toastClass = Toast.class;
//                try {
//                    Method getServiceM = toastClass.getDeclaredMethod("getService");
//                    getServiceM.setAccessible(true);
//                    //INotificationManager
//                    Object service = getServiceM.invoke(null);
//
//                    Class contextClass = Context.class;
//                    Method getOpPackageNameM = contextClass.getDeclaredMethod("getOpPackageName");
//                    getOpPackageNameM.setAccessible(true);
//                    //pkg
//                    String pkg = (String) getOpPackageNameM.invoke(HOSTCONTEXT);
//                    Log.d(TAG, "onClick: " + pkg);
//
//                    Field mTNF = toastClass.getDeclaredField("mTN");
//                    mTNF.setAccessible(true);
//                    Object tn = mTNF.get(toast);
//
//                    Field mNextViewFToast = toastClass.getDeclaredField("mNextView");
//                    mNextViewFToast.setAccessible(true);
//
//                    Field mNextViewF = tn.getClass().getDeclaredField("mNextView");
//                    mNextViewF.setAccessible(true);
//                    mNextViewF.set(tn, mNextViewFToast.get(toast));
//
//                    Method enqueueToastM = null;
//                    try {
//                        enqueueToastM = Class.forName("android.app.INotificationManager").
//                                getDeclaredMethod("enqueueToast",
//                                        String.class,
//                                        Class.forName("android.app.ITransientNotification"),
//                                        int.class);
//                    } catch (ClassNotFoundException e) {
//                        e.printStackTrace();
//                    }
//                    enqueueToastM.setAccessible(true);
//                    enqueueToastM.invoke(service, pkg, tn, 0);
//                } catch (NoSuchMethodException e) {
//                    e.printStackTrace();
//                } catch (InvocationTargetException e) {
//                    e.printStackTrace();
//                } catch (IllegalAccessException e) {
//                    e.printStackTrace();
//                } catch (NoSuchFieldException e) {
//                    e.printStackTrace();
//                }
                Log.d(TAG, "onClick: " + "zzz");
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.flyt_contrainer, new MainFragment());
                transaction.commit();
            }
        });
    }
}
