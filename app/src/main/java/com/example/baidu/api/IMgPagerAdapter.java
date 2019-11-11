package com.example.baidu.api;


import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

public class IMgPagerAdapter extends PagerAdapter {

    private List<ImageView> mList;

    public IMgPagerAdapter(List<ImageView> mList) {

        this.mList = mList;

    }

    //获取要滑动的控件的数量，
    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }
    //当要显示的图片进行缓存时，会调用这个方法进行显示图片的初始化
//我们将要显示的ImageView加入到ViewGroup中

    public Object instantiateItem(ViewGroup container, int position) {
        // TODO Auto-generated method stub
        container.addView(mList.get(position));

        return mList.get(position);

    }

    @Override
//PagerAdapter只缓存三张要显示的图片，如果滑动的图片超出了缓存的范围，就会调用这个方法，将图片销毁
    public void destroyItem(ViewGroup container, int position, Object object) {
        // TODO Auto-generated method stub
        container.removeView(mList.get(position));
    }


}
