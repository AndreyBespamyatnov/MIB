package receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BatteryManager;
import android.widget.Toast;
import helpers.BatteryStatus;

public class BatteryStatusReceiverOnDisconnect extends BroadcastReceiver {
    private BatteryStatus batteryStatus = new BatteryStatus();
    private int scale = -1;
    private int level = -1;
    private int voltage = -1;
    private int temp = -1;

    @Override
    public void onReceive(Context context, Intent intent) {
        level = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, -1);
        scale = intent.getIntExtra(BatteryManager.EXTRA_SCALE, -1);
        temp = intent.getIntExtra(BatteryManager.EXTRA_TEMPERATURE, -1);
        voltage = intent.getIntExtra(BatteryManager.EXTRA_VOLTAGE, -1);

        //int level = batteryStatus.GetBatteryLevel(intent);
        String text = "Battery not charging!!!!, now value = " + Integer.toString(level) + "!!!!";

        Toast.makeText(context, text, Toast.LENGTH_LONG).show();
    }
}

