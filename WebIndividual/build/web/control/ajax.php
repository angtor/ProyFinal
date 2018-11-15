$(document).on('change', '#st', function(e){
        var s=$('#st').val();
        alert(s);   //no value being shown with alert.
        $.ajax({
            url:"state_back.php",
            method:"post",
            data:{stid:s},
            dataType:"html",
            success:function(strMsg){
                alert(strMsg);
                $("#city").html(strMsg);
                }
            });
        });