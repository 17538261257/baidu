package com.example.baidu.api;

import java.util.List;

public class HomeBean {


    /**
     * code : 0000
     * message : 首页数据
     * wonderfulTime : {"wonderful_url":"http://106.13.63.54:8080/sys/image/x.jpg","wonderful_Introduction":"精彩事件，需要做倒计时，而且，每次进入应用。根据接口，重新开始倒计时.如果时间写固定值，则不得分","start_time":1564027932}
     * bannerBean : [{"bannerIma_url":"http://106.13.63.54:8080/sys/image/o.jpg","banner_introd":"这是第一张图","bannerWeb_url":"http://106.13.63.54:8080/sys/xxx.html"},{"bannerIma_url":"http://106.13.63.54:8080/sys/image/p.jpg","banner_introd":"这是第二张图","bannerWeb_url":"http://106.13.63.54:8080/sys/xxx.html"},{"bannerIma_url":"http://106.13.63.54:8080/sys/image/q.jpg","banner_introd":"这是第三张图","bannerWeb_url":"http://106.13.63.54:8080/sys/xxx.html"},{"bannerIma_url":"http://106.13.63.54:8080/sys/image/r.jpg","banner_introd":"这是第四张图","bannerWeb_url":"http://106.13.63.54:8080/sys/xxx.html"}]
     * shopListBeans : [{"shop_name":"商品0","shop_ListingTime":"1563779867","shop_introd":"儿童玩具0","shop_pirce":"3.45","shop_image_url":"http://106.13.63.54:8080/sys/image/l.jpg"},{"shop_name":"商品1","shop_ListingTime":"1563779867","shop_introd":"儿童玩具1","shop_pirce":"3.45","shop_image_url":"http://106.13.63.54:8080/sys/image/c.jpg"},{"shop_name":"商品2","shop_ListingTime":"1563779867","shop_introd":"儿童玩具2","shop_pirce":"3.45","shop_image_url":"http://106.13.63.54:8080/sys/image/a.jpg"},{"shop_name":"商品3","shop_ListingTime":"1563779867","shop_introd":"儿童玩具3","shop_pirce":"3.45","shop_image_url":"http://106.13.63.54:8080/sys/image/b.jpg"},{"shop_name":"商品4","shop_ListingTime":"1563779867","shop_introd":"儿童玩具4","shop_pirce":"3.45","shop_image_url":"http://106.13.63.54:8080/sys/image/d.jpg"},{"shop_name":"商品5","shop_ListingTime":"1563779867","shop_introd":"儿童玩具5","shop_pirce":"3.45","shop_image_url":"http://106.13.63.54:8080/sys/image/k.jpg"},{"shop_name":"商品6","shop_ListingTime":"1563779867","shop_introd":"儿童玩具6","shop_pirce":"3.45","shop_image_url":"http://106.13.63.54:8080/sys/image/e.jpg"},{"shop_name":"商品7","shop_ListingTime":"1563779867","shop_introd":"儿童玩具7","shop_pirce":"3.45","shop_image_url":"http://106.13.63.54:8080/sys/image/f.jpg"},{"shop_name":"商品8","shop_ListingTime":"1563779867","shop_introd":"儿童玩具8","shop_pirce":"3.45","shop_image_url":"http://106.13.63.54:8080/sys/image/g.jpg"},{"shop_name":"商品9","shop_ListingTime":"1563779867","shop_introd":"儿童玩具9","shop_pirce":"3.45","shop_image_url":"http://106.13.63.54:8080/sys/image/g.jpg"}]
     */

    private String code;
    private String message;
    private WonderfulTimeBean wonderfulTime;
    private List<BannerBeanBean> bannerBean;
    private List<ShopListBeansBean> shopListBeans;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public WonderfulTimeBean getWonderfulTime() {
        return wonderfulTime;
    }

    public void setWonderfulTime(WonderfulTimeBean wonderfulTime) {
        this.wonderfulTime = wonderfulTime;
    }

    public List<BannerBeanBean> getBannerBean() {
        return bannerBean;
    }

    public void setBannerBean(List<BannerBeanBean> bannerBean) {
        this.bannerBean = bannerBean;
    }

    public List<ShopListBeansBean> getShopListBeans() {
        return shopListBeans;
    }

    public void setShopListBeans(List<ShopListBeansBean> shopListBeans) {
        this.shopListBeans = shopListBeans;
    }

    public static class WonderfulTimeBean {
        /**
         * wonderful_url : http://106.13.63.54:8080/sys/image/x.jpg
         * wonderful_Introduction : 精彩事件，需要做倒计时，而且，每次进入应用。根据接口，重新开始倒计时.如果时间写固定值，则不得分
         * start_time : 1564027932
         */

        private String wonderful_url;
        private String wonderful_Introduction;
        private long start_time;

        public String getWonderful_url() {
            return wonderful_url;
        }

        public void setWonderful_url(String wonderful_url) {
            this.wonderful_url = wonderful_url;
        }

        public String getWonderful_Introduction() {
            return wonderful_Introduction;
        }

        public void setWonderful_Introduction(String wonderful_Introduction) {
            this.wonderful_Introduction = wonderful_Introduction;
        }

        public long getStart_time() {
            return start_time;
        }

        public void setStart_time(int start_time) {
            this.start_time = start_time;
        }
    }

    public static class BannerBeanBean {
        /**
         * bannerIma_url : http://106.13.63.54:8080/sys/image/o.jpg
         * banner_introd : 这是第一张图
         * bannerWeb_url : http://106.13.63.54:8080/sys/xxx.html
         */

        private String bannerIma_url;
        private String banner_introd;
        private String bannerWeb_url;

        public String getBannerIma_url() {
            return bannerIma_url;
        }

        public void setBannerIma_url(String bannerIma_url) {
            this.bannerIma_url = bannerIma_url;
        }

        public String getBanner_introd() {
            return banner_introd;
        }

        public void setBanner_introd(String banner_introd) {
            this.banner_introd = banner_introd;
        }

        public String getBannerWeb_url() {
            return bannerWeb_url;
        }

        public void setBannerWeb_url(String bannerWeb_url) {
            this.bannerWeb_url = bannerWeb_url;
        }
    }

    public static class ShopListBeansBean {
        /**
         * shop_name : 商品0
         * shop_ListingTime : 1563779867
         * shop_introd : 儿童玩具0
         * shop_pirce : 3.45
         * shop_image_url : http://106.13.63.54:8080/sys/image/l.jpg
         */

        private String shop_name;
        private String shop_ListingTime;
        private String shop_introd;
        private String shop_pirce;
        private String shop_image_url;

        public String getShop_name() {
            return shop_name;
        }

        public void setShop_name(String shop_name) {
            this.shop_name = shop_name;
        }

        public String getShop_ListingTime() {
            return shop_ListingTime;
        }

        public void setShop_ListingTime(String shop_ListingTime) {
            this.shop_ListingTime = shop_ListingTime;
        }

        public String getShop_introd() {
            return shop_introd;
        }

        public void setShop_introd(String shop_introd) {
            this.shop_introd = shop_introd;
        }

        public String getShop_pirce() {
            return shop_pirce;
        }

        public void setShop_pirce(String shop_pirce) {
            this.shop_pirce = shop_pirce;
        }

        public String getShop_image_url() {
            return shop_image_url;
        }

        public void setShop_image_url(String shop_image_url) {
            this.shop_image_url = shop_image_url;
        }
    }
}
