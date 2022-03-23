/* Inicio da função start() */
function start() { 

	$("#inicio").hide();
	
	$("#fundoGame").append("<div id='jogador' class='anima1'></div>");
	$("#fundoGame").append("<div id='inimigo1' class='anima2'></div>");
	$("#fundoGame").append("<div id='inimigo2' class=''></div>");
	$("#fundoGame").append("<div id='amigo' class='anima3'></div>");

	// Principais variáveis do jogo
	var jogo = {};
	var velocidade = 5;
	var posicaoY = parseInt(Math.random() * 334);
	var TECLA = {
		W: 87,
		S: 83,
		D: 68
	};
	var podeAtirar = true;

	jogo.pressionou = [];


	// Verifica se o usuário pressionou alguma tecla
	$(document).keydown(function(e){
		jogo.pressionou[e.which] = true;
	});

	$(document).keyup(function(e){
		jogo.pressionou[e.which] = false;
	});


	// Game Loop
	jogo.timer = setInterval(loop, 30);

	function loop() {
		moveFundo();
		moveJogador();
		moveInimigo1();
		moveInimigo2();
		moveAmigo()
	}


	// Função que movimenta o fundo do jogo
	function moveFundo() {
		esquerda = parseInt($("#fundoGame").css("background-position"));
		$("#fundoGame").css("background-position", esquerda - 1);
	} /* Final da função moveFundo() */


	/* Início da função que move o helicóptero do jogador */
	function moveJogador() {
		if (jogo.pressionou[TECLA.W]) {
			var topo = parseInt($("#jogador").css("top"));
			$("#jogador").css("top", topo - 10);

			if (topo <= 0) {
				$("#jogador").css("top", topo + 10);
			}
		}

		if (jogo.pressionou[TECLA.S]) {
			var topo = parseInt($("#jogador").css("top"));
			$("#jogador").css("top", topo + 10);

			if (topo >= 434) {
				$("#jogador").css("top",topo-10);
			}
		}

		if (jogo.pressionou[TECLA.D]) {
			disparo();
		}

	} /* Final da função que move o helicóptero do jogador */


	/* Início da função que move o helicóptero do inimigo */
	function moveInimigo1() {
		posicaoX = parseInt($("#inimigo1").css("left"));
		$("#inimigo1").css("left", posicaoX - velocidade);
		$("#inimigo1").css("top", posicaoY);

			if (posicaoX <= 0) { /* Recria a posicaoY para fazer o inimigo voltar ao inicio */
				posicaoY = parseInt(Math.random() * 334);
				$("#inimigo1").css("left", 694);
				$("#inimigo1").css("top", posicaoY);
			}
	} /* Final da função que move o helicóptero do inimigo */


	/* Início da função que move o caminhão do inimigo */
	function moveInimigo2() {
        posicaoX = parseInt($("#inimigo2").css("left"));
		$("#inimigo2").css("left", posicaoX - 3);

		if (posicaoX <= 0) {
			$("#inimigo2").css("left", 775);
		}
	} /* Final da função que move o caminhão do inimigo */


	/* Início da função que move o amigo */
	function moveAmigo() {
		posicaoX = parseInt($("#amigo").css("left"));
		$("#amigo").css("left",posicaoX+1);

		if (posicaoX>906) {
			$("#amigo").css("left",0);
		}
	} /* Final da função que move o amigo */

	/* Faz o helicóptero do jogador disparar */
	function disparo() {

		if (podeAtirar==true) {

			podeAtirar=false;

			topo = parseInt($("#jogador").css("top"))
			posicaoX = parseInt($("#jogador").css("left"))
			tiroX = posicaoX + 190;
			topoTiro = topo + 50;
			$("#fundoGame").append("<div id='disparo'></div");
			$("#disparo").css("top", topoTiro);
			$("#disparo").css("left", tiroX);

			var tempoDisparo = window.setInterval(executaDisparo, 30);

		} //Fecha podeAtirar

		function executaDisparo() {
			posicaoX = parseInt($("#disparo").css("left"));
			$("#disparo").css("left", posicaoX + 15); 

			if (posicaoX > 900) {	
				window.clearInterval(tempoDisparo);
				tempoDisparo = null;
				$("#disparo").remove();
				podeAtirar = true;

			}
		} /* Final executaDisparo() */
	} /* Fecha disparo() */


} /* Final da função start() */

