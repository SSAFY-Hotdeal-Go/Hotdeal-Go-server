package com.budge.hotdeal_go.exception;

public class NoticeException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public NoticeException() {
		super("공지사항 관련 오류");
	}
}
