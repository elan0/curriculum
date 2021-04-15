package Test01;

public class Sample {
	public static void main(String[] args) throws Exception {

		int[] data = { 3, 1, 2, 7, 5 };

		for (int i = 0; i < 20; i++) {
			System.out.println(i+"回目の繰り返し");

			/** この下は無視 */
			try {

				Thread.sleep(1000);




			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
