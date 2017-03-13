import React from 'react'
import { childrenWithProps } from '../utils/reactUtils'
 // usando o operador spread evita passar referencias, e sim um clone das propriedades

export default props => (
  <div>
    <h1>Familia</h1>
    { childrenWithProps(props.children, props) }
  </div>
)
