var http = require("http"); // Get HTTP module
var fs = require("fs"); // Get File System module

/**
 * Create Web server and handle GET and POST requests
 */
http.createServer(function(req, res){

    if(req.method === "GET"){
        res.writeHead(200, {"content-type":"text/html"});
        // Create Read stream from HTML file and pipe or transfer it to response object to show on Browser
        fs.createReadStream("./data/form.html","UTF-8").pipe(res);
    }else if(req.method === "POST"){
        var body = "";
        /**
         * Set req data in body Object
         */
        req.on('data', function(chunk){
            body += chunk;
        });

        /**
         * Write response on Browser
         */
        req.on('end', function(){
            res.writeHead(200, {"content-type":"text/plain"});
            res.end(`Your response: ${body}`);
        });
    }

}).listen("3000");

console.log("Server listens on 3000 Port. Open Browser and hit http://localhost:3000");