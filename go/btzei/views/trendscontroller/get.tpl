{{template "share/header.tpl" .}}
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
                        <!--div class="navbar-right trend-list">
                            <a href="{{.Url}}ranking.php">热门排行</a>
                        </div-->
                    </div>
              </div>

          </nav>
      </div>
        <div class="row">
            <div class="col-xs-6 col-md-1"></div>
            <div class="col-xs-6 col-md-10">
                <div class="panel panel-default about">
                    <div class="panel-heading">
                        <h3 class="panel-title">近期热门</h3>
                    </div>
                    <div class="panel-body">
                        <table class="table table-condensed" id="trend-list">
                          <tr>
                            <td>编号</td> 
                            <td>名称</td>
                            <td>下载热度</td>
                            <td>资源大小</td>
                            <td>创建时间</td>
                          </tr>
						  {{range $index,$element :=.data}}
                     
                          <tr>
                         <td>{{ add $index}}</td>
                         <td><a href='/bt/{{.ID}}.html' title='{{.Name}}'>{{$element.Name}}</a></td>
                         <td>{{$element.Heat}}</td>
                         <td>{{siz $element.Length}}</td>
                         <td>{{tim $element.CreateTime}}</td>                        
                          </tr>
                       
						  {{end}}
                        </table>
                    </div>
                </div>
            </div>
            <div class="col-xs-6 col-md-1"></div>
        </div>
    </div>
{{template "share/footer.tpl" .}}