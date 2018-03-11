package com.kingja.supershapeview;

import android.support.annotation.ColorRes;

/**
 * Description:TODO
 * Create Time:2018/3/11 11:54
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public interface IShape {

    public void setSolidColor(int solidColor);

    public void setStrokeColor(int strokeColor);

    public void setStrokeWidth(int strokeWidth);

    public void setCorner(float corner);

    public void setCorner(int leftTopCorner, int rightTopCorner, int rightBottomCorner, int leftBottomCorner);
}