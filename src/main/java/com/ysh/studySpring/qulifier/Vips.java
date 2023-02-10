package com.ysh.studySpring.qulifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("vips") @Primary
public class Vips implements Restarant {

	@Override
	public boolean hasSalad() {
		// TODO Auto-generated method stub
		return true;
	}

}
