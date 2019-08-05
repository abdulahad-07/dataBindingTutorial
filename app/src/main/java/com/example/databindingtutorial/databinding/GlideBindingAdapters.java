package com.example.databindingtutorial.databinding;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.databindingtutorial.R;

public class GlideBindingAdapters {
    
    @BindingAdapter("imageUrl")
    public static void setImageResource(ImageView view, int imageUri) {
    
        Context context = view.getContext();
        RequestOptions options = new RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background);
    
        Glide.with(context)
                .setDefaultRequestOptions(options)
                .load(imageUri)
                .into(view);
    }
    
    @BindingAdapter("imageUrl")
    public static void setImageResource(ImageView view, String imageUri) {
        
        Context context = view.getContext();
        RequestOptions options = new RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background);
        
        Glide.with(context)
                .setDefaultRequestOptions(options)
                .load(imageUri)
                .into(view);
    }
}
