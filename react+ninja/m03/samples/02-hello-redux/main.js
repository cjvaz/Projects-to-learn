'use strict'

const counter = (state = 0, action) => {
  switch(action.type) {
    case 'INCREMENT': return state + 1;
    case 'DECREMENT': return state - 1;
  }
  return state;
}

const { createStore } = Redux;
const store = createStore(counter);

console.log(store.getState());

store.dispatch({ type: 'INCREMENT'});
console.log(store.getState());

store.subscribe(() => {
  console.log('disparou uma ação!');
})

store.dispatch({ type: 'INCREMENT'});
console.log(store.getState());

store.dispatch({ type: 'DECREMENT'});
console.log(store.getState());
