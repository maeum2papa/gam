import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int success = 0;

        ArrayList<Integer> readyTrucks = new ArrayList<>();
        Queue<Integer> moveTrucks = new LinkedList<>();

        for(int truck : truck_weights){
            readyTrucks.add(truck);
        }


        for(int i=0; i<bridge_length; i++){
            moveTrucks.add(0);
        }

        int sec = 0;
        Integer pushTruck = 0;
        boolean pass = true;
        int lastTruck = 0;
        while(success < truck_weights.length){
            sec++;


            lastTruck = moveTrucks.remove();

            pushTruck = 0;
            pass = true;

            if(readyTrucks.size() != 0){
                pushTruck = readyTrucks.get(0);
                pass = checkWeight(moveTrucks, weight, pushTruck);
            }

            if(lastTruck > 0 ) success++;

            if(pass){
                moveTrucks.add(pushTruck);
                readyTrucks = updateReadyTrucks(readyTrucks);
            }else{
                moveTrucks.add(0);
            }

           
        }
        
        answer = sec;
        
        return answer;
    }
    
    //다리로 트럭 이동
    public ArrayList<Integer> updateReadyTrucks(ArrayList<Integer> readyTrucks){
        
        ArrayList<Integer> newReadyTrucks = new ArrayList<>();
        
        for(int i=0; i<readyTrucks.size(); i++){
            if(i==0) continue;
            newReadyTrucks.add(readyTrucks.get(i));
        }
        
        return newReadyTrucks;
    }
    
    //다리 무게 체크
    public boolean checkWeight(Queue<Integer> moveTrucks, int weight, Integer addTruck){
        
        int sum = 0;
        boolean result = false;
        
        for(Integer moveTruck : moveTrucks){
            sum += moveTruck;
        }
        
        if(!((sum + addTruck) > weight)){
            result = true;
        }
        
        return result;
    }
    
}
