package com.github.jsonzou.jmockdata.mocker;

import com.github.jsonzou.jmockdata.MockConfig;
import com.github.jsonzou.jmockdata.Mocker;
import com.github.jsonzou.jmockdata.util.RandomUtils;

/**
 * Float对象模拟器
 */
public class FloatMocker implements Mocker<Float> {

  public static final FloatMocker INSTANCE = new FloatMocker();

  @Override
  public Float mock(MockConfig mockConfig) {
    return RandomUtils.nextFloat(mockConfig.getFloatRange()[0], mockConfig.getFloatRange()[1]);
  }
}
