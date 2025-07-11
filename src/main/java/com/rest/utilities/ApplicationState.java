package com.rest.utilities;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value="application",proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ApplicationState {
	 private Integer state=0;
	  
	  public Integer getState() {
		  return state;
	  }
	  
	  public void setState() {
		  this.state++;
	  }
}
