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
                        <input type="text" class="form-control input-md input-search square search-title-input" id="search" placeholder="嘘。。 你要偷什么？">
                        <button class="btn btn-md btn-success search-btn square" onclick="onSearch(search,1,'')">妙手空空</button>
                        <!--div class="navbar-right trend-list">
                            <a href="{{.Url}}ranking.php">热门排行</a>
                        </div-->
                    </div>
                </div>
            </nav>
        </div>
        <div class="row  custom-panel">
            <div class="col-xs-6 col-md-1"></div>
            <div class="col-xs-6 col-md-8">
                <div class="panel panel-default">
                    <div class="panel-body" id="list-panel">
                        <h4><b id="title"><a href="magnet:?xt=urn:btih:{{low .model.Infohash}}" title="{{.model.Name}}">{{.model.Name}}</a></b></h4>
                        <p></p>
                        </br>
                        <div class="panel panel-default">
                            <div class="panel-heading">磁力链接</div>
                            <div class="panel-body">
                                <a href="magnet:?xt=urn:btih:{{low .model.Infohash}}" id="magnet" title="{{.model.Name}}">magnet:?xt=urn:btih:{{low .model.Infohash}}</a>
                                </br>
                                </br>
<!--                                <button class="btn btn-success btn-md infohash-button square" data-clipboard-text="" data-placement="bottom" id="btnCopy" title="已复制">
                                    复制链接
                                </button>-->
                                <a href="magnet:?xt=urn:btih:{{low .model.Infohash}}" title="{{.model.Name}}下载" type="button" class="btn btn-md btn-success infohash-button square" id="download">探囊取种</a>
                            </div>
                        </div>
                        <table class="table table-bordered">
                            <tr>
                                <td class="active">文件大小</td>
                                <td class="active">文件数量</td>
                                <td class="active">创建时间</td>
                            </tr>
                            <tr>
                                <td id="length">{{siz .model.Length}}</td>
                                <td id="file-count">{{.model.FileCount}}</td>
                                <td id="create-time">{{tim .model.CreateTime}}</td>
                            </tr>
                        </table>

                        <div class="panel panel-default">
                            <div class="panel-heading">部分文件</div>
                            </p>
                            <ul id="file-list">
                             {{range .model.Files}}
                                <li>{{.Name}} {{siz .Length}}</li>
                               
								{{end}}
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-xs-6 col-md-3"></div>
        </div>
    </div>
{{template "share/footer.tpl" .}}