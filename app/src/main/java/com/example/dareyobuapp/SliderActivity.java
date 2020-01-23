package com.example.dareyobuapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.dareyobuapp.Adapters.SliderAdapter;

public class SliderActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewPager viewPagerSlider;
    private LinearLayout layoutDots;
    private Button btnNext;
    private TextView[] sliderDots;
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
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id){
            case R.id.slider_btn:
                break;
        }
    }

    public void addDotsIndicator(int position) {
        sliderDots = new TextView[5];

        for (int i = 0; i < sliderDots.length; i++) {
            sliderDots[i] = new TextView(this);
            sliderDots[i].setText(Html.fromHtml("&#8226;"));
            sliderDots[i].setTextSize(35);
            sliderDots[i].setTextColor(getResources().getColor(R.color.colorPrimaryLight));

            layoutDots.addView(sliderDots[i]);
        }

        if (sliderDots.length > 0) {
            sliderDots[position].setTextColor(getResources().getColor(R.color.colorPrimary));
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
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };
}
