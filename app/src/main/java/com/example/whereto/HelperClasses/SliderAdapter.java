package com.example.whereto.HelperClasses;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;

import com.example.whereto.R;


public class SliderAdapter extends PagerAdapter{

    Context context;
    LayoutInflater layoutInflater;


    public SliderAdapter(Context context) {
        this.context = context;
    }

    int images[] = {

            R.drawable.touring1,
            R.drawable.bus,
            R.drawable.airport,
            R.drawable.touring,
            R.drawable.hotel
    };

    int headings[] = {
            R.string.destination_slide_title,
            R.string.touristSpot_slide_title,
            R.string.travel_slide_title,
            R.string.easy_slide_title,
            R.string.hotel_slide_title
    };

    int descriptions[] = {
            R.string.destination_slide_desc,
            R.string.touristSpot_slide_desc,
            R.string.travel_slide_desc,
            R.string.easy_slide_desc,
            R.string.hotel_slide_desc
    };

    @Override
    public int getCount() {
        return headings.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (ConstraintLayout) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slides_layout,container, false);

        //Hooks
        ImageView imageView = view.findViewById(R.id.slider_image);
        TextView heading = view.findViewById(R.id.slider_heading);
        TextView desc = view.findViewById(R.id.slider_description);

        imageView.setImageResource(images[position]);
        heading.setText(headings[position]);
        desc.setText(descriptions[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ConstraintLayout)object);
    }

}
