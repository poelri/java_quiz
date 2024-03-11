package ch13.Quiz03;

public class ThreadExample {
    /*
     1초에 한번씩 동영상을 재생하는 스레드와 음악을 재생하는 스레드
     */
    public static void main(String[] args) {
        Thread youtubeThread = new Thread(){
            @Override
            public void run() {
                for(int i=0;i<3;i++) {
                    System.out.println("동영상을 재생합니다.");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        };

        Thread musicThread = new Thread(){
            @Override
            public void run() {
                for(int i=0;i<3;i++) {
                    System.out.println("음악을 재생합니다.");
                    try {
                        Thread.sleep(1000
                        );
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        };
        youtubeThread.start();
        musicThread.start();
    }
}
