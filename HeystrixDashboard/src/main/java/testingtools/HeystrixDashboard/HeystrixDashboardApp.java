package testingtools.HeystrixDashboard;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@EnableHystrixDashboard
@ComponentScan
@EnableTurbine
public class HeystrixDashboardApp {
	public static void main(String[] args) {
		new SpringApplicationBuilder(HeystrixDashboardApp.class).web(true).run(args);
	}
}
