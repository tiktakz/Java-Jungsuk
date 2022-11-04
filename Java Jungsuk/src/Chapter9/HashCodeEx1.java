package Chapter9;

class HashCodeEx1 {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        // String클래스의 hashCode 메소드는 오버라이딩 되어서 문자열이 같으면 같은 해쉬코드를 반환하게 함
        // 하지만 객체의 주소를 가져오는 메소드에서는 다른 해쉬코드를 가져옴
        // 즉 같은 해시코드이지만 객체는 다르다
        System.out.println(str1.equals(str2));
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
    }
}
