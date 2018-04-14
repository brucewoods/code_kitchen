# -*- coding: UTF-8 -*-
import scrapy
from bs4 import BeautifulSoup
import string
import codecs
class OutdoorSpider(scrapy.Spider):

     name="outdoor"

     def start_requests(self):
         
         url='http://www.asian-outdoor.com/index.php?m=Search&a=exhibitor'
           
         

         yield scrapy.Request(url=url,callback=self.parse)

#  print(response.css('h3.search-details-name::text').extract())
#   page=response.url.split("/")[-1]
#         filename='ex-%s.html' % page
#         with open(filename,'wb' ) as f:
#              f.write(response.css('h3.search-details-name::text').extract())
#              self.log('saved file %s' % filename)
     def parse(self,response):
        url="http://www.asian-outdoor.com/index.php?m=Search&a=getExhibitor&id="
        with open('outdoor.htlm','wb') as f:
            f.write(response.body)
        ids=response.xpath('//a/@data-id').extract()
        for d in ids:
            yield scrapy.Request(url=url+str(d),callback=self.parse_detail)
     def parse_detail(self,response):
         print('detail processing')
         print(response.xpath('//dt//text()').extract_first(default="not-found")) 
         print(response.xpath('//dt//text()').extract_first(default="not-found")) 
         bea=BeautifulSoup(str(response.body,'utf-8'),'html.parser')
      
         def   jl(item,le):
                   if  len(item)>le:
                       return  item[le].get_text()
                   else :
                    return " " 
         yield {
               'name':response.css('dt::text').extract_first(default='not-found'),
              'booth':jl(bea.find_all('dd'),0),
              'address':jl(bea.find_all('dd'),2),
             'phone': jl(bea.find_all('dd'),5),
                'fax':jl(bea.find_all('dd'),6),
               'email':jl(bea.find_all('dd'),7),
                'website':jl(bea.find_all('dd'),1),
               'bio':jl(bea.find_all('dd'),8),
                "contact":jl(bea.find_all('dd'),4),
                "postcode":jl(bea.find_all('dd'),3)
               }


        
    


         
   

        #  yield{
        #        'name':response.css('h3.search-details-name::text').extract(),
        #       'booth':jl(response.css('p.search-details-booth-number::text'),0),
        #       'address':jl(response.css('p.search-details-txt::text'),0),
        #      'phone': jl(response.css('p.search-details-txt::text'),1),
        #         'fax':jl(response.css('p.search-details-txt::text'),2),
        #        'email':jl(response.css('p.search-details-txt a  ::text'),0),
        #         'website':jl(response.css('p.search-details-txt a  ::text'),1),
        #        'bio':jl(response.css('div.search-details-introduce-box div::text'),0),
        #        }
    
     