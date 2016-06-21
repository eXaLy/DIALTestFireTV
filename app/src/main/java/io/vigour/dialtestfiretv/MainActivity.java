package io.vigour.dialtestfiretv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private static final String DIAL_PARAM = "com.amazon.extra.DIAL_PARAM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView receivedTextView = (TextView) findViewById(R.id.received_params);
        String bundle = getIntent().getStringExtra(DIAL_PARAM);
        if (bundle != null) {
            Log.i(TAG, "Params received");
            receivedTextView.setText(bundle);
        } else {
            Log.i(TAG, "No params received");
        }
    }

}
