import React, { Component } from 'react';
import {
  AppRegistry,
  Button,
  Text,
  View
} from 'react-native';

//const styles = {
//});

export default class app3 extends Component {

  constructor(props) {
    super(props);
    this.state = { escolhaUsuario: '', escolhaComputador: '' };
  }

  jokenpo(escolhaUsuario) {
    // gera número aleatório (0,1,2)
    const numAleatorio = Math.floor(Math.random() * 3);
    let escolhaComputador = '';
    switch (numAleatorio) {
      case 0: escolhaComputador = 'pedra'; break;
      case 1: escolhaComputador = 'papel'; break;
      case 2: escolhaComputador = 'tesoura'; break;
      default: escolhaComputador = ''; break;
    }
    this.setState({ escolhaUsuario, escolhaComputador });
  }

  render() {
    return (
      <View>
        <Text>Escolha do computador: { this.state.escolhaComputador }</Text>
        <Text>Escolha do usuário: { this.state.escolhaUsuario }</Text>
        <Text>Resultado</Text>
        <Button title="pedra" onPress={() => { this.jokenpo('pedra')}} />
        <Button title="papel" onPress={() => { this.jokenpo('papel')}} />
        <Button title="tesoura" onPress={() => { this.jokenpo('tesoura')}} />
      </View>
    );
  }
}

AppRegistry.registerComponent('app3', () => app3);
