package com.lxk.design.pattern.factory.ezsy;

/**
 * 矩形
 *
 * @author LiXuekai on 2020/7/23
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
