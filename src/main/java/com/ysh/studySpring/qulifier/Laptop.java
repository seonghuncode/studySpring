package com.ysh.studySpring.qulifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("lapTop")
public class Laptop implements Computer {

	@Override
	public int getScreenWidth() {
		// TODO Auto-generated method stub
		return 1280;
	}

}
