package pro.jing.resource;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;

public class ByteArrayResourceTest {

	@Test
	public void testByteArrayResource() {
		Resource resource = new ByteArrayResource("wa wa ~".getBytes());
		InputStream inputStream = null;
		if (resource.exists()) {
			try {
				//读取资源
				inputStream= resource.getInputStream();
				//资源操作
				byte[] descBytes = new byte[inputStream.available()];
				inputStream.read(descBytes);
				System.out.println(new String(descBytes));
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				if (inputStream != null)
					try {
						inputStream.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
			}
		}
		
	}
}
