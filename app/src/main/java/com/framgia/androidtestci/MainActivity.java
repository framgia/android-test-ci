package com.framgia.androidtestci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // test
    }

  /*  private void TESTphatxem() {

    }

        private void ko_loi_a() {
            String ref = "refs/pull/1/merge";
            System.out.println("  ref  --> " + ref);
            ref = ref.replace("refs/pull/","").replace("/merge","");
        }*/
}
