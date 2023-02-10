package dependency;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ysh.studySpring.dependency.Restaurant;
import com.ysh.studySpring.qulifier.OutBack;
import com.ysh.studySpring.qulifier.Restarant;
import com.ysh.studySpring.qulifier.Vips;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class) // 어떤 프로그램으로 테스트를 돌릴지 알려줘야 한다.
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml") // rootContext 위치를 알려주어야 한다.
@Log4j // 해당 객체를 통해 에러, 자동줄바꿈등 로그 객체를 출력하여 보기 위해 써주어야 한다.
public class QualifierTests {
//	@Autowired
//	@Qualifier("lapTop") 
//	private Computer lapTop; // 단위 테스트는 필드 주입
//
//	@Test
//	public void testQualifier() {
//		log.info("=================");
//		log.info("computer : " + lapTop);
//		log.info("screen width : " + lapTop.getScreenWidth());
//		log.info("=================");
//	}
	
	@Autowired
	@Qualifier("outback")
	private Restarant outback;
	
	@Qualifier("vips")
	@Autowired
	private Restarant vips;
	
	@Autowired
	private Restarant restaurant;
	
	@Test
	public void testQualifier() {
		log.info("=================");
		log.info("outback : " + outback);
		log.info("outback salad: " + outback.hasSalad());
		log.info("steak price: " + OutBack.steak);
		log.info("=================");
		
		log.info("=================");
		log.info("vips : " + vips);
		log.info("vips salad: " + vips.hashCode());
		log.info("steak price: " + Vips.steak);
		log.info("=================");
		
		
		log.info("=================");
		log.info("vips : " + restaurant);
		log.info("vips salad: " + restaurant.hashCode());
		log.info("steak price: " + Restarant.steak);
		log.info("=================");
		
	}
	
	
	
	
}
