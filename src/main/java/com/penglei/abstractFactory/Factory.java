package com.penglei.abstractFactory;

/**
 * @author ascetic
 * @version 1.0
 * @InterfaceName Factory
 * @Description 创建抽象工厂
 * @date 2020-04-27 13:26
 */
public interface Factory
{
    /// <summary>
    /// 获取鼠标工厂
    /// </summary>
    /// <returns></returns> 制造鼠标产品
    IMouse GetMouseProduct();
    /// <summary>
    /// 获取键盘工厂
    /// </summary>
    /// <returns></returns> 制造键盘产品
    Ikeyboard GetKeyboardProduct();

}
