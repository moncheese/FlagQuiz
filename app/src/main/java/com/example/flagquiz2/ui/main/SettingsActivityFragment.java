package com.example.flagquiz2.ui.main;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.preference.PreferenceFragment;

import com.example.flagquiz2.R;

public class SettingsActivityFragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addPreferencesFromResource(R.xml.preferences);
    }

}