package com.android.t2s;

import android.app.ProgressDialog;
import android.arch.persistence.room.Room;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.t2s.database.DataMDB;
import com.android.t2s.model.Addon;
import com.android.t2s.model.DataM;
import com.android.t2s.model.Subcat;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity {
    Gson gson;
    Addon[] addons;
    DataM[] dataM;
    DataMDB dataMDB;
    ProgressDialog mProgressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dataMDB = DataMDB.getAppDatabase(this);
        showProgressDialog(true);
        new Thread(new Runnable() {
            @Override
            public void run() {
                initializeData();
                initializeAddonData();
            }
        }).start();


    }

    private void initializeAddonData() {
        gson = new Gson();
        String addonStr = readFromAssetFileMenu("Addonlist.json");
        addons = gson.fromJson(addonStr,Addon[].class);
        addAddonM();
    }

    private String readFromAssetFileMenu(String fileName){


        try {
            InputStream is = getAssets().open(fileName);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            String json = new String(buffer, "UTF-8");
            return json;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  null;
    }



    private void initializeData() {

        gson = new Gson();
        String menuStr = readFromAssetFileMenu("Menu.json");
        dataM = gson.fromJson(menuStr,DataM[].class);

        addDataM();

    }

    public void showProgressDialog(boolean isShow) {
        try {
            if (mProgressDialog == null && isShow) {
                mProgressDialog = new ProgressDialog(MainActivity.this);
                mProgressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                mProgressDialog.setMessage("Processing...");
                mProgressDialog.setCancelable(false);
                mProgressDialog.setCanceledOnTouchOutside(false);
                mProgressDialog.show();
            } else {
                if (mProgressDialog != null && mProgressDialog.isShowing()) {
                    mProgressDialog.dismiss();
                    mProgressDialog = null;
                }
            }
        } catch (Exception e) {
          e.printStackTrace();

        }

    }
        private void addAddonM() {
        if(addons != null){
            for(int i = 0; i < addons.length;i++){
                dataMDB.addonDao().insert(addons[i]);
            }
        }
            showProgressDialog(false);
    }

    private void addDataM() {
        for(int i = 0 ; i<dataM.length;i++) {
            dataMDB.dataMDao().insert(dataM[i]);
            if(dataM[i].getSubcat().length>0){
                for(int j = 0;j<dataM[i].getSubcat().length;j++){
                    dataMDB.subcatDao().insertSubcat(dataM[i].getSubcat()[j]);
                    if(dataM[i].getSubcat()[j].getItem().length > 0){
                        for(int k = 0 ; k < dataM[i].getSubcat()[j].getItem().length ;k++){
                            dataMDB.itemDao().insertItem(dataM[i].getSubcat()[j].getItem()[k]);
                        }
                    }
                }
            }
        }
    }


}
