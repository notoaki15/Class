class pen{
	void show(){
		System.out.println("これはボールペンです");
	}
}

class pen2 extends pen {
	void show2(){
		System.out.println("これは３色ボールペンです");
	}
}/////class pen を継承

class main{
	public static void main(String[]args){
		pen2 pen2 = new pen2();///class pen を継承した pen2 のインスタンスを生成
		
		pen2.show();
		pen2.show2();
	}
	}
