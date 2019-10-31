package com.szhr.myphone;

import android.os.Bundle;

import com.szhr.myphone.base.BaseListActivity;

public class CallTypesActivity extends BaseListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setTitle(getString(R.string.call_type));

        String[] options = {
                getString(R.string.single_call),
                getString(R.string.group_call),
                getString(R.string.broadcast)
        };

        setListData(options);
    }
}
