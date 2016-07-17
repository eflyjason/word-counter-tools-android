package com.arefly.wordcounter;

import android.os.Bundle;
import android.preference.PreferenceFragment;

public class AboutFragment extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Load the preferences from an XML resource
        addPreferencesFromResource(R.xml.pref_about);
    }
}