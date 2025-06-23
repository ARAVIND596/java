import java.util.Scanner;
class Sample{
	public static void main(String[] args){
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your amount : ");
		n=s.nextInt();
		String result=getn(n);
		System.out.println(result);
	}


  static String getn(int cash){
		if(cash<10){
			return "Sorry,cost of chips is 10 rupees";
		}else{
			int rem;
			rem=cash%10;
			 int chip=cash/10;
			if(rem!=0){
				return chip+" chips packets and the remaining balance ="+rem;
		}else{
			return chip+" chips packets Thank you for visit ";
		}
	}
}
}