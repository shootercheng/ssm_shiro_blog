# param-validator for web.xml
[https://github.com/CatDou/param-validator](https://github.com/CatDou/param-validator)

# Step
## clone
```jshelllanguage
$ git clone https://github.com/CatDou/param-validator
```
## mvn install
## add dependency
```xml
<dependency>
    <groupId>com.github.catdou</groupId>
    <artifactId>param-validator</artifactId>
    <version>1.3-SNAPSHOT</version>      
</dependency>
``` 

# add a filter
```xml
   <filter>
    <filter-name>paramValidator</filter-name>
    <filter-class>org.catdou.validate.filter.ParamFilter</filter-class>
    <init-param>
      <param-name>type</param-name>
      <param-value>xml</param-value>
    </init-param>
    <init-param>
      <param-name>path</param-name>
      <param-value>classpath*:xml/**/validate_*.xml</param-value>
    </init-param>
  </filter>
  <filter-mapping>
    <filter-name>paramValidator</filter-name>
    <url-pattern>/*</url-pattern>
  </filter-mapping>
```
