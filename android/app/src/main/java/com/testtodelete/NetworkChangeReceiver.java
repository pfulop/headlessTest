
public class NetworkChangeReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(final Context context, final Intent intent) {

        if(!isAppOnForeground((context))){
            if(isInternet(context))
            {
                Intent serviceIntent = new Intent(context, MyTaskService.class);
                context.startService(serviceIntent);
            }
            HeadlessJsTaskService.acquireWakeLockNow(context);
        }
    }

}
