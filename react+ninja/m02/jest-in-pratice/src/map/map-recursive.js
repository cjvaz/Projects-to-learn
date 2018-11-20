"use strict";

const map = (arr = [], func = item => item) => {

  if (!Array.isArray(arr)) {
    throw new TypeError("The first parameter must be an array");
  }

  if (typeof func !== "function") {
    throw new TypeError("The second parameter must be a function");
  }

  let counter = 0
  const mapInternal = (arrayInternal) => {
    if(arrayInternal.length === 0) {
      return []
    }

    const [head, ...tail] = arrayInternal
    return [func(head, counter++, arr)].concat(mapInternal(tail, func))
  }

  return mapInternal(arr)

}

export default map;
