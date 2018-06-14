# spring-in-action

###### Spring的配置方式

1.基于XML
2.基于注解
```
    @Component, @Service, @Controler, @Repository作用都是声明一个组件。
        默认ID是类名(第一个字母小写)，也可以给定ID
    @ComponentScan包扫描配置
        默认基础包（配置类所在的包）
        指定包名（value属性，basePackages属性（数组））
        指定类或接口（basePackageClasses属性）
    @Autowired自动装配
        可以作用与方法，变量上
        默认装配失败返回异常，@Autowired(required=false)，尝试装配，装配失败返回null，不会抛出异常
```
3.基于JavaConfig
```
    JavaConfig是通过java代码的方式描述Bean
    @Configuration 声明是一个配置类
    @Bean 声明需要被容器管理的Bean
```

###### Spring AOP
Aspect: 切面，是横切关注点的模块化（做什么？ 什么时候？ 什么地方？ 通知+切入点）
Pointcut:切入点， 什么地方
Advisor:通知，做什么？+ 什么时候？

1. schema based
在<aop:cofig>下配置AOP的各个元素
2. @AspectJ based
需要声明AspectJ支持 <aop:aspectj-autoproxy />
3. execution表达式  execution(方法表达式) -> 访问权限 方法签名 参数：
```
    * ： 匹配任意数量字符
    ..: 匹配热河数量字符的重复。如在类型模式中匹配任何数量子包；方法参数模式中匹配任何数量参数
    +： 匹配指定类型的子类型
    AspectJ使用 且（&&）、或（||）、非（！）来组合切入点表达式。
    Schema 中用 and、or、not

    public * *(..) 任何公共方法
    * pro.jing..Service.*() pro.jing包及其所有子包下Service接口中的任何无参方法
    * pro.jing..Service.*(*)pro.jing包及其所有子包下Service接口中的任何只有一个参数方法
    (!pro.jing..Service+).*(..) 非pro.jing包及其子包下的接口Service接口紫气子类型的任何方法
```
