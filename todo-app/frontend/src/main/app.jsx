import 'modules/bootstrap/dist/css/bootstrap.min.css'
import 'modules/font-awesome/css/font-awesome.min.css'

import React from 'react'
import Menu from  '../template/menu'
import Routes from './routes'
import TodoForm from '../todo/todoForm'
import TodoList from '../todo/todoList'

export default props => (
  <div className='container'>
    <Menu />
    <Routes />
    <TodoForm />
    <TodoList />
  </div>
)