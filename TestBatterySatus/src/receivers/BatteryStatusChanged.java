package receivers;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import helpers.BatteryStatus;

public class BatteryStatusChanged extends BroadcastReceiver {
    private final BatteryStatus batteryStatus = new BatteryStatus();

    @Override
    public void onReceive(Context context, Intent intent) {
        int level = batteryStatus.GetBatteryLevel(intent);
        String text = "Battery status changing, now value = " + Integer.toString(level) + "!!!!";

        Toast.makeText(context, text, Toast.LENGTH_LONG).show();
    }
}