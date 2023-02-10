package dependency;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ysh.studySpring.dependency.Coding;

import lombok.extern.log4j.Log4j;

//단위 테스트를 하는 파일로 서버(WAS)와 따로 생각한다.
//서버가 아니라 junit이라는 단위 테스트 프로그램을 돌려 콘솔만 찍는다. (WAS와 별개)
@RunWith(SpringJUnit4ClassRunner.class) // 어떤 프로그램으로 테스트를 돌릴지 알려줘야 한다.
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml") //rootContext 위치를 알려주어야 한다.
@Log4j //해당 객체를 통해 에러, 자동줄바꿈등 로그 객체를 출력하여 보기 위해 써주어야 한다.
public class dependencyTest {
	@Autowired
	private Coding coding; //Autowired를 통해 Coding이 어디있는지 자동으로 알려준다.
	
	@Test //사용하면 단위 테스트로 인식이 된다.
	public void checkDependencyInjection() {
		log.info("---------------------------");
		log.info("coding :" + coding);
		log.info("computer:" + coding.getComputer());
		log.info("---------------------------");
	}
}
