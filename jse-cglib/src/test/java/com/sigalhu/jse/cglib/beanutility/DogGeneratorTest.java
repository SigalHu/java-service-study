package com.sigalhu.jse.cglib.beanutility;

import com.sigalhu.jse.cglib.targetobject.DogImpl;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author huxujun
 * @date 2018/11/18
 */
public class DogGeneratorTest {

    @Test
    public void test() {
        DogImpl dog = DogGenerator.create();
        Assert.assertNotNull(dog);
        Assert.assertEquals("DogGenerator", dog.getName());
        Assert.assertEquals("Dog bark: wow wow wow! --- DogGenerator", dog.dogBark());
    }
}