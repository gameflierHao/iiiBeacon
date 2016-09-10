package org.apache.cordova.core;

import java.util.List;

import com.google.gson.Gson;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.util.Log;

import tw.org.iii.beaconcontentsdk.BeaconContent;
import tw.org.iii.beaconcontentsdk.BeaconContentService;
import tw.org.iii.beaconcontentsdk.json.get_beacon_list.AppBeacon;
import tw.org.iii.beaconcontentsdk.json.push_message.Coupons;
import tw.org.iii.beaconcontentsdk.json.push_message.Products;
import tw.org.iii.beaconcontentsdk.json.push_message.Push_message;
import tw.org.iii.beaconcontentsdk.json.push_message.Result_content;


public class iiiBeacon extends CordovaPlugin {
    private void getBeaconInfo(final CallbackContext callbackContext) {
        cordova.getThreadPool().execute(new Runnable() {
            public void run() {
				try{
					if(myMainActivity.beaconJson == null || myMainActivity.beaconJson.isEmpty()){
						myMainActivity.beaconJson = "";
					}					
					callbackContext.success(myMainActivity.beaconJson);
					myMainActivity.beaconJson = "";
				}
				catch (Exception e) {
					 callbackContext.error(ExceptionString.get(e));
				}
            }
        });
    }
}

