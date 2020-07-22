package com.rujirakongsomran.windyview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.ahmadnemati.wind.WindView;
import com.github.ahmadnemati.wind.enums.TrendType;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnStart = (Button) findViewById(R.id.btnStart);
        final WindView windView = (WindView) findViewById(R.id.windView);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view == btnStart) {
                    windView.setPressure(200.0f);
                    windView.setPressureUnit(" in Hg");
                    windView.setWindSpeed(100.0f);
                    windView.setWindSpeedUnit(" kn/h");
                    windView.setTrendType(TrendType.UP);

                    windView.start();

                }
            }
        });
    }
}