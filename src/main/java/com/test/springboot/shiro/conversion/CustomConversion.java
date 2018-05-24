package com.test.springboot.shiro.conversion;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;


/**
 */
@Component
public class CustomConversion implements Converter<String, String>{

	public String convert(String source) {
		try {
			if (null != source) {
				source =source.trim();
				if (!"".equals(source)) {
					return source;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}