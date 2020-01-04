{{template "share/header.tpl" .}}

    <div class="container-fluid content">
        <div class="index-header">
            <nav>
                <!-- <a href="index.html"><img src="assets/img/header.jpg" /></a> -->
                <div class="navbar-right trend">
                    <!--<a href="{{.Url}}ranking.php">热门排行</a>-->
                </div>
            </nav>
        </div>
        <div class="row">
            <div class="col-xs-6 col-md-3"></div>
            <div class="col-xs-6 col-md-6">
                <div class="middle">
                    <div class="logo">
                        <a href="{{.Url}}"><img src="{{.Url}}assets/img/logo.jpg" alt="{{.Title}}" /></a>
                    </div>
                <div class="middle title">
                        <p>BT贼（比特贼）首创无病毒、无弹窗、无恶意广告的BT搜索平台</p>
                    </div>
                    <input type="text" class="form-control input-lg input-search square" id="search" name="q" placeholder="嘘。。 你要偷什么？">
                    <div class="recommend" id="recommend-list">
                 <!--      {{range .rec}}
                              <a href='/q/_{{.Name}}'><span>{{.Name}}</span></a>
                       {{end}}  -->          
	{{range  $index,$element:=.rec2}}
		    {{if le $index 12 }}
                            <a href='/q/_{{$element.keyword}}'>{{$element.keyword}}</a>
							   {{end}}
                       {{end}}    					   
                    </div>
                </div>
                <div class="middle search">
                    <button type="submit" class="btn btn-lg btn-success square index-search-btn" onclick="onSearch(search,1,'')">妙手空空</button>
                    <!--button type="submit" class="btn btn-lg btn-success square index-search-btn" onclick="location.href='http://www.btzei.com/bt/d4daf406d0aa3dbb523fdb636a5eb8cca789ec2b.html'">福利贼落下的宝箱</button-->
                </div>
            </div>
            <div class="col-xs-6 col-md-3"></div>
        </div>
    </div>
{{template "share/footer.tpl" .}}