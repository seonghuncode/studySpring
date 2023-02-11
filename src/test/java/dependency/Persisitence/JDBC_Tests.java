package dependency.Persisitence;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class JDBC_Tests {
	
	//해당 드라이버를 메모리에 올리는 코드, Oracle DB를 사용했을 경우  
	static {
		try {
			Class.forName("orcle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	//위해서 해당 메모리를 할당해주고 해당 주소를 적어주면 연결된다??
	@Test
	private void testConnection() {
		//외부 장치를 열었으면 자동으로 닫아주는 코드
		try(Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr")){
			log.info(connection);
			
		}catch(Exception e) {
			//junit의 메소드로 무조건 실패로 처리한 뒤 실행을 중지한다.
			fail(e.getMessage());
		}
	}

}
