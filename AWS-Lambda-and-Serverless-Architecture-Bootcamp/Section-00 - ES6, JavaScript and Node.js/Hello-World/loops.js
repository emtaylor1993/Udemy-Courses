var i = 0;
var limit = 5;

// While loop example.
while (i < limit) {
    console.log(i);
    i++;
}

console.log();
i = 0;

// Do while loop eaxample.
do {
    console.log(i);
    i++;
} while (i < limit);

console.log();
i = 0;

// For loop example.
for (i = 0; i < limit; i++) {
    console.log(i);
}

console.log();

// For each loop example.
var arr = [10, 20, 30];
arr.forEach(function(item) {
    console.log(item);
})

// For each loop example alternative.
console.log();
for (var i of arr) {
    console.log(i);
}