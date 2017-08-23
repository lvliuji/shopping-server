package com.hanxiao.po;

import java.util.List;

/**
 * Created by wenzhi on 17/6/22.
 */
public class PromotionItemData {
    private long id;
    private String description;
    private String imgUrl;
    private String actionUrl;
    private String type;
    private String subDescription;
    private List<PromotionItemBanner> banners;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getActionUrl() {
        return actionUrl;
    }

    public void setActionUrl(String actionUrl) {
        this.actionUrl = actionUrl;
    }

    public List<PromotionItemBanner> getBanners() {
        return banners;
    }

    public void setBanners(List<PromotionItemBanner> banners) {
        this.banners = banners;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubDescription() {
        return subDescription;
    }

    public void setSubDescription(String subDescription) {
        this.subDescription = subDescription;
    }
}
