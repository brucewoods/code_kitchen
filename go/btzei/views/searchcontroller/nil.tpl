
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
                    <a href="{{.Url}}q/_" id="order-x">相关度</a>
                    <a href="{{.Url}}q/hot/_" id="order-h">下载热度</a>
                    <a href="{{.Url}}q/size/_" id="order-m">文件大小</a>
                    <a href="{{.Url}}q/time/_" id="order-l">创建时间</a>
                </div>
                </br>
                <div id="list-panel">
                   <p id="search-count"> 贼贼还没偷到这资源。搜索到 0 个相关BT资源种子</p>
                    </br>
			
               
                </div>
{{template "share/footer.tpl" .}}