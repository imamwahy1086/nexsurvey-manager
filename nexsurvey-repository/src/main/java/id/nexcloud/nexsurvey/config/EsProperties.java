package id.nexcloud.nexsurvey.config;

import javax.annotation.PostConstruct;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import lombok.Data;

@Data
@Configuration
@ConfigurationProperties
@PropertySource("classpath:nexsurvey-es.properties")
public class EsProperties {

	private ElasticSearch elasticSearch;

	@PostConstruct
	void init() {
		System.setProperty("es.set.netty.runtime.available.processors", "false");
	}

	@Data
	public static class ElasticSearch {
		private boolean enable;
	}

}
