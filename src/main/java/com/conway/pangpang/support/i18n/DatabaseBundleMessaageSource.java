package com.conway.pangpang.support.i18n;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.springframework.context.support.AbstractMessageSource;

public class DatabaseBundleMessaageSource extends AbstractMessageSource{

	private final Map<String, Map<Locale, MessageFormat>> cachedBundleMessageFormats = 
			new HashMap<String, Map<Locale, MessageFormat>>();
	
	private DatabaseBundle bundle;

	@Override
	protected MessageFormat resolveCode(String code, Locale curLocale) {
		
		synchronized (this.cachedBundleMessageFormats){
			
			Map<Locale, MessageFormat> localeMap = cachedBundleMessageFormats.get(code);
			if(localeMap != null){
				return localeMap.get(curLocale);
			}
			
			MessageFormat result = null;
			Map<Locale, String> messages = bundle.getString(code);
			for(Locale locale : messages.keySet()){
				MessageFormat msgFormat = createMessageFormat(messages.get(locale), locale);
				localeMap.put(locale, msgFormat);
				if(locale.equals(curLocale)){
					result = msgFormat;
				}
			}
			return result;
		}
	}
	
	protected MessageFormat createMessageFormat(String msg, Locale locale) {
		return new MessageFormat((msg != null ? msg : ""), locale);
	}

}
