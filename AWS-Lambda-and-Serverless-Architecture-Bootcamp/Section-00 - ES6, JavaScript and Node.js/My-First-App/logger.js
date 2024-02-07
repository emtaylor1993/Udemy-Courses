function log(message) {
    console.log(message);
}

// Allows log to be accessed by other files in the project
module.exports = {
    log: log
}