//#two-text, three-text, four-text, five-text
//1000, 2000, 2900, 3700

$(document).ready(function(){
    $(window).scroll(function(){
        var posTop = $(document).scrollTop();
        //console.log(posTop) //&&(posTop <=1600);
        
        if (posTop >= 800){
            $("#two-text").addClass("cssanimation sequence fadeInBottom").fadeIn();
        }

        if (posTop >= 1600){
            $("#three-text").addClass("cssanimation sequence fadeInBottom").fadeIn();
        }

        if (posTop >= 2300){
            $("#four-text").addClass("cssanimation sequence fadeInBottom").fadeIn();
        }
        
        if (posTop >= 3300){
            $("#five-text").addClass("cssanimation sequence fadeInBottom").fadeIn();
        }
        
    });
});









