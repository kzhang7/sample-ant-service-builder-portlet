package com.kzhang.liferay.sample.impl;

import com.kzhang.liferay.sample.BarBean;

public class BarBeanImpl implements BarBean {
	@Override
	public void bar() {
		System.out.println("I am BarBeanImpl!");
	}
}
