package co.micol.prj.board.vo;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CommentsVO {
	private int bId;
	private String bTitle;
	private String bContent;
	private String bWriter;
	private Date bDate;
	private int bHit;
	
}
