package pro.jing.aop.schema_based;

/**
 * 
 * @author Jing
 * @date Jun 13, 2018
 * @description aop target
 */
public class IncorrigiblyObstinateImpl implements IncorrigiblyObstinate {

	@Override
	public void obstinateMind() {
//		new Thread(() -> {
//			try {
//				System.out.println(" obstinate mind..");
//				Thread.sleep(1000);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}).start();
		System.out.println("obstinate mind...");
	}

	@Override
	public void obstinateMind(String word) {
		System.out.println(word);
	}

}
