package com.example.dareyobuapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.dareyobuapp.R;

/*
    Created by Beverly May Castillo on 23/01/2020
 */

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context) {
        this.context = context;
    }

    //to inflate data
    public int[] slide_images = {
            R.drawable.ic_drink3,
            R.drawable.ic_drink4,
            R.drawable.ic_magic1,
            R.drawable.ic_sing1,
            R.drawable.ic_sing5
    };

    public String[] slide_header = {
            "Meet with people",
            "Meet with people",
            "Meet with people",
            "Meet with people",
            "Meet with people"
    };

    public String[] slide_contents = {
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin non.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin non.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin non.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin non.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin non."
    };

    @Override
    public int getCount() {
        return slide_images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (RelativeLayout) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view =layoutInflater.inflate(R.layout.custom_slide, container, false);

        ImageView sliderImage = (ImageView) view.findViewById(R.id.iv_slider);
        TextView sliderHeader = (TextView) view.findViewById(R.id.tv_slider_title);
        TextView sliderContent = (TextView) view.findViewById(R.id.tv_slider_content);

        sliderImage.setImageResource(slide_images[position]);
        sliderHeader.setText(slide_header[position]);
        sliderContent.setText(slide_contents[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout)object);
    }
}
