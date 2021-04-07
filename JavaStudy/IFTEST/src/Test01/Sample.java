package Test01;

public class Sample {
	public static void main(String[] args) {
		int[] data = {34,31};


		System.out.print("前＝"+data[0]+",");
		System.out.println(data[1]);

		//ソート
		if(data[0] > data[1]){
			//box =34 data[0]=34 data[1]=31
			int box = data[0];
			//box =34 data[0]=31 data[1]=31
			data[0] = data[1];
			//box =34 data[0]=31 data[1]=34
			data[1] = box;
		}


		System.out.print("後＝"+data[0]+",");
		System.out.println(data[1]);
	}
}
