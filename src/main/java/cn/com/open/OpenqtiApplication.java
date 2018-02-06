package cn.com.open;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@ServletComponentScan
@EnableCaching
@RefreshScope
@EnableDiscoveryClient
@EnableFeignClients
public class OpenqtiApplication {

	@RequestMapping(value = "/dnotdelet/mom.html", method = RequestMethod.GET)
	public String home() {
		return "<html><head><meta http-equiv='content-type' content='textml; charset=UTF-8'></head><body>helloworld!</body></html>";
	}

	public static void main(String[] args) {
		SpringApplication.run(OpenqtiApplication.class, args);
	}
}
