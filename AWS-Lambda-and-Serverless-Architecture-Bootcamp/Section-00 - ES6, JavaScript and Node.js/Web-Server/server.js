const express = require('express');
const bodyParser = require('body-parser');
const app = express();

app.use(bodyParser.json());
app.use(express.static(__dirname + '/public'));

// Get Request Example.
app.get('/', (req, res) => {
    res.send("Hello Express!");
});

// Post request. Test with Postman.
app.post('/hello', (req, res) => {
    let body = req.body;
    body.message = "Hello " + body.name;
    res.json(body);
})

// Start Webserver.
app.listen(3000, () => {
    console.log("Server listening on port 3000!");
});