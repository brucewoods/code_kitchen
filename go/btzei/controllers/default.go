package controllers

import (
	"github.com/astaxie/beego"
		"github.com/astaxie/beego/httplib"
	"github.com/bitly/go-simplejson"
	"math/rand"
)

type MainController struct {
	BaseController
}

func (c *MainController) Get() {
     api:=beego.AppConfig.String("api")
req:=httplib.Get(api+"recommend")
//req2:=httplib.Get("http://top.baidu.com/mobile_v2/buzz?b=1465&c=36")

   str,_:=req.String()
 //str2,err:=req2.String()
    if str==""{
     c.TplName = "searchcontroller/nil.tpl"
	 return
   }
  
   js, _ := simplejson.NewJson([]byte(str))
   // js2,_:=simplejson.NewJson([]byte(str2))
    rec2	:=js.MustArray()
	// rec2:=js2.Get("result").Get("topwords").MustArray()
	 for i := range rec2 {
     j := rand.Intn(i + 1)
    rec2[i], rec2[j] = rec2[j], rec2[i]  
}
   //c.Data["rec"]=rec
	 c.Data["rec2"]=rec2  
	   c.TplName = "index.tpl"
}
