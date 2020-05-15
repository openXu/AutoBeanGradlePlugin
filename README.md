
## AutoBeanGradlePlugin

该Gradle插件通过配置JDBC自动连接Mysql数据库，使用`Velocity`模板引擎自动组建实体类文件，从而实现JavaBean类的自动生成。

**相关链接**

**[博客讲解](https://openxu.blog.csdn.net/article/details/106146211)**

**[《Gradle深度揭秘》](https://edu.csdn.net/course/detail/25346)**

## 插件使用

请自行下载源码发布到本地Maven仓库后使用

![效果图](https://github.com/openXu/AutoBeanGradlePlugin/blob/master/autobean.png)

```xml
//root build.gradle
buildscript {
    repositories {
		...
        maven {
            url uri('repos')
        }
    }
    dependencies {
        classpath 'com.android.tools.build:gradle:3.2.1'
        classpath 'msyql.auto.javabean:plugin:1.0.0'
    }
}

//app build.gradle
apply plugin: 'com.android.application'
apply plugin: 'mysqlautobean.plugin'

android {
    ...
}
// 配置插件
beanDataSource{
    driver = "com.mysql.cj.jdbc.Driver"
    url = "jdbc:mysql://127.0.0.1:3306/openXu?serverTimezone=UTC&useUnicode=true&characterEncoding=utf8&useSSL=false&useCursorFetch=true&defaultFetchSize=1000"
    userName = "root"
    password = "root"
    packageName = "com.openxu.autobean"   //实体类输出目录
}

dependencies {
	...
	//lombok自动资源管理，可以为JavaBean自动生成getter、setter、equals、hashCode和toString等等
    // https://mvnrepository.com/artifact/org.projectlombok/lombok
    implementation group: 'org.projectlombok', name: 'lombok', version: '1.18.12'
}
```




