// Object Destructuring Example
let student = {
    firstName: 'Emmanuel',
    lastName: 'Taylor',
    age: 30,
    hobbies: ['reading', 'painting', 'programming'],
    email: 'etaylor@taylor.com',
    website: 'academy.taylor.com'
}

let {firstName: fName, lastName, nickName = 'Not Provided', ...details} = student;

console.log(fName);
console.log(lastName);
console.log(nickName);
console.log(details);

// Array Destructuring Example
let arr = [10, 20, 30, 40, 50, 60, 70, 80];
let [num1, num2, , num4, num5 = 0, ...numbers] = arr;

console.log(num1);
console.log(num2);
console.log(num4);
console.log(num5);
console.log(numbers);