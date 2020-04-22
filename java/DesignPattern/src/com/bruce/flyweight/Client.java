package com.bruce.flyweight;

public class Client {
	public static void main(String[] args) {
		//todo   more logics
     
		WebSiteFactory webSiteFactory=new WebSiteFactory();
		
	 WebSite site1=	webSiteFactory.getWebSiteCategory("news");
	 site1.Use(new User("tom"));
	 WebSite site2=	webSiteFactory.getWebSiteCategory("weixin");
	 site2.Use(new User("jim"));
	 WebSite site3=	webSiteFactory.getWebSiteCategory("blog");
	 site3.Use(new User("jack"));
	 WebSite site4=	webSiteFactory.getWebSiteCategory("blog");
	 site3.Use(new User("rubby"));
	 WebSite site5=	webSiteFactory.getWebSiteCategory("blog");
	 site3.Use(new User("brandon"));
	 
	 System.out.println(webSiteFactory.getWebSiteCount());
	}
}
