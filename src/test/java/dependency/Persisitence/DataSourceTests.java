package dependency.Persisitence;

import static org.junit.Assert.fail;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class DataSourceTests {
	
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
//	@Test
//	public void testConnection() {
//		try(Connection connection = dataSource.getConnection()){
//			log.info(connection);
//		}catch(Exception e) {
//			fail(e.getMessage());
//		}
//	}
	
	
	//sqlSessionFactory를 통해 connection객체를  가지고 오는지 확인하는 테스트(mapper쪽에서 기본적인 세팅 완료)
	@Test
	public void testConnection() {
		try
		(		//true를 사용해야 auto commit이 된다
			SqlSession sqlSession = sqlSessionFactory.openSession(true);
				Connection connection = sqlSession.getConnection();
		){
		 log.info(sqlSession);
		 log.info(connection);
		}catch(Exception e) {
			fail(e.getMessage());
		}
	}
	
	

}
