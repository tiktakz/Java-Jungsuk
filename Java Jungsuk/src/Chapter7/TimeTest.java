package Chapter7;

class TimeTest {
    public static void main(String[] args) {
        Time t = new Time(12,35,00);
        System.out.println(t);
        // t.hour=13;  private이므로 접근 불가하다. 게터와 세터를 통해 조작
        t.setHour(t.getHour()+1);
        System.out.println(t);
    }    
}

class Time {
    private int hour, minute, second; // 시간은 함부로 조정하면 안되니까 private 제어자

    Time (int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    // private으로 생성된 변수 조작 - getters and setters
    public int getHour() { return hour; }
    public void setHour(int hour) {
        if (hour <0 || hour>23) {
            return;
        }
        this.hour = hour;
    }

    public int getMinute() { return minute; }
    public void setMinute(int minute) {
        if (minute<0 || minute>59) {
            return;
        }
        this.minute = minute;
    }

    public int getSecond() { return second; }
    public void setSecond(int second) {
        if (second<0 || second>59) {
            return;
        }
        this.second = second;
    }

    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}
