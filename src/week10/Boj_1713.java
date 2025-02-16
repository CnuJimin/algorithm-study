package week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj_1713 {
    //후보 추천하기
    /*
    * 막히는 부분 처음 후보 세명을 어떻게 배열에 넣을 것인가
    * 배열 자료구조를 사용하는 것이 맞는지
    * 배열 자료구조를 사용하지 않는다면, 학생을 교체할 때 어떤 방법을 사용해야하는지(인덱스로 접근하는 것 이외의 방법이 존재하는가?)
    * 사진틀에서 학생을 제거할 때 사용하기 위한 학생 투표 배열을 만들어야하는가?
    * 학생이 먼저 게시되었다는 것을 어떻게 파악할 수 있는가, 어떤 자료구조를 사용해야 파악할 수있는가?
    * */
    static int queue_count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        List<Student> frame = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            int student = Integer.parseInt(st.nextToken());

            boolean isPosted = false;

            for (Student s : frame) {
                if (s.num == student) {
                    s.votes ++;
                    isPosted = true;
                    break;
                }
            }

            if (!isPosted) {
                if (frame.size() == N) {
                    Collections.sort(frame);
                    Student remove = frame.remove(0);
                    remove.votes = 0;
                }
                frame.add(new Student(student, 1, i));
            }
        }

        Collections.sort(frame, (a, b) -> a.num - b.num);
        for (Student s : frame) {
            System.out.print(s.num + " ");

        }


    }

    static class Student implements Comparable<Student> {
        int num;
        int votes;
        int time;

        public Student(int num, int votes, int time) {
            this.num = num;
            this.votes = votes;
            this.time = time;
        }

        @Override
        public int compareTo(Student o) {
            if (this.votes == o.votes) {
                return this.time - o.time;
            }
            return this.votes - o.votes;
        }
    }
}
