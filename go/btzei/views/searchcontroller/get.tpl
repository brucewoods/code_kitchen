
{{template "share/header.tpl" .}}
    <script src="{{.Url}}assets/js/list.js"></script>

    <div class="container-fluid content">
        <div class="header">
            <nav>
                <div class="navbar-header">
                    <!-- <h3 class="text-muted"><a href="index.html">Btlike</a></h3> -->
                    <a href="{{.Url}}"><img src="{{.Url}}assets/img/header.jpg" /></a>
                </div>
                <div class="collapse navbar-collapse">
                    <div class="navbar-form  search-title">
                        <input type="text"   class="form-control input-md input-search square search-title-input" id="search" placeholder="嘘。。 你要偷什么？">
                        <button class="btn btn-md btn-success search-btn square" onclick="onSearch(search,1,'')">妙手空空</button>
                      
                    </div>
                </div>

            </nav>
        </div>
        <div class="row  custom-panel">
            <div class="col-xs-6 col-md-1"></div>
            <div class="col-xs-6 col-md-7">
                <div class="row-fluid menu-nav">
                    <a href="{{.Url}}q/_{{.Keyword}}" id="order-x">相关度</a>
                    <a href="{{.Url}}q/hot/_{{.Keyword}}" id="order-h">下载热度</a>
                    <a href="{{.Url}}q/size/_{{.Keyword}}" id="order-m">文件大小</a>
                    <a href="{{.Url}}q/time/_{{.Keyword}}" id="order-l">创建时间</a>
                </div>
                </br>
                <div id="list-panel">
                   <p id="search-count"> 前方高能!搜索到 {{.count}} 个相关BT资源种子</p>
                    </br>
					{{range .data }}
    <h5><a href="{{.Url}}/bt/{{low .Infohash}}.html" class="result-title">{{str2html (cut .Name)}}</a></h5>
                    文件大小:<span class="listinfo">{{siz .Length}}</span>
                    下载热度:<span class="listinfo">{{.Heat}}</span>
                    文件数:<span class="listinfo">{{.FileCount}}</span>
                     <span class="listinfo">{{tim .CreateTime}}</span>
                    <p></p><br>
			
					
	{{end}}
               
                </div>
				  <nav>
		  
           {{if .paginator.HasPages}}
<ul class="pagination pagination">
    {{if .paginator.HasPrev}}
        <li><a href="{{.paginator.PageLinkFirst}}">贼头</a></li>
        <li><a href="{{.paginator.PageLinkPrev}}">&laquo;</a></li>
    {{else}}
        <li class="disabled"><a>贼头</a></li>
        <li class="disabled"><a>&laquo;</a></li>
    {{end}}
    {{range $index, $page := .paginator.Pages}}
        <li{{if $.paginator.IsActive .}} class="active"{{end}}>
              <a href="{{$.paginator.PageLink $page}}">BTZ {{$page}}</a>   
        </li>
    {{end}}
    {{if .paginator.HasNext}}
        <li><a href="{{.paginator.PageLinkNext}}">&raquo;</a></li>
        <li><a href="{{.paginator.PageLinkLast}}">鼠尾</a></li>
    {{else}}
        <li class="disabled"><a>&raquo;</a></li>
        <li class="disabled"><a>鼠尾</a></li>
    {{end}}
</ul>
{{end}}  
          </nav>
				
              
            </div>
            <div class="col-xs-6 col-md-4">
            </div>
        </div>
    </div>
{{template "share/footer.tpl" .}}