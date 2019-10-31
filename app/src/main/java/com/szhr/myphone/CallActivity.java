package com.szhr.myphone;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.szhr.myphone.base.BaseActivity;

public class CallActivity extends BaseActivity {

    private ImageView phoneAnimIv;
    private TextView numberTv;
    private TextView statusTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

        findViews();
    }

    private void findViews() {
        phoneAnimIv = (ImageView) findViewById(R.id.phoneAnimIv);
        numberTv = (TextView)findViewById(R.id.numberTv);
        statusTv = (TextView)findViewById(R.id.statusTv);
    }
}
