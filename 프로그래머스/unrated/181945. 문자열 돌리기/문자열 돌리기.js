const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];

rl.on('line', function (line) {
    input = [line];
}).on('close',function(){
    str = input[0];
    if(1<=str.length && str.length <=10){
        for(i=0; i<str.length; i++){
            s = str.substr(i,1);
            console.log(s);
        }
    }
});