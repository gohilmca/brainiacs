var http = require('http'); // add http module
/**
 * Serer object is created which will say Hello Braniac
 */
var server  = http.createServer(function(req, res){
    res.writeHead(200, {'Content-type':'text/plain'});
    res.end('Hello Braniac');
});
// Server will run on 3000 localhost port
server.listen(3000);

console.log('server listening on 3000 go to browser and type http//localhost:3000/');
