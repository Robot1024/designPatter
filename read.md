![image-20200508180259288](https://tva1.sinaimg.cn/large/007S8ZIlly1gel770xb5mj30u00xlajn.jpg)



![image-20200508180828793](https://tva1.sinaimg.cn/large/007S8ZIlly1gel7cnbwlij31120i0n5o.jpg)



以上是开源项目用到的设计模式：形而上学

------

各种设计模式对应代码目录：

**abstractFactory 抽象工厂，CGLIBProxy cglib动态代理 ，constructor 构造者模式 ，dynamicproxy jdk动态代理模式，FactoryMethod 工厂方法，multiMethodFactory 抽象工厂模式，simpleFactory 简单工厂，staticFactory 静态简单工厂 ，staticProxy 静态代理，**



有了这个网站我觉得我不需要重复造轮子了，现在只要把这网站吸收好久可以

https://www.runoob.com/design-pattern/design-pattern-tutorial.html







------



# 设计模式

[设计模式-代码托管gitHub](https://github.com/Robot1024/designPatter)

## 1.设计模式之构建者模式

例如**SqlSessionFactoryBuilder、Evnironment**
解释：建造者模式属于**创建型**设计模式，它主要是将一个复杂对象的构建与表示分离，**使用多个简单的对象一步一步构建成一个复杂的对象**，它提供了一种创建对象的最佳方式。

建造者模式将复杂产品的构建过程封装在不同的方法中，使得创建过程非常清晰，能够让我们更加精确的控制复杂产品对象的创建过程，同时它隔离了复杂产品对象的创建和使用，使得相同的创建过程能够创建不同的产品。

但是如果某个产品的内部结构过于复杂，将会导致整个系统变得非常庞大，不利于控制，同时若干个产品之间存在较大的差异，则不适用建造者模式，毕竟这个世界上存在相同点大的两个产品不多，所以它的使用范围有限。其**UML**结构图如下：

![image-20200427022459305](https://tva1.sinaimg.cn/large/007S8ZIlly1ge7q9kewruj30ea065my5.jpg)

 

   **示例**

假设现在有一个快餐店，其中销量最好的一款套餐就是一个汉堡和一杯饮料。而汉堡有素食汉堡（veg Burger）和鸡肉汉堡（Chicken Burger）可供选择、饮料有可口可乐（coke）和百事可乐（pepsi）可以选择。所以该示例的UML为：

![image-20200427022745380](https://tva1.sinaimg.cn/large/007S8ZIlly1ge85u5up1cj30fn0b8gmf.jpg)

![image-20200427111703682](https://tva1.sinaimg.cn/large/007S8ZIlly1ge85n6ojs8j313k0u0n4l.jpg)

在MyBatis环境的初始化过程中，SqlSessionFactoryBuilder会调用XMLConfigBuilder读取所有的MybatisMapConfig.xml和所有的*Mapper.xml文件，构建MyBatis 运行的核心对象Configuration对象，然后将该Configuration 对象作为参数构建一个SqlSessionFactory对象。

![image-20200427113049392](https://tva1.sinaimg.cn/large/007S8ZIlly1ge861ic6c1j314w0nw1a9.jpg)

其中XMLConfigBuilder 在构建Configuration对象时，也会调用XMLMapperBuilder用于读取*Mapper文件，而XMLMapperBuilder会使用XMLStatementBuilder来读取和build所有SQL语句。

![image-20200427113501387](https://tva1.sinaimg.cn/large/007S8ZIlly1ge865vg0acj314g03iwgp.jpg)

在这个过程中，有一个相似的特点，就是这些Builder 会读取文件或者配置，然后做大量的XpathParser解析、配置或语法的解析、反射生成对象、存入结果缓存等步骤，这么多的工作都不是一个构造函数所能包括的，因为大量采用的了Builder模式解决。

## 2.简单工厂模式&工厂方法模式&抽象工厂模式的区别及优缺点及使用场景

工厂模式是设计模式中比较简单的一个设计模式，但很多地方都用到了工厂模式，（如解析xml中，jdbc连接数据库等）利用好工厂模式对程序的设计很有用处。
工厂模式在一些设计模式的书中分为**简单工厂模式**，**工厂方法模式**和**抽象工厂模式**三类。也有把工厂方法模式划分到抽象工厂模式的，认为工厂方法是抽象工厂模式的特例的一种，就是只有一个要实现的产品接口。

![image-20200427115220034](https://tva1.sinaimg.cn/large/007S8ZIlly1ge86nvyq7mj30pm0e00up.jpg)

### 简单工厂

#### 普通简单工厂

"程序源于生活高于生活"

Tip:小鹏开个小店是卖鼠标的，生活也还算过的去。但是不甘于寂寞的他想，我这守着一点店能卖出多少啊，何以解忧，唯有致富啊。现在的问题来的，我只有一个人只能守一点店，客户来问要什么样的鼠标，然后给。问题出在这，这是面向过程的，我不能解放出去，那为什么不制造一个售后自动售卖机呢，会写程序的小鹏（会一门外语的重要性）制造出了一个台鼠标制动售卖机（Factory）,客户来了只要在屏幕写上自己想要的那种鼠标就可以了，售卖机就会把鼠标给客户。**开挂的人生开启第一步**

就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建。首先看下关系图

![image-20200427115539566](https://tva1.sinaimg.cn/large/007S8ZIlly1ge86rcjyq1j30vw0ey766.jpg)



#### 多方法简单工厂

Tip:小鹏没高兴几天，机器坏了，原来已查看啊，世界之大什么奇葩人都有啊，输入要啥鼠标的有。什么大鼠标，小鼠标，带毛鼠标，联想惠普鼠标（你这还想要个杂交鼠标咋地）。没办法改吧，只能有三种鼠标，客户只能选择要那种鼠标。这下问题解决了，有的时候给他们太多自由不见得是件好事。周扬青就是一个例子，跑题好像。

开挂人生第二步，稳扎稳打。

是对普通工厂方法模式的改进，在普通工厂方法模式中，如果传递的类型出错，则不能正确创建对象，而多个工厂方法模式是提供多个工厂方法，分别创建对象,强制客户端进行商品的指定，`public static IMouse GetHPMouse()`。关系图：

![image-20200427121501144](https://tva1.sinaimg.cn/large/007S8ZIlly1ge87bha2lyj30x40fuq50.jpg)



#### 静态方法简单工厂

将上面的多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可。

Tip:没消停几天，有出问题了。当老板不容易啊，这回开不开机了，一查原来啊，为省电，每次顾客来了自己开机，这一天的开机关机，开机关机。还有的客户不会开机，朕也是醉了。好吧，那就不省电了，自动售卖机（Factory）一直开着，选择鼠标方法你们直接拿来用就好了。真是一天不消停。

### 工厂方法模式

简单工厂模式有一个问题就是，类的创建依赖工厂类，也就是说，如果想要拓展程序，必须对工厂类进行修改。假如增加其他品牌鼠标，工厂类需要修改，如何解决？就用到工厂方法模式，创建一个工厂接口和创建多个工厂实现类，这样一旦需要增加新的功能，直接增加新的工厂类就可以了，不需要修改之前的代码。这样更好的符合了开发-闭合原则。

Tip:不多几月，由于人美又诚信，小鹏生意越做越大，销量飙升，然后决定自己开一家做鼠标的代工厂了。给联想，惠普生产鼠标，工厂生意做风生水起，各个品牌的鼠标都找小鹏生产。这个忙啊。开始还有来一个品牌，工厂就修改一下增加一个生产者品牌方法。慢慢的来品牌越来越多，每天十几个，后来每天根本没时机生产产品了，天天修改生产鼠标方法。这要解决啊，灵光一闪一个工厂搞不定，那为啥不一个品牌设一个工厂呢。自己负责自己的产品就好了。这样就不干扰。工厂开启，有钱就任性。

![image-20200427122626280](https://tva1.sinaimg.cn/large/007S8ZIlly1ge87ndlbk5j313i0io0w4.jpg)



### 抽象工厂模式

就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建。首先看下关系图

为什么叫抽象工厂呢，因为它不在是一个产品工厂了，而是一类产品的工厂，可以生产同一类产品了。

Tip：由于生产的产品质量好，价钱便宜，联想和惠普想让小鹏也生产联想键盘 和 惠普键盘。现在的问题了 ，是要再开两家工厂生产联想键盘和惠普键盘呢，还是在以后联想鼠标工厂和惠普鼠标工厂上生产呢，最后的得出结论，同一品牌很多资源是可以复用的，再开一家工厂成本太高。于是决定，联想键盘在联想鼠标工厂生产，惠普键盘在惠普鼠标工厂生产。联想鼠标工厂 更名为  联想工厂。同时有两个产品线。感觉小鹏发家致富就在眼前了。

![image-20200427131416635](https://tva1.sinaimg.cn/large/007S8ZIlly1ge89173ptjj313k0n4guw.jpg)

由于生意火爆，工厂开的也多。小鹏特意给所有合作伙伴发封邮件，让门知道自己知道去那个工厂获取产品。千万比跑错了工厂。



抽象工厂模式中我们可以定义实现不止一个接口，一个工厂也可以生成不止一个产品类，抽象工厂模式较好的实现了“开放-封闭”原则，是三个模式中较为抽象，并具一般性的模式。我们在使用中要注意使用抽象工厂模式的条件。
无论是工厂模式增加代码复制度，有没有一种办法，不需要创建工厂，也能解决代码以后变动修改少方法。答案是有的，通过（ioc）控制反转，对象在被创建的时候，由一个调控系统内所有对象的外界实体，将其所依赖的对象的引用传递给它。也可以说，(di)依赖被注入到对象中。
后续继续讲解如何使ioc优化程序。

总结：每种工厂都自己优缺点，没有那种工厂是最好的，只有最适合的才是最好的。就算是通过ioc 控制反转也不是万能能。结合需要，适合才是最好的。

写死在程序里 与 动态代理依赖注入对比：准确的来说将程序由编译时转为运行时。

## 3.设计模式 之代理模式

代理模式是Java常见的设计模式之一。

1.场景一：客户端并不直接调用实际的对象，而是通过调用代理，来间接的调用实际的对象。 就好比MyBatis的Mapper接口编程，开编写代码的时候，Mapper接口根本没有实例化，你去调用谁啊。但是有个好消息是，你知道只要程序运行起来后，就会在运行时候创建一个xxx的实例化对象，xxx对象还有xxx方法（这些都是可以通过配置文件获取到的），这就使我们可以先通过获取到的配置参数创建代理对象。这时候，我们就可以通过代理对象访问被代理对象了。（其实具体mybatis 里的具体工作是代理对象做的）

1.场景二：功能增强，就是增强一些被代理对象非核心功能，可能是被代理对象没想到的，获取不专注的功能。就好比航空公司卖机票，就是卖机票没有什么特殊服务。然而一些机票代理公司，他们提供机票快递急送服务，可以选择位置，选窗口服务。只要多花钱就可以了。这就代理增强场景。

![image-20200427145159396](https://tva1.sinaimg.cn/large/007S8ZIlly1ge8busww9vj30za0kctag.jpg)

Tip：小鹏慢慢生意走上是正途，想找个女朋友。就跟朋友B说，给我介绍一个女朋友吧，这是我给她的礼物，朋友B很疑惑，我还没给你介绍呢，礼物给谁啊。小鹏无所谓的答到：”没关系介绍谁就给谁“。（代理模式，现在访问不到女票，但知道未能莫个时刻朋友B能访问到她）。不多天，在运气，朋友B，生意未来前景和礼物的加持下，小鹏交到了女朋友。但是随之问题也来了，者女朋友一天丢三落四，出门忘带钥匙，吃饭忘带钱。小鹏的内心是... 。没次女朋友要出门吃饭（这是一个方法），小鹏会提前拿好钥匙，吃完饭，小鹏会主动付款（因为她只管吃，不带钱）。这就是代理模式第二种代理增强 ，调用前增强，调用后增强。这种增强就是Java动态代理增强。交往了半年，小鹏这个苦不堪言啊，会写程序的小鹏突发奇想，我为什么不clone 一个这样的女友，把的她的优点全保留下来，然后在clone过程中，给他填上 出门带钥匙，吃饭要带钱的 逻辑。这样岂不是完美女友不就热乎出炉了吗。（cglib也是动态代理）

### 静态代理

这种代理模式是通过java的多态+ 代码编写来实现的。



### 动态代理

#### java动态代理 java.lang.reflect

java 动态代理必须基于接口进行编程。

动态代理有别于静态代理，是根据代理的对象，动态创建代理类。这样，就可以避免静态代理中代理类接口过多的问题。动态代理是实现方式，是通过反射来实现的，借助Java自带的`java.lang.reflect.Proxy`,通过固定的规则生成。 其步骤如下：

1. 编写一个委托类的接口，即静态代理的（Subject接口）

2. 实现一个真正的委托类，即静态代理的（RealSubject类）

3. 创建一个动态代理类，实现`InvocationHandler `接口，并重写该`invoke`方法

4. 在测试类中，生成动态代理的对象。

   第一二步骤，和静态代理一样，不过说了。第三步，代码如下：

   ```java
   public class DynamicProxy implements InvocationHandler {
   
       // 被代理对象
       private Object target;
   
   
       //绑定被代理对象，并返回代理对象。
       public Object bind(Object target) {
           this.target = target;
           //{newProxyInstance,第一个参数：被代理类的类加载器，第二个参数：被代理类的实现接口，第三个参数：代理对象}
           return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(), this);
       }
   
       // 重写 invoke 方法{proxy 被代理类对象，
       /**
        * @Author ascetic
        * @Description TODO
        * @Date 15:41 2020-04-27
        * @Param [proxy 被代理对象, method 被调用方法, args 方法参数]
        * @return java.lang.Object
        **/
       @Override
       public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
           System.out.println("=============我是JDK动态代理================");
           Object result = null;
           //代理方法前调用
           System.out.println("女朋友出门前小鹏带钥匙");
   
           //执行方法，相当于执行女朋友出门吃饭的方法
           result = method.invoke(target,args);
   
           //代理方法后调用
           System.out.println("女朋友吃饭后小鹏付钱");
   
           return result;
       }
   }
   
   ```

   第四步，创建动态代理的对象

   ```java
           // 代理类
           DynamicProxy proxy = new DynamicProxy();
           // 被代理列
           RealSubject realSubject = new RealSubject();
           // 代理类绑定被代理类
           Subject subject = (Subject) proxy.bind(realSubject);
   
           // 返回的被代理对象不是 RealSubject 子类，它是被代理对象子类，
           //所以不能强转成成被代理类，java动态代理是是基于接口的，所以可以转成接口对象
           // 代理类执行方法先执行 invoke 方法，
           //再执行 method.invoke(target,args); 相当于执行被代理类的方法
   
           //这是错误写法
           //RealSubject subject = (RealSubject) proxy.bind(realSubject);
   
           // 代理类执行 代理方法
           subject.visit();
   ```

   创建动态代理的对象，需要借助`Proxy.newProxyInstance`。该方法的三个参数分别是：

   - ClassLoader loader表示当前使用到的appClassloader。
   - Class<?>[] interfaces表示目标对象实现的一组接口。
   - InvocationHandler h表示当前的InvocationHandler实现实例对象。

   关于动态代理的使用，我们就介绍到这里。关于动态代理的实现、借助非JDK库实现动态代理、以及他们的优缺点放到以后再介绍。

#### cglib也是动态代理，不同于proxy

它不需要基于接口进行代理，这就克服了JDK动态代理必须提供接口才可以使用的缺陷。

它原理直接操作字节码文件进行代理。

```java
public class CGLIBProxy implements MethodInterceptor {


    // 被代理对象
    private Object target;


    public Object getProxySubject(Object target){

        this.target = target;

        // Enhancer是cglib中使用频率很高的一个类，它是一个字节码增强器，可以用来为无接口的类创建代理。
        // 它的功能与java自带的Proxy类挺相似的。它会根据某个给定的类创建子类，并且所有非final的方法都带有回调钩子。
        // JDK 动态代理的被代理对象和代理对象是  兄弟级别
        // CGLIB 动态代理的被代理对象和代理对象是  父子级别
        Enhancer enhancer = new Enhancer();
        // 把被代理对象设置成父类
        enhancer.setSuperclass(this.target.getClass());
        // 设置回调方法
        enhancer.setCallback(this);
        // 创建代理对象
        return enhancer.create();
    }



    //参数：Object为由CGLib动态生成的代理类实例，Method为上文中实体类所调用的被代理的方法引用，Object[]为参数值列表，MethodProxy为生成的代理类对方法的代理引用。
    //返回：从代理实例的方法调用返回的值。
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

        System.out.println("=============我是CGLIB动态代理===============");
        Object result = null;
        //代理方法前调用
        System.out.println("女朋友出门前小鹏带钥匙");


        //这其中MethodProxy proxy参数一般是用来调用原来的对应方法的。比如可以proxy.invokeSuper(obj, args)。
        //那么为什么不能像InvocationHandler那样用method来调用呢？
        //因为如果用method调用会再次进入拦截器。为了避免这种情况，应该使用接口方法中第四个参数methodProxy调用invokeSuper方法。

        //执行方法，相当于执行女朋友出门吃饭的方法
        result = methodProxy.invokeSuper(obj,args);

        //代理方法后调用
        System.out.println("女朋友吃饭后小鹏付钱");


        return result;
    }
}
```

```java
// 代理类
CGLIBProxy proxy = new CGLIBProxy();
// 被代理列
RealSubject realSubject = new RealSubject();

// 获取代理对象
Subject subject = (Subject) proxy.getProxySubject(realSubject);
// 代理类执行 代理方法
subject.visit();
```



