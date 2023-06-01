var count7 = 0, count8 = 0, count9 = 0;

//Counter functions
function counter_fast(cnt, n, id){

    setInterval(function(){
    if (cnt < n){
        cnt++;
        document.getElementById(id).innerText = cnt;
    }
    } ,1);

}

function counter_mid(cnt, n, id){
    setInterval(function(){
    if (cnt <= n){
        cnt++;
        document.getElementById(id).innerText = cnt;
    }
},120);
}

document.getElementById("counter7").addEventListener("scroll", counter_fast(count7, 25, "counter7"));
document.getElementById("counter7").addEventListener("scroll", counter_mid(25, 35, "counter7"));


document.getElementById("counter8").addEventListener("scroll", counter_fast(count8, 20, "counter8"));
document.getElementById("counter8").addEventListener("scroll", counter_mid(20, 31, "counter8"));

document.getElementById("counter9").addEventListener("scroll", counter_fast(count9, 7, "counter9"));
document.getElementById("counter9").addEventListener("scroll", counter_mid(7, 14, "counter9"));

//For getting position and animating
//<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
//.drag-eng, #astro-text; 1100, 2000


$(document).ready(function(){
    $(window).scroll(function(){
        var posTop = $(document).scrollTop();
        //console.log(posTop) //&&(posTop <=1600);
        if (posTop >= 1000){
            $("#astro-text").addClass("cssanimation sequence fadeInBottom").fadeIn();
        }
        
        if (posTop >= 1800){
            $(".drag-eng").addClass("cssanimation sequence fadeInBottom").fadeIn();
        }
        
    });
});