package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ysh.studySpring.domain.vo.TestVo;

@Mapper
public interface TestMapper {
	
	public List<TestVo> getList();
	
}
