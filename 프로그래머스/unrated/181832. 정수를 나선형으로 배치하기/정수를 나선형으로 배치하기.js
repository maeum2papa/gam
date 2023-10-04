function solution(n) {
    var answer = [];
    var n_array = [];
    var x = 0;
    var y = 0;
    var progress = 0; //0:right, 1:down, 2:left, 3:up;
    
    for(let i=1; i<=Math.pow(n,2); i++){
        n_array.push(i);
    }
    
    for(let i=0; i<n; i++){
        var element = [];
        for(let j=0; j<n; j++){
            element.push(0);
        }
        answer.push(element);
    }
    
    
    for(const e of n_array){
        
        if(progress==0){
            
            if(answer[x][y]==0){
                answer[x][y] = e;
            }else{
                y--;
                progress = 1;
                x++;
                
                answer[x][y] = e;
                x++;
                continue;
            }
            
            if(y==(n-1)){
                progress = 1;
                x++;
            }else{
                y++;    
            }
        }else if(progress == 1){
            
            if(answer[x][y]==0){
                answer[x][y] = e;
            }else{
                x--;
                progress = 2;
                y--;
                
                answer[x][y] = e;
                y--;
                
                continue;
            }
            
            if(x==(n-1)){
                progress = 2;
                y--;
            }else{
                x++;
            }
        }else if(progress == 2){
            
            if(answer[x][y]==0){
                answer[x][y] = e;
            }else{
                y++;
                progress = 3;
                x--;
                
                answer[x][y] = e;
                x--;
                continue;
            }
            
            if(y==0){
                progress = 3;
                x--;
            }else{
                y--;
            }
            
        }else if(progress == 3){
            
            
            
            if(answer[x][y]==0){
                answer[x][y] = e;
            }else{   
                x++;
                progress = 0;
                y++;
                
                answer[x][y] = e;
                y++;
                
                continue;
            }
            
            
            
            if(x==0){
                progress = 0;
                y++;
            }else{
                x--;
            }
        }
        
    }
    
    
    return answer;
}
