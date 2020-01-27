
public class InsectPopulation {
    private double numInsect;
    public InsectPopulation(double num)
            {
                numInsect = num;
            }
    public void breed()
    {
        numInsect *=2;
    }
    public void spray()
    {
        numInsect *=0.9;
    }
    public double getNumInsect()
    {
        return numInsect;
    }
    
}
