
class InsectPopulationTester
{
    public static void main(String[] args) 
    {
        InsectPopulation popu = new InsectPopulation(10);
        popu.breed();
        popu.spray();
        System.out.println(popu.getNumInsect());
        popu.breed();
        popu.spray();
        System.out.println(popu.getNumInsect());
        popu.breed();
        popu.spray();
        System.out.println(popu.getNumInsect());
    }
}