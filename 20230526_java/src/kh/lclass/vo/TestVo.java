package kh.lclass.vo;

public class TestVo {
	private int boardNum;
	private String boardWriter;
	private String boardTitle;
	private String boardContent;
	private String boardDate;
	
	//생성자 TestVo tvo = new TestVo();    공간만들어줌 추상화의 일부분 초기화 
	public TestVo() {}
	
	//all arguments 생성자 == 초기값 설정 한덩어리로 묶어서 관리가능 
	
	public TestVo(int boardNum,String boardWriter,String boardTitle, String boardContent, String boardDate) {
		this.boardNum = boardNum;
		this.boardWriter = boardWriter;
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.boardDate = boardDate;
	}
	
	//getter
	
	public int getBoardNum() {
		return boardNum;
	}
	
	public String getBoardWriter() {
		return boardWriter;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public String getBoardDate() {
		return boardDate;
	}
	
	//setter
	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}
	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}
	public void setBoardTitle(String boardtitle) {
		this.boardTitle = boardtitle;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public void setBoardDate(String date) {
		this.boardDate = boardDate;
	}
	//toString

	@Override
	public String toString() {
		return "TestVo [boardNum=" + boardNum + ", boardWriter=" + boardWriter + ", boardTitle=" + boardTitle
				+ ", boardContent=" + boardContent + ", boardDate=" + boardDate + "]";
	}
	
		
	}
		

