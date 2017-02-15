let codigo = 'GWZ-JJ-12';

class valida {

	_valida(codigo, regex) {
	    if(regex.test(codigo)) {
	        return true;
	    } else {
	        return false;;
	    }
	}

	validaCodigo(codigo) {
		regex = /\D{3}-\D{2}-\d{2}/;
		if(_valida(codigo,regex))
			alert('Código válido!');
      	} else {
        	alert('Código inválido');
      	}
	}
}


// resolução do instrutor do curso

// modo orientado a objeto

/*
  Vou criar uma classe que representa um código e encapsular a regra
  de que o código deve ter determinado formato. Realizarei a validação
  no construtor da classe. Se o código for inválido, nenhum objeto 
  será instanciado e o programador ainda receberá uma mensagem de 
  erro o alertando do problema. Isto é, independente do lugar que 
  eu tenha uma instância de Codigo todo código criado será validado!
*/

class Codigo {

    constructor(texto) {

        if(!this._valida(texto)) throw new Error(`O texto ${texto} não é um código válido`);
        this._texto = texto;        
    }

    _valida(texto) {

        return /\D{3}-\D{2}-\d{2}/.test(texto);
    }

    get texto() {

        return this._texto;
    }
}

let codigo1 = new Codigo('GWZ-JJ-12'); // válido
console.log(codigo1.texto);
let codigo2 = new Codigo('1X1-JJ-12'); // inválido
console.log(codigo2.texto);