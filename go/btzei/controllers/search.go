package controllers

import (
     "golang.com.btzei/utils/pagination"
	"strings"
	"github.com/astaxie/beego"
	"github.com/astaxie/beego/httplib"
	"github.com/bitly/go-simplejson"

)

type SearchController struct {
	BaseController
}

func (c *SearchController) Get() {
     api:=beego.AppConfig.String("api")
        keyword :=c.Ctx.Input.Param(":keyword")
	   if keyword!=""{
	    keyword=strings.Replace(keyword,"%20","+",-1)
	   }
        page :=c.Ctx.Input.Param(":p")
	   if page==""{
	   page="1"
	   }
	    order :=c.Ctx.Input.Param(":order")
		if order==""{
		order="g"
		}
	  switch order{
		case "ho":
		order="h"
		case "siz":
		order="m"
		case "tim":
		order="l"
		} 
   beego.Notice("this is order value "+order)
   req:=httplib.Get(api+"list?keyword="+keyword+"&page="+page+"&order="+order)
   str,_:=req.String()
    
   if str==""{
     c.TplName = "searchcontroller/nil.tpl"
	 return
   }
  
   js, _ := simplejson.NewJson([]byte(str))
    data	:=js.Get("Torrent").MustArray()
  
	count,_:=js.Get("Count").Int()
	  pagination.SetPaginator(c.Ctx, 20, int64(count))	
	c.Data["Website"] = "beego.me"
	c.Data["Email"] = "astaxie@gmail.com"
	c.Data["data"]=data
	c.Data["count"]=count
	c.Data["Keyword"]=keyword
	
}
