package routers

import (
	"golang.com.btzei/controllers"
	"github.com/astaxie/beego"
)

func init() {
 
    beego.Router("/", &controllers.MainController{})
    beego.Router("/q/:flag(_):keyword", &controllers.SearchController{}) 
    beego.Router("/q/:p:int/:flag(_):keyword", &controllers.SearchController{})
    beego.Router("/q/:order[a-z]+/:flag(_):keyword", &controllers.SearchController{})
    beego.Router("/q/:order[a-z]+:p:int/:flag(_):keyword", &controllers.SearchController{})
    beego.Router("/bt/:id.html", &controllers.DetailController{})
    beego.Router("/trends", &controllers.TrendsController{})
	beego.AutoRouter(&controllers.SearchController{})  
	beego.AutoRouter(&controllers.DetailController{})  
	beego.AutoRouter(&controllers.TrendsController{})  
}
