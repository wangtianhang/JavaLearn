public class TestGC {
    TestGC()
    {
        System.out.println("construct testgc");
    }

    //@Override
    protected void finalize()
    {
        //super.finalize();
        System.out.println("testgc finalize");
    }
}
