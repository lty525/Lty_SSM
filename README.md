#后台管理系统
##1项目介绍
###1.1后台管理系统
###1.2后台管理系统技术选型
* Maven工程
* 项目需要导入依赖的jar包
```java
<properties>
        <spring.version>5.0.2.RELEASE</spring.version>
        <slf4j.version>1.6.6</slf4j.version>
        <log4j.version>1.2.12</log4j.version>
        <oracle.version>10.2.0.1.0</oracle.version>
        <mybatis.version>3.4.5</mybatis.version>
        <spring.security.version>5.0.1.RELEASE</spring.security.version>
    </properties>

    <dependencies>        <!-- spring -->
        <dependency>
            <groupId>org.aspectj</groupId>
            <artifactId>aspectjweaver</artifactId>
            <version>1.6.8</version>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-aop</artifactId>
            <version>${spring.version}</version>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-context</artifactId>
            <version>${spring.version}</version>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-context-support</artifactId>
            <version>${spring.version}</version>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-web</artifactId>
            <version>${spring.version}</version>
        </dependency>
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-annotations</artifactId>
            <version>2.9.0</version>
        </dependency>
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-databind</artifactId>
            <version>2.9.0</version>
        </dependency>
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-core</artifactId>
            <version>2.9.0</version>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-orm</artifactId>
            <version>${spring.version}</version>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-beans</artifactId>
            <version>${spring.version}</version>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-core</artifactId>
            <version>${spring.version}</version>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-test</artifactId>
            <version>${spring.version}</version>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>${spring.version}</version>

        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-tx</artifactId>
            <version>${spring.version}</version>
        </dependency>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
            <scope>test</scope>
        </dependency>

        <dependency>
            <groupId>javax.servlet</groupId>
            <artifactId>javax.servlet-api</artifactId>
            <version>3.1.0</version>
            <scope>provided</scope>
        </dependency>
        <dependency>
            <groupId>javax.servlet.jsp</groupId>
            <artifactId>jsp-api</artifactId>
            <version>2.0</version>
            <scope>provided</scope>
        </dependency>
        <dependency>
            <groupId>jstl</groupId>
            <artifactId>jstl</artifactId>
            <version>1.2</version>
        </dependency>        <!-- log start -->
        <dependency>
            <groupId>log4j</groupId>
            <artifactId>log4j</artifactId>
            <version>${log4j.version}</version>
        </dependency>
        <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-api</artifactId>
            <version>${slf4j.version}</version>
        </dependency>
        <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-log4j12</artifactId>
            <version>${slf4j.version}</version>
        </dependency>        <!-- log end -->

        <dependency>
            <groupId>org.mybatis</groupId>
            <artifactId>mybatis</artifactId>
            <version>${mybatis.version}</version>
        </dependency>
        <dependency>
            <groupId>org.mybatis</groupId>
            <artifactId>mybatis-spring</artifactId>
            <version>1.3.0</version>
        </dependency>
        <dependency>
            <groupId>c3p0</groupId>
            <artifactId>c3p0</artifactId>
            <version>0.9.1.2</version>
            <type>jar</type>
            <scope>compile</scope>
        </dependency>
        <dependency>
            <groupId>com.alibaba</groupId>
            <artifactId>druid</artifactId>
            <version>1.0.9</version>
        </dependency>
        <dependency>
            <groupId>com.github.pagehelper</groupId>
            <artifactId>pagehelper</artifactId>
            <version>5.1.2</version>
        </dependency>
        <dependency>
            <groupId>org.springframework.security</groupId>
            <artifactId>spring-security-web</artifactId>
            <version>${spring.security.version}</version>
        </dependency>
        <dependency>
            <groupId>org.springframework.security</groupId>
            <artifactId>spring-security-config</artifactId>
            <version>${spring.security.version}</version>
        </dependency>
        <dependency>
            <groupId>org.springframework.security</groupId>
            <artifactId>spring-security-core</artifactId>
            <version>${spring.security.version}</version>
        </dependency>
        <dependency>
            <groupId>org.springframework.security</groupId>
            <artifactId>spring-security-taglibs</artifactId>
            <version>${spring.security.version}</version>
        </dependency>

        <dependency>
            <groupId>com.oracle</groupId>
            <artifactId>ojdbc14</artifactId>
            <version>${oracle.version}</version>
        </dependency>

        <dependency>
            <groupId>javax.annotation</groupId>
            <artifactId>jsr250-api</artifactId>
            <version>1.0</version>
        </dependency>
    </dependencies>
     <build>
        <pluginManagement>
            <plugins>
                <plugin>
                    <groupId>org.apache.maven.plugins</groupId>
                    <artifactId>maven-compiler-plugin</artifactId>
                    <version>3.2</version>
                    <configuration>
                        <source>1.8</source>
                        <target>1.8</target>
                        <encoding>UTF-8</encoding>
                        <showWarnings>true</showWarnings>
                    </configuration>
                </plugin>

            </plugins>
        </pluginManagement>
        <plugins>
                <plugin>
                    <groupId>org.apache.tomcat.maven</groupId>
                    <artifactId>tomcat7-maven-plugin</artifactId>
                    <version>2.2</version>
                    <configuration>
                        <!-- 通过maven tomcat7:run运行项目时，访问项目的端口号 -->
                        <port>80</port>

                        <!-- 项目访问路径  本例：localhost:9090,  如果配置的aa， 则访问路径为localhost:9090/aa-->
                        <path>/ssm</path>
                    </configuration>
            </plugin>
        </plugins>
    </build>
```
* Maven工程的分层
![](1/s1.png)
####1.2.1web层:springMvc框架
* springmvc的配置文件
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:mvc="http://www.springframework.org/schema/mvc"
       xmlns:context="http://www.springframework.org/schema/context"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:security="http://www.springframework.org/schema/security"
       xmlns:aop="http://www.springframework.org/schema/aop"
       xmlns:p="http://www.springframework.org/schema/p"
       xsi:schemaLocation="
       http://www.springframework.org/schema/beans
       http://www.springframework.org/schema/beans/spring-beans.xsd
       http://www.springframework.org/schema/mvc
       http://www.springframework.org/schema/mvc/spring-mvc.xsd
       http://www.springframework.org/schema/context
       http://www.springframework.org/schema/context/spring-context.xsd
       http://www.springframework.org/schema/security
        http://www.springframework.org/schema/security/spring-security.xsd
	http://www.springframework.org/schema/aop
	http://www.springframework.org/schema/aop/spring-aop.xsd">
    <!--导入扫描的包-->
    <context:component-scan base-package="cn.itcast.controller"/>
    <context:component-scan base-package="cn.itcast.controllerUntils"/>
    <aop:aspectj-autoproxy proxy-target-class="true"/>
    <!--<bean id="joinPoint" class="org.aspectj.lang.JoinPoint" a></bean>-->
    <!--开启jsr-250的注解控制权限-->
    <security:global-method-security pre-post-annotations="enabled" jsr250-annotations="enabled"
                                     secured-annotations="enabled"></security:global-method-security>
    <!--配置拦截器-->
    <!-- <mvc:interceptors>
         <mvc:interceptor>
             <mvc:mapping path="/**"/>

             <bean class="cn.itcast.controllerUntils.LogAopFilter"/>
         </mvc:interceptor>
     </mvc:interceptors>-->
    <bean class="javax.servlet.http.HttpServletResponse" id="response" abstract="true"></bean>
    <!--配置视图分析器-->
    <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver" id="viewResolver">
        <property name="prefix" value="/pages/"/>
        <property name="suffix" value=".jsp"/>
    </bean>
    <!--配置不需要过滤的资源-->
    <mvc:resources location="/css/" mapping="/css/**"/>
    <mvc:resources location="/img/" mapping="/img/**"/>

    <mvc:resources location="/plugins/" mapping="/plugins/**"/>
    <!--<mvc:default-servlet-handler/>-->
    <!--开启全局注解-->
    <mvc:annotation-driven/>
</beans>
```
* web.xml的配置文件
```xml
<!DOCTYPE web-app PUBLIC
        "-//Sun Microsystems, Inc.//DTD Web Application 2.3//EN"
        "http://java.sun.com/dtd/web-app_2_3.dtd" >

<web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd"
         version="3.1">
  <!--配置加载applicationContext.xml监听器-->
  <listener>
    <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
  </listener>
    <!--获取request对象-->
    <listener>
        <listener-class>org.springframework.web.context.request.RequestContextListener</listener-class>
    </listener>

 <context-param>
   <param-name>contextConfigLocation</param-name>
   <param-value>classpath*:applicationContext.xml,classpath*:spring-security.xml</param-value>
 </context-param>
  <!--配置解决乱码拦截器-->
  <filter>
    <filter-name>encodingFilter</filter-name>
    <filter-class>org.springframework.web.filter.CharacterEncodingFilter</filter-class>
    <init-param>
      <param-name>encoding</param-name>
      <param-value>UTF-8</param-value>
    </init-param>
  </filter>

    <filter-mapping>
    <filter-name>encodingFilter</filter-name>
    <url-pattern>/*</url-pattern>
  </filter-mapping>
    <!--配置springSecurity的拦截器-->
    <filter>
        <filter-name>springSecurityFilterChain</filter-name>
        <filter-class>org.springframework.web.filter.DelegatingFilterProxy</filter-class>
    </filter>
    <filter-mapping>
        <filter-name>springSecurityFilterChain</filter-name>
        <url-pattern>/*</url-pattern>
    </filter-mapping>

    <!--配置控制器 --> 
  <servlet>
    <servlet-name>dispatcherServlet</servlet-name>
    <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
    <init-param>
      <param-name>contextConfigLocation</param-name>
      <param-value>classpath:springmvc.xml</param-value>
    </init-param>
    <load-on-startup>1</load-on-startup>
  </servlet>
  <servlet-mapping>
    <servlet-name>dispatcherServlet</servlet-name>
    <url-pattern>/</url-pattern>
  </servlet-mapping>
    <!--配置权限不足的页面-->
    <error-page>
        <error-code>403</error-code>
        <location>/403.jsp</location>
    </error-page>

    <welcome-file-list>
        <welcome-file>index.html</welcome-file>
        <welcome-file>index.htm</welcome-file>
        <welcome-file>index.jsp</welcome-file>
        <welcome-file>default.html</welcome-file>
        <welcome-file>default.htm</welcome-file>
        <welcome-file>default.jsp</welcome-file>
    </welcome-file-list>
</web-app>
```
* web层包结构
![](1/s2.png)
####1.2.2service层:spring
* spring的配置文件
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xmlns:aop="http://www.springframework.org/schema/aop"
       xmlns:tx="http://www.springframework.org/schema/tx"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
	http://www.springframework.org/schema/beans/spring-beans.xsd
	http://www.springframework.org/schema/context
	http://www.springframework.org/schema/context/spring-context.xsd
	http://www.springframework.org/schema/aop
	http://www.springframework.org/schema/aop/spring-aop.xsd
	http://www.springframework.org/schema/tx
	http://www.springframework.org/schema/tx/spring-tx.xsd">
    <context:component-scan base-package="cn.itcast.service"/>
    <!--配置dao层的配置文件-->
    <!--配置数据源-->
    <bean id="dataSource" class="com.alibaba.druid.pool.DruidDataSource">
        <property name="driverClassName" value="oracle.jdbc.driver.OracleDriver"/>
        <property name="url" value="jdbc:oracle:thin:@192.168.80.88:1521:orcl"/>
        <property name="username" value="ssm"/>
        <property name="password" value="ssm"/>
    </bean>
    <!--配置SqlSessionFactoryBean-->
    <bean id="sessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean">
        <property name="dataSource" ref="dataSource"/>
        <property name="configLocation" value="classpath:MyBatis.xml"/>
        <!-- 自动扫描mapping.xml文件 -->
        <property name="mapperLocations" value="classpath:cn/itcast/dao/MemberMapper.xml"></property>
        <!-- 传入PageHelper的插件 -->
        <property name="plugins">
            <array>
                <!-- 传入插件的对象 -->
                <bean class="com.github.pagehelper.PageInterceptor">
                    <property name="properties">
                        <props>
                            <prop key="helperDialect">oracle</prop>
                            <prop key="reasonable">true</prop>
                        </props>
                    </property>
                </bean>
            </array>
        </property>
    </bean>
    <!--配置创建dao的的实体-->
    <bean id="mapperScannerConfigurer" class="org.mybatis.spring.mapper.MapperScannerConfigurer">
        <property name="basePackage" value="cn.itcast.dao"/>
    </bean>
    <!--配置事务-->
    <!-- 配置Spring的声明式事务管理 -->
    <!-- 配置事务管理器 -->
    <!--<aop:aspectj-autoproxy/>-->
    <!--<aop:aspectj-autoproxy proxy-target-class="true"/>-->

    <!--配置声明式事务管理-->
    <bean id="transactionManager" class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
        <property name="dataSource" ref="dataSource"/>
    </bean>

    <!--<tx:annotation-driven transaction-manager="transactionManager"/>-->


    <!--配置通知-->
    <tx:advice id="txAdvice" transaction-manager="transactionManager">
        <!--配置属性 注入数据-->
        <tx:attributes>
            <!--查询-->
            <tx:method name="find*" read-only="true"/>
            <!--增删改-->
            <!--<tx:method name="delete*" propagation="REQUIRED"/>-->
            <!--<tx:method name="save*" propagation="REQUIRED"/>-->
            <!--<tx:method name="update*" propagation="REQUIRED"/>-->
            <tx:method name="*" propagation="REQUIRED"/>
        </tx:attributes>
    </tx:advice>

    <!--配置切面-->
    <aop:config>
        <aop:pointcut id="pt1" expression="execution( * cn.itcast.service.impl.*.*(..))"/>
        <aop:advisor advice-ref="txAdvice" pointcut-ref="pt1"></aop:advisor>
    </aop:config>
    <!--配置通知类-->
<!--    <bean id="LogAopAdvice" class="cn.itcast.controllerUntils.LogAop"/>
<aop:config>
    &lt;!&ndash;配置切入点表达式&ndash;&gt;
    <aop:pointcut id="pt2" expression="execution(* cn.itcast.controller.*.*(..))"/>
    <aop:aspect id ="loggerAdvice" ref="LogAopAdvice">
        &lt;!&ndash;配置通知&ndash;&gt;
        <aop:before method="doBefore" arg-names="jp"  pointcut-ref="pt2" />
        <aop:after method="doAfter" arg-names="jp"  pointcut-ref="pt2"/>
    </aop:aspect>

</aop:config>-->
</beans>
```
* service层包结构
![](1/s3.png)
####1.2.3dao层:mybatis
* mybatis层使用逆向工程创建
![](1/s4.png)
* domain层使用逆向工程创建
####1.2.4数据库:oracel数据库
####1.2.3ssm整和其他的框架
#####1.2.3.1PageHelper框架(分页的插件)
#####1.2.3.2spring Security框架:权限验证框架
#####1.2.3.3MyBatis的逆向工程(插件)
###1.2后台管理系统功能实现
####1.2.1产品的处理
#####1.2.1.1查询所有的产品
#####1.2.1.2批量删除产品
#####1.2.1.3添加产品
####1.2.2订单的处理
#####1.2.2.1查询所有订单
#####1.2.2.2订单的详情信息
####1.2.3用户管理
#####1.2.3.1查询所有用户
#####1.2.3.2新建用户
#####1.2.3.3查询用户的详情信息
#####1.2.3.4删除用户
#####1.2.3.5修改用户
#####1.2.3.6给用户授权
#####1.2.3.6批量给用户重置密码(管理员权限)
####1.2.4角色管理
#####1.2.4.1查询所有角色
#####1.2.4.2新建角色
#####1.2.3.3查询角色的详情信息
#####1.2.4.4删除角色
####1.2.5资源权限管理
#####1.2.5.1查询所有权限
#####1.2.5.2删除权限
####1.2.6日志管理
#####1.2.6.1springAOP实现日志的添加
#####1.2.6.2查询所有日志信息
#####1.2.6.3批量删除日志信息
####1.2.7用户的操作
#####1.2.7.1修改个人信息
#####1.2.7.2修改个人密码
