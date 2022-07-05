package com.springbook.ioc.injection;

import java.util.Map;
import java.util.Properties;

public class CollectionBean {
//	private Map<String, String> addressMap;
	private Properties addressPrt;
	
	public void setAddressPrt(Properties addressPrt) {
		this.addressPrt = addressPrt;
	}
	public Properties getAddressPrt() {
		return addressPrt;
	}
	
//	public void setAddressList(Map<String, String> addressList) {
//		this.addressMap = addressList;
//	}
//	
//	public Map<String, String> getAddressList() {
//		return addressMap;
//	}

}
