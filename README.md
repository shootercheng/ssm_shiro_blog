# param-validator for web.xml

[https://github.com/CatDou/param-validator](https://github.com/CatDou/param-validator)

# add a filter
```xml
  <filter>
    <filter-name>paramValidator</filter-name>
    <filter-class>org.springframework.web.filter.CharacterEncodingFilter</filter-class>
    <init-param>
      <param-name>type</param-name>
      <param-value>UTF-8</param-value>
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