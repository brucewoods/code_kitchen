package controllers

import (
   	"github.com/astaxie/beego"
	"github.com/astaxie/beego/httplib"
	"github.com/bitly/go-simplejson"
    "fmt"
)

type TrendsController struct {
	BaseController
}

func (c *TrendsController) Get() {
  title:=beego.AppConfig.String("title")
     keywords:=beego.AppConfig.String("keywords")
     suffix:=beego.AppConfig.String("suffix")
     api:=beego.AppConfig.String("api")
 
	   
	
   req:=httplib.Get(api+"trend")
   str,_:=req.String()
    
   if str==""{
     c.TplName = "DetailController/nil.tpl"
	 return
   }
  
   fmt.Println("str json",str)
   keywords="BT排行榜,BT搜索排行榜,BT下载排行榜"+keywords
   title="BT排行榜_BT搜索排行榜_BT下载排行榜_"+title+"_"+suffix
  
   js, _ := simplejson.NewJson([]byte(str))
   
    data:=js.MustArray()

   
	c.Data["data"]=data
	c.Data["Title"]=title
	c.Data["Keywords"]=keywords
}
