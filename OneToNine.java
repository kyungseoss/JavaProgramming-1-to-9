import java.util.Random;
import java.util.Scanner;

/*
 * # 1 to 50[2단계] : 1 to 9
 * 1. arr배열에 1~9 사이의 숫자를 저장한다.
 * 2. shuffle을 통해 숫자를 섞는다.
 * 3. 사용자는 1부터 순서대로 해당 위치 값을 입력한다.
 * 4. 정답을 맞추면 해당 값은 0으로 변경되어 모든 값이 0이되면 게임은 종료된다.
 */

public class OneToNine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int arr[] = new int[9];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		for(int i=0; i<1000; i++) {
			int r = ran.nextInt(9);
			int temp = arr[0];
			arr[0] = arr[r];
			arr[r] = temp;
		}
		
		int number = 1;
		while(true) {
			System.out.println("[" + number + "]");
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i] + "\t");
				
				if(i%3==2) {
					System.out.println("\n");
				}
			}
			
			System.out.print("입력 : ");
			int idx = scan.nextInt();
			
			if(arr[idx]==number) {
				arr[idx] = 0;
				number +=1;
			}
			
			if(number==10) {
				break;
			}
			
		}
	}
}



