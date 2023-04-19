package thuchanh4;

class StudentImpl extends People implements Student {


    public StudentImpl(String name, int age, boolean gender) {
        super(name, age, gender);
    }


    @Override
    public void eat() {
        System.out.println("eatinggg....");
    }
    @Override
    public void sleep(){
        System.out.println("kkkkkkk");
    }
    @Override
    public void study(){
        System.out.println("oooooooo");
    }


    @Override
    public void registerCourse(String course) {
        System.out.println(".....");
    }


    @Override
    public void attendClass() {
        System.out.println("k1k1k1");
    }

}


