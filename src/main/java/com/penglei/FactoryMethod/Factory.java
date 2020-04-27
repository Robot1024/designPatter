package com.penglei.FactoryMethod;

/**
 * @author ascetic
 * @version 1.0
 * @InterfaceName Factory
 * @Description 工厂接口
 * @date 2020-04-27 12:26
 */
public interface Factory
{

    /// 返回所有产品的抽象父类方法，具体返回那个产品，不同工厂实例里逻辑
    IMouse GetMouseFactory();

}
