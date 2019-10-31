package com.szhr.myphone;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.widget.EditText;

import com.szhr.myphone.base.BaseActivity;

public class DialActivity extends BaseActivity implements TextWatcher {

    private EditText numberEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dial);

        hideTop();
        setRightTv(getString(R.string.delete));
        leftTv.setText(getString(R.string.save));

        numberEt = (EditText) findViewById(R.id.numberEt);
        numberEt.addTextChangedListener(this);
    }

    @Override
    protected void onClickBottomLeft() {
        String number = numberEt.getText().toString().trim();
        if (TextUtils.isEmpty(number)) {
            return;
        }
        Intent intent = new Intent("android.intent.action.hr.SAVE_CONTACT");
        intent.putExtra("number", number);
        startActivity(intent);
    }

    @Override
    protected void onClickDpadCenter() {
        makeCall();
    }

    private void makeCall() {
        String number = numberEt.getText().toString().trim();
        if (TextUtils.isEmpty(number)) {
            return;
        }
//            final Intent intent = CallUtil.getCallIntent(number);
//            startActivity(intent);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode) {
            case KeyEvent.KEYCODE_CALL:
                makeCall();
                break;
            default:
                break;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable editable) {
//        if (SpecialCharSequenceMgr.handleChars(this, editable.toString(), numberEt)) {
//            // A special sequence was entered, clear the digits
//            numberEt.getText().clear();
//        }
    }
}
