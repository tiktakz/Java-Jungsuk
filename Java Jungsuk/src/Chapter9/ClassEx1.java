package Chapter9;

class ClassEx1 {
    public static void main(String[] args) throws Exception{
        CardTest c = new CardTest("HEART", 3); // new 객체생성
        CardTest c2 = CardTest.class.newInstance(); // Class객체를 통해 생성
        
        Class cObj = c.getClass();

        System.out.println(c);
        System.out.println(c2);
        System.out.println(cObj.getName());
        System.out.println(cObj.toGenericString());
        System.out.println(cObj.toString());
    }
}
