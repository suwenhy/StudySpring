package com.suweny.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;


@Import(DataSourceConfigration.class)
//映入其他配置文件
@Configuration //标志该类是Sringn的配置类，且一般就是主配置文件做此标记
@ComponentScan("com.suweny")
//效果等同于<context:component-scan base-package="com.suweny"></context:component-scan>
@PropertySource("classpath:jdbc.properties")
//效果等同于<context:property-placeholder location="classpath:jdbc.properties"></context:property-placeholder>
public class SpringConfiguration {

}
