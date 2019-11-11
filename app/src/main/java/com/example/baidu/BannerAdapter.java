package com.example.baidu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.bumptech.glide.Glide;
import com.example.baidu.api.HomeBean;

import java.util.ArrayList;
import java.util.List;

public class BannerAdapter extends PagerAdapter {
    List<HomeBean.BannerBeanBean> bannerBean;
    private Context context;

    public BannerAdapter(List<HomeBean.BannerBeanBean> bannerBean, Context context) {
        this.bannerBean = bannerBean;
        this.context = context;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        final View view = LayoutInflater.from(context).inflate(R.layout.iv_banner, null);
        final ImageView iv = view.findViewById(R.id.iv_banner);
        Glide.with(context).load(bannerBean.get(position).getBannerIma_url()).into(iv);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

    @Override
    public int getCount() {
        return bannerBean.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }
}
