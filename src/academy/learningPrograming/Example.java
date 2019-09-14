package academy.learningPrograming;

public class Example implements AnimalInterface {
    @Override
      public void setName(String name){
         System.out.println("string name is =" +name);
    }
      @Override
    public void setNumberOfLegs(int numberOfLegs)
    {

        System.out.println("set no of legs is =" + numberOfLegs);
    }
    @Override
    public int getNumberOfLegs() {
        return 6;
    }


    public void getNumberOfLegs(int a)
    {
        System.out.println("get no of legs is="+a );

    }

   // public void setName() {
      //  System.out.println("sarita");
    }

