package controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Item;
import model.ItemDao;

public class ItmeViewController implements Controller {

	@Override
	public ModelAndView handle(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		int itemnumber = Integer.parseInt(request.getParameter("itemnumber"));
		
		boolean result = ItemDao.getInstance().updateRecordCount(itemnumber);
		System.out.println("count update....."+result);
		
		Item item = ItemDao.getInstance().getItem(itemnumber);
		System.out.println("get item....."+item.getItemnumber());
		
		//////////////// Cookie 생성과 다시 클라이언트로 보내기 ////////////////
		Cookie cookie = new Cookie("image"+itemnumber, item.getUrl());
		cookie.setMaxAge(24*60*60);	// 하루동안 저장됨.
		response.addCookie(cookie);
		
		request.setAttribute("item", item);
		ModelAndView mv = new ModelAndView();
		mv.setUrl("itemView.jsp");
		return mv;
	}

}