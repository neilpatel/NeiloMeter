/*
Neil Patel
GitHub: neilpatel
Personal Project
*/


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AppUpdatedReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(final Context context, final Intent intent) {
		if (BuildConfig.DEBUG)
			Logger.log("app updated");
		context.startService(new Intent(context, SensorListener.class));		
	}

}
