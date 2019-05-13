package id.nexcloud.nexsurvey.config;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EnableTransactionManagement
//@EnableJpaAuditing(auditorAwareRef = "jpaEntityAuditor")
@EnableJpaRepositories("id.nexcloud.nexsurvey.repository.jpa")
//@EnableElasticsearchRepositories("id.nexcloud.nexsurvey.repository.es")
public class DataSourceConfiguration {

	private final Environment environment;

	@Autowired
	public DataSourceConfiguration(Environment environment) {
		this.environment = environment;
	}

	@Bean
	@ConfigurationProperties(prefix = "spring.datasource.hikari")
	public DataSource primaryDataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		final LocalContainerEntityManagerFactoryBean emfBean = new LocalContainerEntityManagerFactoryBean();
		emfBean.setDataSource(primaryDataSource());
		emfBean.setPackagesToScan(environment.getProperty("spring.jpa.properties.entity-base-package"));

		final HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		emfBean.setJpaVendorAdapter(vendorAdapter);

		emfBean.setJpaPropertyMap(additionalProperties());
		return emfBean;
	}

	@Bean
	public PlatformTransactionManager transactionManager(final EntityManagerFactory emf) {
		final JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(emf);
		return transactionManager;
	}
	private Map<String, Object> additionalProperties() {
		final Map<String, Object> properties = new HashMap<>();
		properties.put("hibernate.hbm2ddl.auto", environment.getProperty("spring.jpa.hibernate.ddl-auto"));
		properties.put("hibernate.id.new_generator_mappings",
				environment.getProperty("spring.jpa.hibernate.use-new-id-generator-mappings"));
		properties.put("hibernate.dialect", environment.getProperty("spring.jpa.properties.hibernate-dialect"));
		return properties;
	}

}
