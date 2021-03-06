package com.sigalhu.jse.spring.conflict.bean1;

import com.sigalhu.jse.spring.conflict.BeanNameConflictEx;
import org.springframework.stereotype.Service;

/**
 * @author huxujun
 * @date 2018/9/19
 */
// 此处若使用默认的bean id会与bean2中的BeanNameConflictEx冲突
@Service("beanName1")
public class BeanNameConflictExImpl implements BeanNameConflictEx {

    @Override
    public void hello() {
        System.out.println("I come from bean1");
    }
}
