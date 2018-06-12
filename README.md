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