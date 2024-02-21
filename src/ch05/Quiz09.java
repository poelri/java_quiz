package ch05;

public class Quiz09 {
    public static void main(String[] args) {
        /*
        주어진 배열 항목의 전체 합과 평균을
        구해 출력하는 코드를 작성해보세요(힌트: 중첩 for 문 이용)
            int[][] array = {
                  {95, 86},
                  {83, 92, 96},
                  {78, 83, 93, 87, 88}
            };


        int totalStudent = 0; //전체 학생수
        int totalSum = 0; // 전체 학생의 점수 합계

        for (int i = 0; i < scores.length ; i++) { // 반의 갯수 만큼 반복
            totalStudent += scores[i].length; // 1반, 2반의 전체 학생수를 더한다.

            for (int j = 0; j < scores[i].length; j++) { // 해당 반의 학생 수만큼 반복
                totalSum += scores[i][j]; // 학생 점수 합산


            }
        }

        double totalAvg =(double) totalSum / totalStudent;
        System.out.println("전체 학생의 평균 점수 : " + totalAvg);
    }
         */
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        int sum = 0;
        double avg = 0.0;

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j]; // 배열 원소를 하나씩 가져와서 누적합산
            }
            count += array[i].length;
        }
        avg = (double)sum / count;

        System.out.println("합: " + sum + ", " + "평균: " + avg);
    }
}
