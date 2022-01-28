$('.owl-carousel').owlCarousel({
    loop:true,
    margin:10,
    nav:true,
    responsive:{
        0:{
            items:1
        },
        600:{
            items:3
        },
        1000:{
            items:5
        }
    }
})


function abrirNetflix(){
    window.open("https://www.netflix.com/br/title/70177057", "_blank");
}

function abrirInformacoes(){
    window.open("https://pt.wikipedia.org/wiki/The_Walking_Dead_(s%C3%A9rie_de_televis%C3%A3o)", "_blank");
}
