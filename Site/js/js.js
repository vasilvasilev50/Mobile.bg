<script>
$(function(){
    
    var $cat = $("#category1"),
        $subcat = $("#category2");
    
    $cat.on("change",function(){
        var _rel = $(this).val();
        $subcat.find("option").attr("style","");
        $subcat.val("");
        if(!_rel) return $subcat.prop("disabled",true);
        $subcat.find("[rel="+_rel+"]").show();
        $subcat.prop("disabled",false);
    });
    
});
</script>