import React, { Component } from 'react';
import { AppRegistry, Text, View, Image, TouchableOpacity, Alert } from 'react-native';

const estilos = {
  principal: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center'
  },
  botao: {
    backgroundColor: '#538530',
    paddingVertical: 10,
    paddingHorizontal: 40,
    marginTop: 20
  },
  textoBotao: {
    color: 'white',
    fontSize: 16,
    fontWeight: 'bold'
  }
};

export default class app2 extends Component {

  gerarNovaFrase() {
    const numeroAleatorio = Math.floor(Math.random() * 5);
    const frases = [
      '"O ponto de partida de qualquer conquista é o desejo" – Napoleon Hill, assessor político',
      '"Se você está atravessando um inferno, continue atravessando" – Churchill',
      '"Não tenha medo de desistir do bom para perseguir o ótimo" – John D. Rockefeller',
      ' "Descobri que, quanto mais eu trabalho, mais sorte eu pareço ter" – Thomas Jefferson',
      ' "Oportunidades não surgem. É você que as cria" – Chris Grosser, fotógrafo'
    ];
    Alert.alert(frases[numeroAleatorio]);
  }

  render() {
    const { principal, botao, textoBotao } = estilos;
    const gerar = this.gerarNovaFrase;
    return (
      <View style={principal}>
        <Image source={ require('./imgs/logo.png') } />
        <TouchableOpacity
          onPress={gerar}
          style={botao}
        >
          <Text style={textoBotao}>Nova Frase</Text>
        </TouchableOpacity>
      </View>
    );
  }
}

AppRegistry.registerComponent('app2', () => app2);
