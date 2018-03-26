var http = require("http"); // Get Http modue
var data = require("./data/inventory"); // Get JSON data from file in data variable

/**
 * Create Server which listen on Port 3000
 */
http.createServer(function(req, res){
    if(req.url === "/"){
        res.writeHead(200, {"content-type":"text/json"});
        res.end(JSON.stringify(data));
    }else if (req.url === "/getin"){
        getInStock(res);
    }else if(req.url === "/getback"){
        getOnBackOrder(res);
    }else{
        res.writeHead(404, {"content-type":"text/plain"});
        res.end("Ooops data not found");
    }
}).listen(3000);

console.log("Server lsten on 3000");
console.log(`
**********************
Hit URL on Browser: http://localhost:3000/ for get All JSON data from inventory file
Hit URL on browser: http://localhost:3000/getin for get In Stock data from inventory file
Hit URL on browser: http://localhost:3000/getback for get Back order Stock data from inventory file
**********************`)
/**
 * Filter JSON and get only In Stock order.
 */
function getInStock(res){

    var instock = data.filter(function(items){
        return items.avail === "In stock";
    });
    res.writeHead(200, {"content-type":"text/json"});
    res.end(JSON.stringify(instock));
}

/**
 * Filter JSON data and get only back order data
 * @param {response} res 
 */
function getOnBackOrder(res){

    var notinstock = data.filter(function(items){
        return items.avail === "On back order";
    });
    res.writeHead(200, {"content-type":"text/json"});
    res.end(JSON.stringify(notinstock));
}