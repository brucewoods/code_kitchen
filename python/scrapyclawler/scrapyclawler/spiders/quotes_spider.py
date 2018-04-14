# -*- coding: UTF-8 -*-
import scrapy
 
class QuotesSpider(scrapy.Spider):

     name="quotes"

     def start_requests(self):
         
         urls=[
             'http://www.shanghaiamts.com/Exhibition/299.html',
           
         ]
         
         for i in range(300,1000):
             urls.append('http://www.shanghaiamts.com/Exhibition/'+str(i)+'.html')
         for url in urls:
             yield scrapy.Request(url=url,callback=self.parse)

#  print(response.css('h3.search-details-name::text').extract())
#   page=response.url.split("/")[-1]
#         filename='ex-%s.html' % page
#         with open(filename,'wb' ) as f:
#              f.write(response.css('h3.search-details-name::text').extract())
#              self.log('saved file %s' % filename)
     def parse(self,response):
         print(response.css('h3.search-details-name::text').extract()[0]+'$$$$$$$$$$$$$$$$$$$$$$$$$$$$$')
         
         def   jl(item,le):
                   if  len(item)>le:
                       return  item[le].extract()
                   else :
                    return " " 

         yield{
               'name':response.css('h3.search-details-name::text').extract_first(),
              'booth':jl(response.css('p.search-details-booth-number::text'),0),
              'address':jl(response.css('p.search-details-txt::text'),0),
             'phone': jl(response.css('p.search-details-txt::text'),1),
                'fax':jl(response.css('p.search-details-txt::text'),2),
               'email':jl(response.css('p.search-details-txt a  ::text'),0),
                'website':jl(response.css('p.search-details-txt a  ::text'),1),
               'bio':jl(response.css('div.search-details-introduce-box div::text'),0),
               }
    
     