package com.springbooks.biz.board;

import java.sql.Date;

import lombok.Data;

@Data
public class BoardVO {
	private int seq, cnt;
	private String title, writer, content, searchCondition, searchKeyword;
	private Date regDate;
}
