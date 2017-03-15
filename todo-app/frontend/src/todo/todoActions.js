import axios from 'axios'

const URL = 'http://localhost:3003/api/todos'

export const changeDescription = (event) => ({
  type: 'DESCRIPTION_CHANGED',
  payload: event.target.value
})

export const search = () => {
  const request = axios.get(`${URL}?sort=-createdAt`)
  return {
    type: 'TODO_SEARCHED',
    payload: request
  }
}

export const add = (description) => {
  const request = axios.post(URL, { description }) // es6, se tiver variavel com o mesmo nome ele atribui
  return {
    type: 'TODO_ADDED',
    payload: request
  }
}
