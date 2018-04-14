# -*- coding: UTF-8 -*-
import scrapy
from scrapy.selector import Selector
from bs4 import BeautifulSoup
import json
import random
from scrapy.http import FormRequest
import codecs
import time
class SecondSpider(scrapy.Spider):

     name="second"
     current_index=0
     wrongs=[]
     def start_requests(self):
      
         url='http://messefrankfurt.kenti-creative.com/modules/exhibitor/ajax/more2.php?moduleId=129&pageName=list2&pId=14&yId=0&hId=0&uId=-2&cId=undefined&aId=-1&fId=0&plang=3'
         urls = [
            'http://messefrankfurt.kenti-creative.com/index.php?moduleId=129&pageName=list2&pId=14&plang=3',
            'http://messefrankfurt.kenti-creative.com/index.php?moduleId=129&pageName=list2&pId=14&plang=3',
            'http://messefrankfurt.kenti-creative.com/index.php?moduleId=129&pageName=list2&pId=14&plang=3',
            'http://messefrankfurt.kenti-creative.com/index.php?moduleId=129&pageName=list2&pId=14&plang=3',
          
             ]
         for  u in urls:
             time.sleep(.5)  #im trying to visit this url many times to tell server what  
             #language should be used!  maybe that server uses session to controll language.
             yield scrapy.FormRequest(u, callback=self.parse_m,
                                 method='POST')
      
         for  i in range(5):
             form_data={"page":"%s" % i}
             self.current_index=i
             yield scrapy.FormRequest(url, callback=self.parse,
                                 method='POST', formdata=form_data)
         print(self.wrongs)
     def  parse_m(self,response):
         with open('mother%s.html'% random.randint(3,90) ,'wb') as f:
             f.write(response.body)

     def parse(self,response):
        body=str(response.body).replace("\\","")
        
        if "No more exhibitor" in str(response.body):
          line=str(self.current_index) + "\n\n" 
          with open ('s.json','wb') as f:
              f.write(line.encode('utf-8'))
          self.wrongs.append(self.current_index)
        # newbody=Selector(text=body)  
        # less=newbody.css('div.companyLess')
        # more=newbody.css('div.companyMore')
        pa=BeautifulSoup(body,'html.parser')
       
        find=pa.find_all("div",class_="companyMore")
     
        print('$$$$$$$$$$$$$$$$$')
        for c in  find  :
          def   jl(loc):
                   return  c.find('td',text=loc).find_next().text if c.find('td',text=loc) else ''
        
         
          print(c.find('td',text="Address:").find_next().text if c.find('td',text="Address:") else '')
          yield{
               'name':c.find_previous_sibling('div').div.text,
              'booth':c.find_previous_sibling('div').find_all('span')[2].text,
              'address':jl("Address:"),
             'phone': jl("Tel Number:"),
                'fax':jl("Fax Number:"),
               'email':jl("E-mail:"),
                'website':jl("Website:"),
               'bio':jl("Product group:"),
               }
      

        
        print('##################') 
        

    
    
     