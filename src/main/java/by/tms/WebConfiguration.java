package by.tms;

import by.tms.controller.TestInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;



@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "by.tms")
public class WebConfiguration extends WebMvcConfigurerAdapter {

	@Autowired
	private TestInterceptor testInterceptor;

	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
		internalResourceViewResolver.setSuffix(".jsp");
		internalResourceViewResolver.setPrefix("/pages/");
		return internalResourceViewResolver;
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(testInterceptor)
				.addPathPatterns("/hello/**");
//		registry.addInterceptor(testInterceptor)
//				.addPathPatterns("/hello/world").order(2);
	}


}
