function add(a, b) {
    return (a + b);
}

console.log(add(1, 2));

function async_add(a, b, callback) {
    callback(a + b);
}

function print(c) {
    console.log(c);
}

async_add(1, 2, print);

arrow_add(1, 2, (c) => {
    console.log(c);
});