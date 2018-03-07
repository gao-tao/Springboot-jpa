$(function(){
    var curWwwPath=window.document.location.href;
    var pathName=window.document.location.pathname;
    var pos=curWwwPath.indexOf(pathName);
     var curPath=curWwwPath.substring(0,pos);
    console.info(curPath);

   /* $("#button").click(function(){
        $.ajax({
            type: 'POST',
            url: curPath+"/login",
            data: {
                username:$("input[name='username']").val(),
                id:$("input[name='id']").val(),
            },
            success: function(){

            }
        });
    });*/

});


