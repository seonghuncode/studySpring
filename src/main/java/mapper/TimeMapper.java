package mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

//Mapper 인터페이스 
//SQL을 작성하는 작업은 xml을 이용할 수도 있지만 , 최소한의 코드를 작성하기 위해서는 
//Mapper인터페이스를 작성한다.\

//@Mapper를 사용하기 위해서는 스캔이 필요하다(root-coiontext.xml -> nameSpace -> mybatis-spring 체크 + 코드 작성 필요)
@Mapper //xml과 연동하기 위한 어노테이션
public interface TimeMapper {
	
	//현재 db에 테이블이 없기 대문에 DB에 있는 데이터를 불러오는 것이 아니라 현재 시간을 불러오는 예시
	//java코드 내에서 쿼리 실행 가능 / 간단한 것은 여기에 작성하고 복잡한 쿼리문은 xml에 작성해라!!
	@Select("SELECT SYSDATE FROM DUAL")
	public String getTime(); //getRime이 실행되면 위의 쿼리가 실행된다.
	
	
	//위처럼 직접 쿼리를 작성하는 것이 아니라 xml에 있는 쿼리를 받아와 사용하는 방법
	public String getTime2();
}
