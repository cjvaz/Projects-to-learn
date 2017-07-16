import React, { Component } from 'react';
import {
  AppRegistry,
  Text,
  Button,
  View
} from 'react-native';

export default class app1 extends Component {
  
  gerarNumeroAleatorio() {
    const numeroAleatorio = Math.floor(Math.random() * 10)
    alert(numeroAleatorio)
  }

  render() {
    const z = this.gerarNumeroAleatorio
    return (
      <View>
        <Text>Gerador de número randômicos!</Text>
        <Button title="Gerar um número randômico"
        onPress={z}
        />

      </View>
    );
  }
}

AppRegistry.registerComponent('app1', () => app1);
