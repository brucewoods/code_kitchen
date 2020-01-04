package controllers

import (
   	"github.com/astaxie/beego"
	"github.com/astaxie/beego/httplib"
	"github.com/bitly/go-simplejson"
    "fmt"
	"strings"
)

type DetailController struct {
	BaseController
}

func (c *DetailController) Get() {
  title:=beego.AppConfig.String("title")
     keywords:=beego.AppConfig.String("keywords")
     suffix:=beego.AppConfig.String("suffix")
     api:=beego.AppConfig.String("api")
        id :=c.Ctx.Input.Param(":id")
	 filter:=beego.AppConfig.String("filter")
	
	if strings.Contains(filter,id){
	  c.Redirect("/",302)
	}
   req:=httplib.Get(api+"detail?id="+id)
   str,_:=req.String()
    
   if str==""{
      c.Redirect("/",302)
   }
  
   fmt.Println("str json",str)
   
   raw := `{"Torrent":[`+str+`]}`
   
   fmt.Println("str json2",raw)
   js, _ := simplejson.NewJson([]byte(raw))
   name,_:=js.Get("Torrent").GetIndex(0).Get("Name").String();
    data:=js.Get("Torrent").MustArray()
	c.Data["Website"] = "beego.me"
	c.Data["Email"] = "astaxie@gmail.com"
   
	c.Data["model"]=data[0]
	c.Data["Title"]=name+"_"+title+"_"+suffix
	c.Data["Keywords"]=name+","+keywords
}
