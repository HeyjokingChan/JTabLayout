package com.liang.jtab;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.support.annotation.IdRes;
import android.view.View;

public interface Tab {

    Tab setOrientationMode(int mode);

    int getPosition();

    void setPosition(int position);

    CharSequence getTitle();

    Tab setTitle(CharSequence title);

    Object getContentDesc();

    Tab setContentDesc(Object contentDesc);

    ColorStateList getTitleColor();

    Tab setTitleColor(@ColorInt int defaultColor, @ColorInt int selectedColor);

    Tab setTitleColor(ColorStateList titleColor);

    Tab setBackgroundRes(@DrawableRes int resId);

    Tab setBackgroundDraw(Drawable background);

    Drawable getBackground();

    Drawable[] getIcons();

    Tab setIcon(@DrawableRes int defaultIcon, @DrawableRes int selectedIcon);

    Tab setIcon(Drawable defaultIcon, Drawable selectedIcon);

    void setTabPadding(int left, int top, int right, int bottom);

    void transition(int textTransitionMode, float positionOffset);

    View getView();

    void setSelected(boolean b);

    void setTextTransitionMode(int textTransitionMode);

    Tab setBold(boolean b);

    Tab setTextSize(float size);

    Tab setBadgeTextColor(@ColorInt int color);

    Tab setBadgeTextSize(float size);

    Tab setBadgeColor(@ColorInt int color);

    Tab setBadgeStroke(int width, @ColorInt int color);

    void showBadgeMsg(String msg, boolean showDot);

    void hideBadgeMsg();
}
