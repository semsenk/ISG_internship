/* 
 * 
 * EXERCISE 1
 * 
 * @returns {Promise<3>}
*/
function makePromiseResolveWith3() {
    return new Promise((resolve, reject) => {
        resolve("3");
    });
}

/**
 * 
 * EXERCISE 2
 * 
 * @returns {Promise<,"Boo!">}
 */
function makePromiseRejectWithBoo() {
    return new Promise((resolve, reject) => {
        reject("Boo!");
    });
}

/**
 * 
 * EXERCISE 3
 * 
 * @param {boolean} itShouldResolve - Whether the promise should resolve or reject
 * @returns {Promise<undefined, undefined>}
 */

function makePromiseWithConstructor(itShouldResolve) {
    return new Promise((resolve, reject) => {
        if (itShouldResolve) {
            resolve();
        } else {
            reject();
        }
    });
}

/**
 * 
 * EXERCISE 4
 *
 * @param {any} value 
 * @param {number} delayInMs 
 * @return {Promise<any>} - A promise that will resolve with the value after delayInMs milliseconds
 */
function makeDelayPromise(value, delayInMs) {
    return new Promise((resolve) => {
        setTimeout(() => {
            resolve(value);
        }, delayInMs);
    });
}

module.exports = {
    makePromiseResolveWith3,
    makePromiseRejectWithBoo,
    makePromiseWithConstructor,
    makeDelayPromise,
};

// PART 2
// (focus on using .then, .catch, .finally, .etc)

 /**
 * 
 * EXERCISE 1
 * 
 * @param {Promise} promise
 * @param {thunk} action
 * 
 */
function waitForPromise(promise, action){
    promise.then(action);
}

/**
 * 
 * EXERCISE 2
 * 
 * @param {Promise} promise 
 * @param {consumer} consumer 
 * @param {handler} handler 
 */
function consumePromise(promise, consumer, handler){
    promise.then(response => {promise.handler(response)});
}
 

module.exports = {
  waitForPromise,
  consumePromise,
};
