package com.priti.springweb.healthchecks;




import org.springframework.boot.actuate.health.Health;

import org.springframework.boot.actuate.health.HealthIndicator;

public class CustomHealthIndicator implements HealthIndicator {

//
//	public Iterator<NamedContributor<HealthContributor>> iterator() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public Health health() {
		// TODO Auto-generated method stub
		boolean error=false;
		if(error) {
			return Health.down().withDetail("Error Key", 123).build();
		}
		return Health.up().build();
	}

}
