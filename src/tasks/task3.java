package tasks;

public class task3 {
    public static void even () {

        for (int i = 2; i < 1000; i++){
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if(i%j == 0) flag = false;
            }
            if (flag == true) {
                System.out.println(i);
            }
        }
    }
}
