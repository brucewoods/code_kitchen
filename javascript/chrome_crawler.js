function req(i){
  
  $.post('http://messefrankfurt.kenti-creative.com/modules/exhibitor/ajax/more2.php?moduleId=129&pageName=list2&pId=14&yId=0&hId=0&uId=-2&cId=undefined&aId=-1&fId=0&plang=3',{page:i},function(rep){save(rep,i)}) 
}
function save(txt,i){
  var toDownload= new Blob([txt],{type:'x-whatever/x-backup'})
    saveFileOnUserDevice({content:toDownload,name:i+'.html'})
}
function crawling(){
  for(i=0;i<121;i++)
       req(i)
  
}
saveFileOnUserDevice = function(file){ // content: blob, name: string
        if(navigator.msSaveBlob){ // For ie and Edge
            return navigator.msSaveBlob(file.content, file.name);
        }
        else{
            let link = document.createElement('a');
            link.href = window.URL.createObjectURL(file.content);
            link.download = file.name;
            document.body.appendChild(link);
            link.dispatchEvent(new MouseEvent('click', {bubbles: true, cancelable: true, view: window}));
            link.remove();
            window.URL.revokeObjectURL(link.href);
        }
    }
    crawling()