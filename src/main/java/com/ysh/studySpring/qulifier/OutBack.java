package com.ysh.studySpring.qulifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("outback")
public class OutBack implements Restarant {

	@Override
	public boolean hasSalad() {
		// TODO Auto-generated method stub
		return false;
	}

}
