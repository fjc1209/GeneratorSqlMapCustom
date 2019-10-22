import com.lyf.utlis.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestUser {
    SqlSession sqlSession = null;
    UserMapper mapper = null;
    @Before
    public void init() {
        sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        mapper = sqlSession.getMapper(UserMapper.class);
    }

    @Test
    public void selectById() {
        User user = mapper.selectById(41);
        System.out.println(user);
    }

    @After
    public void destroy() {
        sqlSession.close();
    }
}
