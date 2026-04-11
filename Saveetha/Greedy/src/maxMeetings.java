public class maxMeetings {
    public static void main(String[] args) {
        int start[] = {1,3,0};
        int end[] = {2,4,6};
        int count = 1;
        int prevend = end[0]; // 2
        for (int i=1;i< start.length;i++){
            if (start[i] >= prevend){
                count++; // 2
                prevend = end[i];
            }
        }
        System.out.println("Meetings : " + count);
    }
}
