//Variables
var count1 = 0, count2 = 0,count3 = 0;

//Counter function
function counter_fast(cnt, n, id){
    setInterval(function(){
    if (cnt <= n){
        cnt++;
        document.getElementById(id).innerText = cnt;
    }
},1);
}

function counter_mid(cnt, n, id){
    setInterval(function(){
    if (cnt <= n){
        cnt++;
        document.getElementById(id).innerText = cnt;
    }
},100);
}


//For Falcon 9

//Part 1 of counter
document.getElementById("counter1").addEventListener("scroll", counter_fast(count1, 145, "counter1"));
document.getElementById("counter1").addEventListener("scroll", counter_mid(145, 164, "counter1"));

//Part 2 of counter
document.getElementById("counter2").addEventListener("scroll", counter_fast(count2, 100, "counter2"));
document.getElementById("counter2").addEventListener("scroll", counter_mid(100, 124, "counter2"));

//Part 3 of counter
document.getElementById("counter3").addEventListener("scroll", counter_fast(count3, 97, "counter3"));
document.getElementById("counter3").addEventListener("scroll", counter_mid(97, 103, "counter3"));

//For getting position and animating
$(document).ready(function(){
    $(window).scroll(function(){
        var posTop = $(document).scrollTop();
        
        if (posTop >= 900){
            $(".info-9").addClass("cssanimation sequence fadeInBottom").fadeIn();
        }
        
    });
});