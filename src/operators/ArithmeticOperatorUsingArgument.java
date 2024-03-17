package operators;

public class ArithmeticOperatorUsingArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input1=Integer.parseInt(args[0]);
		int input2=Integer.parseInt(args[1]);
		System.out.println(sum(input1,input2));
		System.out.println(sub(input1,input2));System.out.println(mul(input1,input2));
		System.out.println(div(input1,input2));
		System.out.println(mod(input1,input2));

		}
		static int sum(int a,int b){
		return b+a;
		}
		static int sub(int input1,int input2){
		return input1-input2;
		}

		static int mul(int input1,int input2){
		return input1*input2;
		}
		static int div(int input1,int input2){
		return input1/input2;
		}
		static int mod(int input1,int input2){
		return input1%input2;
		}



	}


