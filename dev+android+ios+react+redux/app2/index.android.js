import React, { Component } from 'react';
import { AppRegistry, Text, View } from 'react-native';

const estilos = {
  estiloTexto: {
    fontSize: 30,
    backgroundColor: '#08509B',
    height: 60,
    width: 60
  },
  estiloTexto2: {
    fontSize: 30,
    backgroundColor: '#2A48FA',
    height: 60,
    width: 60
  },
  estiloView: {
    backgroundColor: 'skyblue',
    height: 300,
    justifyContent: 'center',
    alignItems: 'center',
    flexDirection: 'column'
  }
};

export default class app2 extends Component {
  render() {
    return (
      <View style={estilos.estiloView}>
        <Text style={estilos.estiloTexto}>A</Text>
        <Text style={estilos.estiloTexto2}>B</Text>
      </View>
    );
  }
}

AppRegistry.registerComponent('app2', () => app2);
