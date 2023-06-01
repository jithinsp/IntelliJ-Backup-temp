//Variables
var count4 = 0, count5 = 0, count6 = 0;

//Counter function
function counter_fast(cnt, n, id){
    setInterval(function(){
    if (cnt < n){
        cnt++;
        document.getElementById(id).innerText = cnt;
    }
},110);
}

function counter_slow(cnt, n, id){
    setInterval(function(){
    if (cnt < n){
        cnt++;
        document.getElementById(id).innerText = cnt;
    }
},150);
}


function fade(){
    document.getElementById("perf-text").classList.add("cssanimation", "sequence", "fadeInBottom");
    document.getElementById("perform-text").classList.add("cssanimation", "sequence", "fadeInBottom");
}

//For Falcon Heavy
document.getElementById("counter4").addEventListener("scroll", counter_fast(count4, 2, "counter4"));
document.getElementById("counter4").addEventListener("scroll", counter_slow(count4, 3, "counter4"));

document.getElementById("counter5").addEventListener("scroll", counter_fast(count5, 3, "counter5"));
document.getElementById("counter5").addEventListener("scroll", counter_slow(count5, 7, "counter5"));

document.getElementById("counter6").addEventListener("scroll", counter_fast(count6, 2, "counter6"));
document.getElementById("counter6").addEventListener("scroll", counter_slow(count6, 4, "counter6"));


//For getting position and animating
$(document).ready(function(){
    $(window).scroll(function(){
        var posTop = $(document).scrollTop();
        // console.log(posTop) //&&(posTop <=1600);
        if (posTop >= 1250){
            $("#perf-text").addClass("cssanimation sequence fadeInBottom").fadeIn();
            $("#perform-text").addClass("cssanimation sequence fadeInBottom").fadeIn();
        }
        
        if (posTop >= 1750){
            $(".info").addClass("cssanimation sequence fadeInBottom").fadeIn();
        }
        
    });
});