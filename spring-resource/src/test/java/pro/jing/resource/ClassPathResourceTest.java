package pro.jing.resource;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClassPathResourceTest {

	@Test
	public void testClassPathResource() throws IOException {
		Resource resource = new ClassPathResource("jdbc.properties");
		if (resource.exists()) {
			System.out.println("resource.getDescription(): "+resource.getDescription());
			System.out.println("resource.getURI(): " +resource.getURI());
			System.out.println("resource.getURI(): "+resource.getURL());
			System.out.println("resource.getURI(): "+resource.getFilename());
			System.out.println("resource.getURI(): "+resource.getClass());
		}
	
		Properties properties = new Properties();
		InputStream is = resource.getInputStream();
		properties.load(is);
		System.out.println(properties.getProperty("jdbc.username"));
		System.out.println(properties.getProperty("jdbc.password"));
		System.out.println(properties.getProperty("jdbc.driver"));
		System.out.println(properties.getProperty("jdbc.url"));
		is.close();
	}
}
