package com.szhr.myphone;

import android.os.Bundle;

import com.szhr.myphone.base.BaseListActivity;

public class MultiCallOptionsActivity extends BaseListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.select);
        String[] options = {
                getString(R.string.end_one_call),
                getString(R.string.end_all_call),
                getString(R.string.establish_multi_call),
                getString(R.string.switch_call),
                getString(R.string.sms),
                getString(R.string.hands_free_on)
        };
        setListData(options);
    }
}
