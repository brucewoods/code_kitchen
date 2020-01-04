

    <footer class="footer middle">
        <div class="container">
        
            <p class="text-muted">@2016 btZEI <a href="{{.Url}}">关于{{.Site}}</a> <a href="#">盗亦有道</a> <a href="{{.Url}}trends">赃物热榜</a></p>    
            {{str2html .StatCode}}
        </div>
    </footer>
    
    
    <script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
	   <!--script src="{{.Url}}assets/js/freewall.js"></script-->
    <script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <script src="//cdn.bootcss.com/clipboard.js/1.5.10/clipboard.min.js"></script>

    <script type="text/javascript">
 /*$(function() {
      var wall = new Freewall("#container");
      wall.fitZone();
    }); */
	 
        function getUrlParameter(sParam) {
            var sPageURL = decodeURIComponent(window.location.search.substring(1)),
                sURLVariables = sPageURL.split('&'),
                sParameterName,
                i;

            for (i = 0; i < sURLVariables.length; i++) {
                sParameterName = sURLVariables[i].split('=');

                if (sParameterName[0] === sParam) {
                    return sParameterName[1] === undefined ? true : sParameterName[1];
                }
            }
        };        
        window.onload = function() {
            document.getElementById("search").focus();
        };
        $("#search").keypress(function() {
            if (event.which == 13) {
                onSearch(search, 1, "")
            }
        });
        function getApiAddress(){
            return "{{.ApiUrl}}";
        }
        
        function onSearch(id, page, order) {
            var keyword = $(id).val();
            console.log(keyword,1);
            if (keyword === "") {
                return;
            }
		
            console.log("search.php?keyword=" + keyword + "&page=" + page + "&order=" + order);
            window.location.href = "/q/_"+ keyword.replace(/ /g,'+');
        }
        
        var clipboard = new Clipboard('#btnCopy')
        clipboard.on('success', function(e) {
            $('#btnCopy').tooltip('show');
            setTimeout(sharedModal, 1000);
        })
        $('#btnCopy').on('hidden.bs.tooltip', function() {
            $('#btnCopy').tooltip('destroy');
        })

        window.onload = function() {
            document.getElementById("search").focus();
        };
        keyword = getUrlParameter("keyword")
        $("#search").val(keyword);
        $("#search").keypress(function() {
            if (event.which == 13) {
                onSearch(search, 1, "");
            }
        });
        $(function(){
			$('#search').val('{{.Keyword}}');
		})
    </script>
	
<script>window._bd_share_config={"common":{"bdSnsKey":{},"bdText":"","bdMini":"2","bdMiniList":false,"bdPic":"","bdStyle":"2","bdSize":"16"},"slide":{"type":"slide","bdImg":"5","bdPos":"right","bdTop":"202.5"}};with(document)0[(getElementsByTagName('head')[0]||body).appendChild(createElement('script')).src='http://bdimg.share.baidu.com/static/api/js/share.js?v=89860593.js?cdnversion='+~(-new Date()/36e5)];</script>
    <script src="{{.Url}}assets/js/list.js"></script>
    <script src="{{.Url}}assets/js/string.js"></script>
</body>

</html>