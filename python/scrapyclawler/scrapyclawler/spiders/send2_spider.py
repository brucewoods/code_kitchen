# -*- coding: UTF-8 -*-
import scrapy
from scrapy.selector import Selector
from bs4 import BeautifulSoup
import json
import random
from scrapy.http import FormRequest
import codecs
import time
class Second2Spider(scrapy.Spider):

     name="second2"
     current_index=0
     wrongs=[]
     def start_requests(self):
         
        
        
         for  i in range(111):
             url='file:///F:/workspace/workstation/git/scrapyclawler/scrapyclawler/data/%s.html' % i
             self.current_index=i
             yield scrapy.FormRequest(url, callback=self.parse,
                                 method='GET')
         print(self.wrongs)
    
     def parse(self,response):
        body=str(response.body,'utf-8').replace("\\","")
        
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
        
         
          print(c.find('td',text="地址:").find_next().text if c.find('td',text="地址:") else '')
          yield{
               'name':c.find_previous_sibling('div').div.text,
              'booth':c.find_previous_sibling('div').find_all('span')[2].text,
              'address':jl("地址:"),
             'phone': jl("电话号码:"),
                'fax':jl("传真号码:"),
               'email':jl("邮件:"),
                'website':jl("网址:"),
               'bio':jl("产品类别:"),
               }
      

        
        print('##################') 
        

    
    
     