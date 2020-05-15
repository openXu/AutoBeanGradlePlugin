package com.openxu.autobean

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Author: openXu 
 * Time: 2020/5/15 11:07
 * class: AutoBeanPlugin
 * Description: 自定义Gradle插件，根据数据源自动生成JavaBean
 */
class AutoBeanPlugin  implements Plugin<Project> {
    @Override
    void apply(Project project) {
        // 创建一个名为beanDataSource的扩展，在build.gradle中配置它
        def beanDataSource = project.extensions.create('beanDataSource', BeanDataSource.class)
        // 创建一个名为autoBean的任务，用于读取Mysql数据，自动创建bean
        project.task("autoBean", type:AutoBeanTask, group:"help")
        project.tasks.getByName("autoBean").doFirst {
            //将配置信息作为Task的参数
            ext.beanDataSource = beanDataSource.build()
        }
    }
}
