
public class ArmstrongOwn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<999;i++) {
			if(isArmstrong(i)) { System.out.println(i);}
		}

	}
	
	public static boolean isArmstrong(int n) {
		int temp, sum=0, digit=0;
		
		temp=n;
		while(temp>0) {
			temp = temp/10;
			digit++;
		}
		temp=n;
		while(temp>0) {
			int lastDigit=temp%10;
			sum += (int)Math.pow(lastDigit, digit);
			temp=temp/10;
		}
		if (sum==n) {
			return true;
		}else {
			return false;
		}
	}

}
