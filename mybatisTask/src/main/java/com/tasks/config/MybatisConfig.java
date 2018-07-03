package com.tasks.config;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInterceptor;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
public class MybatisConfig {

    @Autowired
    DataSource dataSource;

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean=new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);

        PathMatchingResourcePatternResolver resolver=new PathMatchingResourcePatternResolver();


        //如果重新定义SqlSessionFactory则需要自己添加分页插件，否则分页不生效
        Interceptor[] plugins=new Interceptor[]{pageHelper()};
        sqlSessionFactoryBean.setPlugins(plugins);
        //指定Mybatis的mapper文件所在位置
        sqlSessionFactoryBean.setMapperLocations(
                resolver.getResources("classpath:mapper/*.xml"));

        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    public PageInterceptor pageHelper(){
        /**
         * 这里用的PageHelper是5.1.4,需要引入PageInterceptor,并且不能添加
         * properties.put("dialect","mysql");
         * 如果用的PageHelper是4.X,则注入的应该是PageHelper
         */
        PageInterceptor pageHelper=new PageInterceptor();
        Properties properties=new Properties();
        properties.put("rowBoundWithCount","true");
        properties.put("reasonable","true");
        properties.put("offsetAsPageNum","true");
        pageHelper.setProperties(properties);
        return pageHelper;
    }

}
