package com.dc.loading.utils;

/**
 * @author Zhangzhenguo
 * @create 2020/1/21
 * @Email 18311371235@163.com
 * @Describe
 */
public class DotNumberUtil {
    /**
     * x坐标
     */
    public float x;
    /**
     * y坐标
     */
    public float y;
    /**
     * 颜色
     */
    public int color;
    /**
     * 点的半径，可以一个点一个半径
     */
    public float dotRadius;

    public DotNumberUtil(float x, float y, int color, float dotRadius) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.dotRadius = dotRadius;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public float getDotRadius() {
        return dotRadius;
    }

    public void setDotRadius(float dotRadius) {
        this.dotRadius = dotRadius;
    }
}
