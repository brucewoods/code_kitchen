# -*- coding: UTF-8 -*-
import scrapy
from scrapy.selector import Selector
from bs4 import BeautifulSoup
import json
import random
from scrapy.http import FormRequest
import codecs
import time
from tesserocr import PyTessBaseAPI
import urllib.request as req
class IndataSpider(scrapy.Spider):

     name="indata"
     current_index=0
     wrongs=[]
     def start_requests(self):
      
         url='http://www.indata3.com/mice-api/company/search/list'
      
         for  i in range(300):
             form_data={"page_id":"%s" % i}
             head_data={"Accept":"application/json","AID":"20170821071534bfrz6G227lXl7Clk","APIVER":"v1.0"}
             self.current_index=i
             yield scrapy.FormRequest(url, callback=self.parse,method='POST', formdata=form_data,headers=head_data)
         print(self.wrongs)

     def parse(self,response):
        with open('indata.json','wb') as f:
            f.write(response.body)
            pass
        json_object=json.loads(response.body_as_unicode())
        info_list=json_object["data"]
        print('$$$$$$$$$$$$$$$$$$$$$')
        print( json_object["data"][0]["company_name"] if json_object["data"] else '')
        def   convert_img2num(str):
               img=str+'.png'
               with PyTessBaseAPI() as api:
                   api.SetImageFile(img)
                   print('image processing and reading')
                   print(api.GetUTF8Text())
        for  c in info_list:
            image_url='http://www.indata3.com/mice-api/company-img/imageinfo?cid=%s&prop=company_phone' % c["company_long_id"]
            req.urlretrieve(image_url,'./pic2/'+c['company_long_id']+'.png')
            # convert_img2num(c['company_long_id'])
            yield {
                'id':c['company_long_id'],
               'name':c["company_name"],
              'booth':c["stand_no"],
              'address':c["company_address"],
             'phone': "",
                'fax':c["company_fax"],
               'email':c["company_email"],
                'website':c["company_website"],
               'bio':c["product_content"],
                "contact":"",
                "postcode":c["city_adcode"]
               }


    
    
     