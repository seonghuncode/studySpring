package com.ysh.studySpring.dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
@Getter
public class Coding {
	
	//Computer computer = new Computer을 하면 의존성이 강하기 때무에 아래처럼 사용
	//@Autowired  //서버가 실행되면 코딩이라는 것을 쓰면 spring이 자동으로 computer도 주입해준다.
	//편하게 주입이 가능하나 순환참조(무한루프)시 오류가 발생하지 않기 때문에 stackoverflow발생
	private Computer computer;  //ex. 코딩을 하기 위해서는 computer가 필요하다 -> 의존성 관례
	//private를 사용해서 외부에서 직접 사용하지 못 하고 getter, setter를 통해 수정하도록 하는 것이 좋다.
	//final을 붙이면 다른 곳에서 변형이 가능 @Data를 사용하지 않으면 오류(필드주입만 할 경우 -> 생성자 주입 까지 해야 오류X)
	//-> 상수이기 대문에 생성가 동시에 주입을 해주어야 한다.(생성자는 값이 없어도 주입 가능)
	
	
	//Setter주입
	//편하게 주입이 가능하나 순환참조(무한 루프)시 오류가 발생하지 않기 때문에 stackoverflow발생
	//final을 붙일 수 없기 때문에 다른 고셍서 변형 가능
	//외부에서 직접 주입 가능
	//setter주입은 잘 사용하지 않는다.
	@Autowired
	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	
	
	//메모리에 필드를 올리고 주입을 받는 것 : setter, getter 주입 (올리고 나서 오류가 생기면 알 수없다.)
	//메모리에 올리면서 주입을 받는 것 : 생성자 주입
	
	
	
	//생성자 주입
	//순환 참조시 컴파일러가 인지 가능, 오류 발생
	//메모리에 할당하면서 초기값으로 주입되므로 final 키워드 사용 가능, 다른 곳 에서 변형 불가능 -> 안전하다
	//의존성 주입이 되지 않으면 객체가 생성되지 않으므로 (올리면서 주입을 받기 때문)
	@Autowired
	public Coding(Computer computer) {
		super();
		this.computer = computer;
	}  //@AllArgsConstructor 상단에 사용하면 생성자 코드를 작성 하지 않아도 자동으로 생성된다
	
	
	//위의 세가지 주입 중 가장 많이 사용되고 안전한 주입은 생성자 주입이다.

}
