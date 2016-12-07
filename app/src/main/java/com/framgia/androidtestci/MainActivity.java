package com.framgia.androidtestci;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnCoupon;
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Load Views
        btnCoupon = (Button) findViewById(R.id.btn_coupon);

        // Load User
        user = User.loadUserViaAPI();

        // Ony Premium can get Coupon
        btnCoupon.setEnabled(user.isPremium());

        // Show Coupon
        btnCoupon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Dialog show coupon
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Your coupon is:")
                        .setMessage(user.getCoupon())
                        .setNegativeButton(android.R.string.ok,
                                new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        })
                        .create()
                        .show();

            }
        });

    }

            private int ABC () {
                return 1;
            }


}
