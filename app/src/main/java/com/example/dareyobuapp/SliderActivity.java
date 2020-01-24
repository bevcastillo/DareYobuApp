package com.example.dareyobuapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.dareyobuapp.adapters.SliderAdapter;
import com.example.dareyobuapp.user_ui.UserConnectActivity;

public class SliderActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewPager viewPagerSlider;
    private LinearLayout layoutDots;
    private Button btnNext;
    private TextView[] txtDots;
    private SliderAdapter sliderAdapter;
    private int currPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider);

        viewPagerSlider = (ViewPager) findViewById(R.id.main_viewpager);
        layoutDots = (LinearLayout) findViewById(R.id.dots_layout);
        btnNext = (Button) findViewById(R.id.slider_btn);

        btnNext.setOnClickListener(this);

        sliderAdapter = new SliderAdapter(this);
        viewPagerSlider.setAdapter(sliderAdapter);

        addDotsIndicator(0);
        viewPagerSlider.addOnPageChangeListener(viewListener);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id){
            case R.id.slider_btn:
                String btnText = btnNext.getText().toString();

                if (btnText.equals("Next")) {

                }else {
                    Intent intent = new Intent(SliderActivity.this, UserConnectActivity.class);
                    startActivity(intent);
                }
                break;
        }
    }

    public void addDotsIndicator(int position) {
        txtDots = new TextView[5];
        layoutDots.removeAllViews();

        for (int i = 0; i < txtDots.length; i++){
            txtDots[i] = new TextView(this);
            txtDots[i].setText(Html.fromHtml("&#8226;"));
            txtDots[i].setTextSize(35);
            txtDots[i].setTextColor(getResources().getColor(R.color.colorPrimaryLight));

            layoutDots.addView(txtDots[i]);
        }
        if (txtDots.length > 0){
            txtDots[position].setTextColor(getResources().getColor(R.color.colorPrimary));
        }
    }

    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            addDotsIndicator(position);
            currPage = position;

            if (position == 0) {
                btnNext.setText("Next");
            }else if (position == 1){
                btnNext.setText("Next");
            }else if (position == 2) {
                btnNext.setText("Next");
            }else if (position == 3) {
                btnNext.setText("Next");
            }else if (position == 4) {
                btnNext.setText("Let's get started");
            }
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };
}
