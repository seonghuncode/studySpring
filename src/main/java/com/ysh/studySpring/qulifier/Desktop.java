package com.ysh.studySpring.qulifier;



import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("deskTop")
public class Desktop implements Computer{
	
	@Override
	public int getScreenWidth() {
		return 1920;
	}

}
