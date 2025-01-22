package Company_6_Goldman_sachs;

public class Find_Consecutive_Integers_From_A_Data_Stream {
    class DataStream {
        int value ;
        int k;
        int count;
        public DataStream(int value, int k) {
            this.value = value;
            this.k = k;
        }

        public boolean consec(int num) {
            if(value == num){
                count++;
            }else{
                count = 0;
            }
            return count >= k;
        }
    }
}
