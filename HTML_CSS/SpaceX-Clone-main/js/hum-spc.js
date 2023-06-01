//For getting position and animating
//<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
//.earth-text, .sata-text, moon-text, mars-text; 
//800, 1500, 1900, 2700

$(document).ready(function(){
    $(window).scroll(function(){
        var posTop = $(document).scrollTop();
        //console.log(posTop);
        if (posTop >= 800){
            $(".earth-text").addClass("cssanimation sequence fadeInBottom").fadeIn();
        }

        if (posTop >= 1600){
            $(".sata-text").addClass("cssanimation sequence fadeInBottom").fadeIn();
        }

        if (posTop >= 2000){
            $(".moon-text").addClass("cssanimation sequence fadeInBottom").fadeIn();
        }

        if (posTop >= 2900){
            $(".mars-text").addClass("cssanimation sequence fadeInBottom").fadeIn();
        }
        
    });
});