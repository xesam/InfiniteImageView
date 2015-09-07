package dev.xesam.android.widgets.demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import dev.xesam.android.widgets.InfiniteImageView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final InfiniteImageView ifi = (InfiniteImageView) findViewById(R.id.ifi);

        findViewById(R.id.start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ifi.start();
            }
        });
        findViewById(R.id.stop).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ifi.stop();
            }
        });
        findViewById(R.id.restart).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ifi.restart();
            }
        });
        findViewById(R.id.change).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ifi.setDrawable(new AzDrawable());
            }
        });
    }
}
