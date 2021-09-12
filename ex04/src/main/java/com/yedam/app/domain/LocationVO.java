package com.yedam.app.domain;

import lombok.Data;

@Data
public class LocationVO {
	private Long locationId;
	private String streetAddress;
	private String postalCode;
	private String city;
	private String stateProvince;
	private String countryId;
}
