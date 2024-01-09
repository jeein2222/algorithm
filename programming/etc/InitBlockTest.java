package programming.etc;

public class InitBlockTest {
    public static void main(String[] args) {
        System.out.println(InitBlock2.classVar);
        InitBlock2 myInit = new InitBlock2();
        System.out.println(myInit.instanceVar);
    }
}

class InitBlock2{
    static int classVar = 10;
    int instanceVar=10;

    static {classVar =20;}

    {instanceVar=20;}

    InitBlock2() {
        instanceVar = 30;
    }

}