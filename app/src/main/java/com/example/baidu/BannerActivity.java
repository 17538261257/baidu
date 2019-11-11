package com.example.baidu;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.baidu.api.ApiServcie;
import com.example.baidu.api.HomeBean;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class BannerActivity extends AppCompatActivity {
    private int countNext = 0;
    private ViewPager mVpView0;
    private ImageView mIvV1;
    private ImageView mIvV2;
    private ImageView mIvV3;
    private ImageView mIvV4;
    private ArrayList<ImageView> mImageViews;
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            if (msg.what == 1) {
                mVpView0.setCurrentItem(countNext);//设置这次要显示的pager
                //切换选中的圆点
                setPointStatus(countNext);
            }

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rv_view0);
        initView();
        initData();

    }

    private void initView() {
        mVpView0 = (ViewPager) findViewById(R.id.vp_view0);
        mIvV1 = (ImageView) findViewById(R.id.iv_v1);
        mIvV2 = (ImageView) findViewById(R.id.iv_v2);
        mIvV3 = (ImageView) findViewById(R.id.iv_v3);
        mIvV4 = (ImageView) findViewById(R.id.iv_v4);


    }

    protected void initData() {
        Retrofit retrofit = new Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(ApiServcie.urls)
                .build();

        ApiServcie apiServcie = retrofit.create(ApiServcie.class);

        Observable<HomeBean> observable = apiServcie.getData();

        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<HomeBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(HomeBean homeBean) {
                        List<HomeBean.BannerBeanBean> bannerBean = homeBean.getBannerBean();

                       /* images = new ArrayList<>();
                        for (int i = 0; i < banners.size(); i++) {
                            images.add(banners.get(i).getBannerIma_url());
                        }*/
                        final BannerAdapter bannerAdapter = new BannerAdapter(bannerBean, BannerActivity.this);
                        //vp = holder.vp_view0;
                        //定义一个集合list去加point
                        mImageViews = new ArrayList<>();
                        mImageViews.add(mIvV1);
                        mImageViews.add(mIvV2);
                        mImageViews.add(mIvV3);
                        mImageViews.add(mIvV4);
                        mVpView0.setAdapter(bannerAdapter);
                        mVpView0.setSelected(true);

                        //通过定时器，制定自动滑动效果
                        Timer timer = new Timer();
                        TimerTask timerTask = new TimerTask() {
                            @Override
                            public void run() {
                                countNext = 1 + mVpView0.getCurrentItem();//下一页
                                Log.e("tag", "下一页为:" + countNext + "");
                                if (countNext == 4) {
                                    countNext = 0;
                                }
                                handler.sendEmptyMessage(1);
                            }
                        };
                        timer.schedule(timerTask, 3000, 2000);

                        mVpView0.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                            @Override
                            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                            }

                            @Override
                            public void onPageSelected(int position) {//当前选中的page position坐标位置
                                setPointStatus(position);
                            }

                            @Override
                            public void onPageScrollStateChanged(int state) {
                            }
                        });
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    private void setPointStatus(int position) {
        for (int i = 0; i < mImageViews.size(); i++) {
            if (i == position) {
                mImageViews.get(i).setSelected(true);
            } else {
                mImageViews.get(i).setSelected(false);
            }
        }
    }

}
