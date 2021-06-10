package 재시;

public class Jpg {
	public static void main(String[] args) {
		String[] arr = {"bb.jpg", "area.txt", "moomin.jpeg","work.txt","you.JPG"};
		String string;
		int cnt = 0;
		
		for(int i=0;i<arr.length;i++) {
			int index = arr[i].indexOf(".")+1;
			int endIndex = arr[i].length();
			string = arr[i].substring(index, endIndex);
			
			if(string.toUpperCase().equals("JPG") || string.toUpperCase().equals("JPEG")) {
				System.out.println(arr[i]);
				cnt++;
			}
		}
		System.out.println("이미지파일 수:" + cnt);
	}
}
