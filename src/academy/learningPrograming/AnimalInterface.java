package academy.learningPrograming;

public interface AnimalInterface {
   // public static final
    int  DEFAULT_TAIL_LENGTH=2;
    void setName(String name);
    void setNumberOfLegs(int numberOfLegs);
    // abstract
    int getNumberOfLegs();
     void getNumberOfLegs(int a);
}
