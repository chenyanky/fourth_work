import java.util.Scanner;
public class CountOfOccurrences {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the integers between 1 and 100: ");
		int size=100;
		int[] num=new int[size];
		int n;
		n=input.nextInt();
		num[0]=n;
		int i=1;
		while(n>0) {
			n=input.nextInt();
			if(n<0 || n>100) {
				System.out.println(n+" is ERROR");
			}
			num[i]=n;
			i++;
		}
		for(int x=0;x<i;x++) {
			int times=0;
			if(num[x]>0) {
				times=1;
				for(int y=x+1;y<i;y++) {
					if(num[y]==num[x]) {
						times++;
						num[y]=-num[y];
					}
				}
				if(times>1) {
					System.out.println(num[x]+" occurs "+times+" times");
				}
				else {
					System.out.println(num[x]+" occurs "+times+" time");
				}
			}
		}
		input.close();
	}

}
