//For getting position and animating
//<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
//.drag-eng, #astro-text; 1100, 2000


$(document).ready(function(){
    $(window).scroll(function(){
        var posTop = $(document).scrollTop();
        //console.log(posTop);
        if (posTop >= 1000){
            $(".eng-ship").addClass("cssanimation sequence fadeInBottom").fadeIn();
        }

        if (posTop >= 1600){
            $("#jpn-text").addClass("cssanimation sequence fadeInBottom").fadeIn();
        }
        
    });
});