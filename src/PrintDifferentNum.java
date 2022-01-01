import java.util.Scanner;
public class PrintDifferentNum {
	//private static final String times = null;
	//private static final String newNum = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		int size=10;
		int[] num=new int[size];
		int n;
		int i=0;
		int times = 0;//互不相同的数的个数
		int[] newNum=new int[size];
		while(i<10) {
			n=input.nextInt();
			num[i]=n;
			i++;
		}
		for(int x=0;x<10;x++) {
			if(num[x]>0) {
				newNum[x]=num[x];
				times++;
				for(int y=x+1;y<i;y++) {
					if(num[y]==num[x]) {
						num[y]=-num[y];
					}
				}
			}
		}
		System.out.println("The number of distinct number is "+times);
		System.out.print("The distinct numbers are: ");
		for(int j=0;j<10;j++) {
			if(newNum[j]>0) {
				System.out.print(newNum[j]+" ");
			}
		}
		input.close();
	}

}
