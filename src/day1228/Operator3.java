/*
쉬프트연산자
<< : left shift - 비트를 왼쪽으로 밀고 , 밀어서 빈칸을 항상 0으로 채움
>> : right shift - 비트를 오른쪽으로 밀고, 밀어서 빈칸을 항상 최상위 부호비트에 따라 양수:0/음수:1 로 채움
>>> : unsigned right shift - 비트를 오른쪽으로 밀고, 밀어서 빈칸이 항상 0으로 채움
*/
package day1228;

class Operator3 {
	public static void main(String[] args) {
		
		int i=5;
		System.out.println(i+" <<  3 =" + (i << 3));  
		//00000101 -> 00101000 (40)
		
		
		i=75;
		System.out.println(i+" >>  2 =" + (i >> 2));
		//0100 1011 -> 0001 0010 (18)
		
		
		i=29;
		System.out.println(i+" >>>  1 =" + (i >>> 1));
		//0001 1101 -> 0000 1110 (14)
		
		i=1;
		System.out.println(i+" <<  31 =" + (i << 31));		//int가 얻을수있는 최상위 음수값 -> 최상위 음수값+1= 양수값
		System.out.println(i+" << 32 =" + (i << 32));			//1
		System.out.println(i+" << 33 =" + (i << 33));			//2
        

		i=-1;
		System.out.println(i+" >>  5 =" + (i >> 5));			//-1
		System.out.println(i+" >>  50 =" + (i >> 50));		//-1
		System.out.println(i+" >>  5000 =" + (i >> 5000));	//-1

		System.out.println(i+" >>>  1 =" + (i >>> 1));		//unsigned right shift로 1칸이 밀리면 밀린 1칸에 0을 채워 양수로 변환
			

		
		i=6;
		//i << 3;	//0000 0110  -> 0011 0000 (32+16=48)

	}//main
}//class
