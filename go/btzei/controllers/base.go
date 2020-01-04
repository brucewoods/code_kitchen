package controllers

import (
	"github.com/astaxie/beego"
    // "strings"
	"math"
	"strconv"
	 "encoding/json"
	"strings"
	 "time"
	 "fmt"
	 "regexp"
)


type BaseController struct {
	beego.Controller

}

func (this *BaseController) Prepare() {
    
     PageTitleProcess(this)
	// beego.AddFuncMap("url",UrlProcess)
	 beego.AddFuncMap("cut",TItleProcess)
	 beego.AddFuncMap("siz",FileSizeProcess)
	 beego.AddFuncMap("tim",TimeProcess)
	 beego.AddFuncMap("low",LowercaseHash)
	 beego.AddFuncMap("add",AddIndex)
}
func (c *BaseController) Finish() {
    
   
  

	
}
//test sync
// func  UrlProcess(in string)(out string){  
      // s:=strings.Split(in,"?p=")
	  // fmt.Println(s)
	  // if(len(s)>1){
	     // out=strings.Replace(s[0],"/_",s[1]+"/_",1)
	  // }
	  // out=s[0]
    // return
// }
func AddIndex(in int)(out int){
  out=in+1
  return
}
 func  TItleProcess(in string)(out string){
    // in=strings.Replace(in,"&lt;","<",-1)
    // in=strings.Replace(in,"&gt;",">",-1)
	// if len(in)>100{
    // out=in[:100]+"..."
	// }else{
	out=in
	//}
	return
 }
 func TimeProcess(in string)(out string){
    pattern:="2016-09-04T15:58:57.613877644+08:00"
	//in="2016-09-02T00:00:57.613877644+08:00"
   t,_:=time.Parse(pattern,in)
   now:=time.Now()
   d:=now.Sub(t)
   minutes:=d.Minutes()
   //fmt.Println("mintest ::::|",strconv.FormatFloat(minutes,'f',3,64))  
   if(minutes<6){
    out="刚刚"
	return
   }
  if(minutes<60*24){
   out=strconv.Itoa(int(minutes/60))+"小时前"
   return
  }
  if(minutes<60*24*6){
  out=strconv.Itoa(int(minutes/60*24))+"天前"
  return
  }else{
    out=in[:10]
  return
  }

 }
 func FileSizeProcess(in  json.Number) (out string){
    str:=string(in)
    s,_:=strconv.Atoi(str)
	f:=float64(1024);
	 if s> (1024 * 1024 * 1024){
	  out=strconv.FormatFloat((float64(s)/f/f/f),'f',2,64)+"GB"
	  return
	 }
    if s> (1024* 1024){
	 out=strconv.FormatFloat((float64(s)/f/f),'f',2,64)+"MB"
	   return
	}
	if s> 1024{
	 out=strconv.FormatFloat((float64(s)/f),'f',2,64)+"KB"
	   return
	}
	out=strconv.FormatFloat(float64(s),'f',2,64)+"Byte"
	return
 }
 func Round(val float64, roundOn float64, places int ) (newVal float64) {
	var round float64
	pow := math.Pow(10, float64(places))
	digit := pow * val
	_, div := math.Modf(digit)
	if div >= roundOn {
		round = math.Ceil(digit)
	} else {
		round = math.Floor(digit)
	}
	newVal = round / pow
	return
}
func LowercaseHash(in string)(out string){
  out=strings.ToLower(in)
  return
}
func  PageTitleProcess(c *BaseController){
    
    
	url:= beego.AppConfig.String("url")
	hometitle := beego.AppConfig.String("hometitle")
	title := beego.AppConfig.String("title")
	site := beego.AppConfig.String("title")
	statcode := beego.AppConfig.String("statcode")
	description:= beego.AppConfig.String("description")
	keywords:=beego.AppConfig.String("keywords")
	api:= beego.AppConfig.String("api")
	suffix:= beego.AppConfig.String("suffix")
	 
	  keyword :=c.Ctx.Input.Param(":keyword")
     hash :=c.Ctx.Input.Param(":id")
	 reqpath:=c.Ctx.Request.URL.EscapedPath()
	 re := regexp.MustCompile("(/)+$")
	 fmt.Println("request path::::",reqpath)
	 if re.MatchString(reqpath){
	 title=hometitle
   
	 }
	 if keyword!=""{
	  title = keyword+"_"+keyword+"下载地址_"+keyword+"在哪下载_"+keyword+"哪里能下到_"+title+"_"+suffix;  
	  keywords=keyword+","+keywords
	 }
	if hash!=""{ 
	  if c.Data["Title"]!=nil{
	      title=(c.Data["Title"]).(string)+"_"+title+"_"+suffix
	      keywords=(c.Data["Title"]).(string)+","+keywords
	  }
	  
	}
	 
	c.Data["Url"] = url
	c.Data["Title"] =title
	c.Data["StatCode"] = statcode
	c.Data["Description"] = description
	c.Data["Keywords"] =keywords
	c.Data["ApiUrl"] = api
	c.Data["Suffix"] = suffix
	c.Data["Site"] = site

}
 