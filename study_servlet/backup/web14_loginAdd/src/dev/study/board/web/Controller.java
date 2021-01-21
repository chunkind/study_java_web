package dev.study.board.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Controller {
	String execute(HttpServletRequest req, HttpServletResponse res) throws Exception;
}
