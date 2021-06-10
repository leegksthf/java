package 재시;

public class Memo {
	protected int no;
	protected String data;
	protected String title;
	protected String content;
	
	public Memo() {}
	public Memo(int no, String data, String title, String content) {
		super();
		this.no = no;
		this.data = data;
		this.title = title;
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "Memo [no=" + no + ", data=" + data + ", title=" + title + ", content=" + content + "]";
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
