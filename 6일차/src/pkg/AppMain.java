package pkg;

public class AppMain {
	static void print() {
		System.out.println("=====");
	}
	
	public static void main(String[] args) {
		Count count1 = new Count();
		Count.cnt1++;
		count1.cnt2++;
		
		Count count2 = new Count();
		Count.cnt1++;
		count2.cnt2++;
		
		Count count3 = new Count();
		Count.cnt1++;
		count3.cnt2++;
		
		System.out.println(Count.cnt1 +":"+count1.cnt2);
		System.out.println(Count.cnt1 +":"+count2.cnt2);
		System.out.println(Count.cnt1 +":"+count3.cnt2);
			
		
		print();
		
		System.out.println(DateUtil.curDate());
		
		ProjectInfo.uploadpath="/upload";
		System.out.println(ProjectInfo.name); //static
		
		ProjectInfo info = new ProjectInfo();//인스턴스필드는 객체생성해야 불러올 수 있음
		System.out.println(info.version);
		
		//ProjectInfo.name = "dddd";
		//System.out.println(ProjectInfo.name);
		
		//ProjectInfo info = new ProjectInfo();	//static=>new 해 줄필요없음. 클래스 이름(ProjectInfo)으로 바로 접근 가능 but 변경가능
		//info.name = "예성";
		//System.out.println(info.name);
	}

}
