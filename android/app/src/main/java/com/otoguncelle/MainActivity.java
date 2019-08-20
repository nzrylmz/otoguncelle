package com.otoguncelle;

import com.facebook.react.ReactActivity;
import com.aerofs.reactnativeautoupdater.ReactNativeAutoUpdater;
import com.aerofs.reactnativeautoupdater.ReactNativeAutoUpdater.ReactNativeAutoUpdaterUpdateType;
import com.aerofs.reactnativeautoupdater.ReactNativeAutoUpdater.ReactNativeAutoUpdaterFrequency;
import com.aerofs.reactnativeautoupdater.ReactNativeAutoUpdaterActivity;

public class MainActivity extends ReactNativeAutoUpdaterActivity {

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "otoguncelle";
    }

    @Override
    protected String getUpdateMetadataUrl() {
    return "http://fiviscreen.com/guncelle/guncelle.json";
    }

    	/**
    	* Name of the metadata file shipped with the app.
    	* This metadata is used to compare the shipped JS code against the updates.
    	* */
    @Override
    protected String getMetadataAssetName() {
    return "metadata.android.json";
    }

    @Override
    protected String getHostnameForRelativeDownloadURLs() {
    return "http://fiviscreen.com";
    }

}
