package com.sigalhu.jse.cglib.beanutility;

import com.sigalhu.jse.cglib.targetobject.DogImpl;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author huxujun
 * @date 2018/11/18
 */
public class ImmutableDogTest {

    @Test(expected = IllegalStateException.class)
    public void test() {
        DogImpl dog = ImmutableDog.create();
        Assert.assertNotNull(dog);
        Assert.assertEquals("ImmutableDog", dog.getName());
        Assert.assertEquals("Dog bark: wow wow wow! --- Default", dog.dogBark());

        dog.setDogName("ImmutableDog2");
        Assert.assertEquals("ImmutableDog2", dog.getName());
        Assert.assertEquals("Dog bark: wow wow wow! --- Default", dog.dogBark());

        //只有set方法才生效
        dog.setName("ImmutableDog3");
    }
}