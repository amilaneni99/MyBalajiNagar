package com.abhinav.mybalajinagar;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import static android.text.Layout.JUSTIFICATION_MODE_INTER_WORD;

public class GalleryAdapter extends PagerAdapter {

    private ArrayList<Image> images;
    private Context context;

    public GalleryAdapter(ArrayList<Image> images,Context context) {
        this.images = images;
        this.context = context;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = LayoutInflater.from(context).inflate(R.layout.image_slider, null);
        ImageView imageView = view.findViewById(R.id.image);
        TextView imageTitle = view.findViewById(R.id.titleText);
        TextView imageDesc = view.findViewById(R.id.desc);

        System.out.println("Index "+position+" URL: "+images.get(position).getUrl()+"\n TITLE:"+ images.get(position).getTitle());



        Picasso.with(context).load(images.get(position).getUrl()).into(imageView);
        imageTitle.setText(images.get(position).getTitle());
        imageDesc.setText(images.get(position).getDesc());
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            imageDesc.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);
        }
        container.addView(view);
        return view;
    }

    @Override
    public int getCount() {
        return images.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return object == view;
    }


}
