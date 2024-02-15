


### Note
    1 If we use ApplicationContext then it will create the object of ApplicationContext not BeanFactory.
    2 We can mention named as spring.xml file or applicationcontext.xml.


### spring.xml

    <?xml version="1.0" encoding="UTF-8"?>
    <beans xmlns="http://www.springframework.org/schema/beans"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans-2.5.xsd">
        <bean id="s" class="com.test.Student">
            <property name="fullName" value="Swapnil Kamble"></property>
            <property name="age" value="30"></property>
            <property name="city" value="mumbai"></property>
        </bean>
    </beans>
    
### pom.xml

        <dependencies>
            <!-- Spring Core -->
            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-core</artifactId>
                <version>5.3.22</version> <!-- Or the latest version available -->
            </dependency>
            <!-- Spring Context -->
            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-context</artifactId>
                <version>5.3.22</version> <!-- Or the latest version available -->
            </dependency>
        </dependencies>