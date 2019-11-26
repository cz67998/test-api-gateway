package com.wangzhou.springboot_depth_study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.io.support.SpringFactoriesLoader;


@SpringBootApplication
public class SpringbootDepthStudyApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootDepthStudyApplication.class, args);
//		System.out.println(SpringFactoriesLoader.class.getResource(""));
//		System.out.println(SpringApplication.class.getClassLoader().getResource("org/springframework/boot/ApplicationArguments"));
//		Class primarySource=SpringbootDepthStudyApplication.class;
//		Class<?>[] primarySources=new Class[] { primarySource,primarySource };
//		for(Class c:primarySources){
//			System.out.println(c);
//		}
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpringbootDepthStudyApplication.class);
	}
}
