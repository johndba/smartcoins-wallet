package de.bitshares_munich.smartcoinswallet;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Syed Muhammad Muzzammil on 5/26/16.
 */
public class Share_Contact extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.share_account);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.sharetofriend)
    public void ShareWithFriend(){
        try {
            Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
            sharingIntent.putExtra(Intent.EXTRA_TEXT, getString(R.string.share_text));
            sharingIntent.putExtra(Intent.EXTRA_SUBJECT,"Awesome Smartcoins Wallet");
            sharingIntent.setType("text/plain");
            startActivity(Intent.createChooser(sharingIntent, "Hello Sir"));
        } catch (Exception e) {
        }
    }

}
