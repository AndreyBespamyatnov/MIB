package helpers;

import android.app.Activity;
import android.content.SharedPreferences;

public class settings {
    private Activity current;

    public boolean music = true;
    public boolean sfx = true;
    public int games_played = 0;
    public int high_score = 0;

    public settings(Activity currentActivity) {
        current = currentActivity;
        this.loadSettings();
    }

    public void loadSettings() {
        SharedPreferences settings = current.getPreferences(Activity.MODE_PRIVATE);

        this.music = settings.getBoolean("music", this.music);
        this.sfx = settings.getBoolean("sfx", this.sfx);
        this.games_played = settings.getInt("games_played", this.games_played);
        this.high_score = settings.getInt("high_score", this.high_score);
    }

    public void saveSettings() {
        SharedPreferences settings = current.getPreferences(Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();

        editor.putBoolean("music", this.music);
        editor.putBoolean("sfx", this.sfx);
        editor.putInt("games_played", this.games_played);
        editor.putInt("high_score", this.high_score);

        editor.commit();
    }
}