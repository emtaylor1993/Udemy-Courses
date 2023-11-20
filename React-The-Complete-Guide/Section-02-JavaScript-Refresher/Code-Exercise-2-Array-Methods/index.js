/*
 * Exercise: Array Methods
 * @author Emmanuel Taylor
 * 
 * This code takes an array of numbers and transforms it into an
 * array of Objects.
 * 
 * @functions
 *      transformToObjects
 * 
 */

function transformToObjects(numberArray) {
    const objects = [];
    
    for (let i = 0; i < numberArray.length; i++) {
        const obj = {
            val: numberArray[i]
        };
        
        objects.push(obj);    
    }
    
    return objects;
}