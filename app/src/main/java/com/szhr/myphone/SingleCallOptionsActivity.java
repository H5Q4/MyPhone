package com.szhr.myphone;

import android.os.Bundle;

import com.szhr.myphone.base.BaseListActivity;

public class SingleCallOptionsActivity extends BaseListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setTitle(R.string.select);

        String[] options = {
                getString(R.string.stop_calling),
                getString(R.string.hold),
                getString(R.string.sms),
                getString(R.string.hands_free_on)
        };

        setListData(options);
    }
}
