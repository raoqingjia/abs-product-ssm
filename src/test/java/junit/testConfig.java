package junit;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bboss.product.entity.CharacterEntity;
import com.bboss.product.service.interfaces.CharacterService;

public class testConfig {
	private ApplicationContext context;
    @Before
	public void init(){
	  context=new ClassPathXmlApplicationContext("classpath:spring-config.xml");
	}
    @Test
    public void test() {
      Object sqlSessionFactory = context.getBean("sqlSessionFactory");
      Assert.assertNotEquals(sqlSessionFactory, null);
      System.out.print(sqlSessionFactory);
    }
    @Test
    public void testBean() {
    	CharacterService impl= context.getBean("characterServiceImpl",CharacterService.class);
        System.out.print(impl);
        List<CharacterEntity> result= impl.findCharacter();
      
        for(int i=0;i<result.size();i++){
         System.out.println(result.get(i));	
        }
    }
    
//    public void closeBean() {
//    	context.close();
//    }
}
