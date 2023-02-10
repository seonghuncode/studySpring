package com.ysh.studySpring.dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Coding {
	
	//Computer computer = new Computer을 하면 의존성이 강하기 때무에 아래처럼 사용
	@Autowired  //서버가 실행되면 코딩이라는 것을 쓰면 spring이 자동으로 computer도 주입해준다.
	//편하게 주입이 가능하나 순환참조(무한루프)시 오류가 발생하지 않기 때문에 stackoverflow발생
	private final Computer computer;  //ex. 코딩을 하기 위해서는 computer가 필요하다 -> 의존성 관례
	//private를 사용해서 외부에서 직접 사용하지 못 하고 getter, setter를 통해 수정하도록 하는 것이 좋다.
	//final은 외부에서 접근 해서 수정을 하지 멋 하도록 사용

}
