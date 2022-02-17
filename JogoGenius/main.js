let order = [];
let clickedOrder = [];
let score = 0;

/* 0 - verde 1 - vermelho 2 - amarelo 3 - azul */
const verde = document.querySelector(".verde");
const amarelo = document.querySelector(".amarelo");
const azul = document.querySelector(".azul");
const vermelho = document.querySelector(".vermelho");

// Cria ordem das cores
let alternaOrdem = () => {
    let colorOrder = Math.floor(Math.random() * 4);
    order[order.length] = colorOrder;
    clickedOrder = [];

    for(let i in order){
        let elementColor = createColorElement(order[i]);
        lightColor(elementColor, Number(i) + 1);
    }
};

// Acende a próxima cor
let lightColor = (element, number) => {
    number = number * 500;
    setTimeout( () => {
        element.classList.add('selecionado');
    }, number - 250);
    setTimeout( () => {
        element.classList.remove('selecionado');
    });
};


// Checa se os botões clicados são os mesmos da ordem gerada
let checkOrder = () => {
    for(let i in clickedOrder){
        if(clickedOrder[i] != order[i]){
            gameOver();
            break;
        }
    }
    if (clickedOrder.length == order.length){
        alert(`Pontuação: ${score}\nVocê acertou!`);
        nextLevel();
    }
};


// Clique do player
let click = (color) => {
    clickedOrder[clickedOrder.length] = color;
    createColorElement(color).classList.add('selecionado');

    setTimeout( () => {
        createColorElement(color).classList.remove('selecionado');
        checkOrder();
    }, 250);
};


// Retorna a cor com base no valor pre-estabelecido
let createColorElement = (color) => {
    if(color == 0){
        return verde;
    }else if( color == 1){
        return amarelo;
    }else if( color == 2){
        return azul;
    }else if( color == 3){
        return vermelho;
    }
};

// Próximo nível do jogo
let nextLevel = () => {
    score++;
    alternaOrdem();
};

// Game Over | Inicia novamente
let gameOver = () => {
    alert(`\nVocê perdeu! \nPontuação: ${score-1} \n
        Clique em OK para iniciar um novo jogo. \n`);
    order = [];
    clickedOrder = [];

    playGame();
};


// Inicia o jogo com pontuação zerada
let playGame = () => {
    alert(`\nBem vindo ao Genius Game! \n\n 
            Clique em OK para iniciar`);
    score = 0;

    nextLevel();
};


// Eventos dos clique nas cores
verde.onclick = () => click(0);
vermelho.onclick = () => click(1);
amarelo.onclick = () => click(2);
azul.onclick = () => click(3);


playGame();
