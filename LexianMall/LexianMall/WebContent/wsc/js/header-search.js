/**
 * Created by LHCHacker on 2015/9/11.
 */
$(function(){
    $(".search-menu").hide();
    $("#menu_btn").click(function(){
        $(".search-menu").toggle();
    });
    $("#index").click(function(){
        location.href="index.html";
    });
    $("#categories").click(function(){
        location.href="categories.html";
    });
    $("#cart").click(function(){
        location.href="cart.html";
    });
    $("#home").click(function(){
        location.href="home.html";
    });
});