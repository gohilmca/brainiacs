var line = require('readline'); //Enable readline module
var rl = line.createInterface(process.stdin, process.stdout);

var brainiacs = {
    name: '',
    saying: []
};

rl.question("Hey Braniac, What is your name?", function (answer){
    
    brainiacs.name = answer;
    rl.setPrompt(`So  ${brainiacs.name}, what you want to say? `);
    rl.prompt();

    rl.on('line', function(saying){
        brainiacs.saying.push(saying.trim());
        if (saying === 'exit'){
            rl.close();
        }else{
            rl.setPrompt(`what else ${brainiacs.name} wants to say? ('exit' for leave)`)
            rl.prompt();
         }
    });
    
});

rl.on('close', function(){
    console.log("%s is real BRANIAC that says %j", brainiacs.name, brainiacs.saying);
    // Above %j use to make JSON strig
    process.exit();
});