package main

import (
	_ "golang.com.btzei/routers"
	"github.com/astaxie/beego"
)

func main() {
	beego.SetStaticPath("/assets","assets")	

	beego.Run()
}

