package com.unifreelancer.masso.timerapplication

import android.os.Bundle
import android.support.v7.preference.PreferenceFragmentCompat

class SettingActivityFragment : PreferenceFragmentCompat(){
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?){
        addPreferencesFromResource(R.xml.preferences)
    }
}